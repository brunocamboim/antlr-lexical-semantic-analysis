grammar trabalho;
options {
	language=Java;
}
@header {
	import java.util.HashMap;
	import java.util.Map;
	import java.util.Iterator;
}
@members {
	String s;
	HashMap<String, Double> memory = new HashMap<String, Double>();
	boolean considerThisBlock = true;
}

parse	: 	block {
			System.out.println("\n\n Logs das variáveis\n\n");
			for (Map.Entry<String, Double> entry : memory.entrySet()) {
		            	String key = entry.getKey();
		            	double value = entry.getValue();
		            	System.out.println("Variavel: " + key + " - Valor: " + value);
		        }
			
		} EOF ;
 
block	:	comando*;

comando	:	atribuicao | teste | iteracao;
    
atribuicao
	:		
		VAR ATRIB expr SEMICOLON {
			if(considerThisBlock){
				memory.put($VAR.text, $expr.value);
				System.out.println("Valor "+$expr.value+" atribuido a variavel "+$VAR.text);
			}			
		}
	;
	
teste	: 	('if ' exprRela 'then' comando+ 
			{considerThisBlock=!considerThisBlock;} teste_else {considerThisBlock=!considerThisBlock;});
 	
teste_else	
	: 
		'else' comando+;

iteracao:	'while' exprRela 'do' comando+;

exprRela:
	d=expr COMP_OP e=expr {
		if(considerThisBlock){
			if ($COMP_OP.text.equals("=")){
				considerThisBlock = ($d.value == $e.value);
				System.out.print("Comparação de igualdade entre "+$d.value+" e "+$e.value);
			}else if($COMP_OP.text.equals("!=")){
				 considerThisBlock = $d.value != $e.value;
				 System.out.print("Comparação de diferença entre "+$d.value+" e "+$e.value);
			}else if ($COMP_OP.text.equals("<")){
				 considerThisBlock = $d.value < $e.value;
				 System.out.print("Comparação de menor entre "+$d.value+" e "+$e.value);
			}else if ($COMP_OP.text.equals(">")){
				 considerThisBlock = $d.value > $e.value;
				 System.out.print("Comparação de maior entre "+$d.value+" e "+$e.value);
			}else if ($COMP_OP.text.equals("<=")){
				 considerThisBlock = $d.value <= $e.value;
				 System.out.print("Comparação de menor igual entre "+$d.value+" e "+$e.value);
			}else if ($COMP_OP.text.equals(">=")){
				 considerThisBlock = $d.value >= $e.value;
				 System.out.print("Comparação de maior igual entre "+$d.value+" e "+$e.value);
			}
			System.out.println(" | Resultado -> "+considerThisBlock);
		}		
	}
	;

expr	returns [double value]
	:	
		d=termo { 
			$value += $d.value;
		} 
		(FIRST_OP e=termo {
			if ($FIRST_OP.text.equals("+")) $value += $e.value;
			else $value -= $e.value;
		})*
	;

termo	returns [double value]
	:	
		d=fator {
			$value += $d.value;
		}
		(SECOND_OP e=fator {
			if ($SECOND_OP.text.equals("*")) $value *= $e.value;
			else $value /= $e.value;
		})*
	;

fator	returns [double value]
	:	 
		VAR {
			$value = 0;
			if (memory.containsKey($VAR.text)) {
				$value = memory.get($VAR.text);
			}else {
				System.out.println("Undefined variable " + $VAR.text);
			}
		}
		| e=num { $value = $e.value; } 
		| L_PAREN e=expr R_PAREN { $value = $e.value; }
	;

    
num returns [double value]
	:	
		DIGITOS d=fracao? {
			$value = Double.parseDouble($DIGITOS.text); 
		}
	;

fracao	returns [String value]
	:	
		'.'DIGITOS { $value = ("." + $DIGITOS.text); }
	;

FIRST_OP:	('+'|'-');

SECOND_OP
	:	('*'|'/');

DIGITOS	:	('0'..'9')+;
	
UNDER_SCORE 
	:	 '_';
	
VAR 	:       ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9')*;

WS	:	(' '|'\n'|'\t'|'\r'|'\cr')+ {skip();} ; 

COMP_OP	:	('='|'!='|'<'|'>'|'<='|'>=');

ATRIB 	: 	':=';

L_PAREN	: 	'(';

R_PAREN	: 	')';

L_BRACKET
	: 	'{';

R_BRACKET
	: 	'}';

L_SQUARE: 	'[';

R_SQUARE: 	']';

COMMA	: 	',';

SEMICOLON
	: 	';';

FallThrough
@after{
  	throw new RuntimeException(String.format(
      		"Caractere ilegal reconhecido na linha \%d, coluna \%d: '\%s'",
      		getLine(), getCharPositionInLine(), getText()
	));
}
  :  .
  ;
