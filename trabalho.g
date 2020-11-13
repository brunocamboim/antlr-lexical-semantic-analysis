grammar trabalho;
options {
	language=Java;
	//backtrack=true;
}
@header {
	import java.util.HashMap;
}
@members {
	String s;
	HashMap<String, Integer> memory = new HashMap<String, Integer>();
}

parse	: 	block EOF ;
 
block	:	comando*;

comando	:	atribuicao | teste | iteracao;
    
atribuicao
	:		
		VAR ATRIB expr SEMICOLON {
			memory.put($VAR.text, $expr.value);
			System.out.println("Variavel = " + $VAR.text);
			System.out.println("Valor = " +$expr.value);
		}
	;
	
teste	: 	('if ' exprRela 'then' comando teste_else);
 	
teste_else	
	: 
		('else' comando)
		|
	;

iteracao:	'while' exprRela 'do' comando;

exprRela returns [boolean value]
	:	d=expr COMP_OP e=expr {
			if ($COMP_OP.text.equals("=")) $value = ($d.value == $e.value);
			else if ($COMP_OP.text.equals("!=")) $value = $d.value != $e.value;
			else if ($COMP_OP.text.equals("<")) $value = $d.value < $e.value;
			else if ($COMP_OP.text.equals(">")) $value = $d.value > $e.value;
			else if ($COMP_OP.text.equals("<=")) $value = $d.value <= $e.value;
			else if ($COMP_OP.text.equals(">=")) $value = $d.value >= $e.value;
			else System.err.println("Occurred some errors to compare values");
		}
	;

expr	returns [int value]
	:	
		d=termo { 
			$value += $d.value;
		} 
		(FIRST_OP e=termo {
			if ($FIRST_OP.text.equals("+")) $value += $e.value;
			else $value -= $e.value;
		})*
	;

termo	returns [int value]
	:	
		d=fator {
			$value += $d.value;
		}
		(SECOND_OP e=fator {
			if ($SECOND_OP.text.equals("*")) $value *= $e.value;
			else $value /= $e.value;
		})*
	;

fator	returns [int value]
	:	 
		VAR {
			$value = 0;
			if (memory.containsKey($VAR.text)) $value = (Integer)memory.get($VAR.text);
			else System.err.println("Undefined variable " + $VAR.text);
		}
		| e=num { $value = $e.value; } 
		| L_PAREN e=expr R_PAREN { $value = $e.value; }
	;

    
num returns [int value]
	:	
		DIGITOS d=fracao? {
			//$value = Integer.parseInt($DIGITOS.text + $d.value + $e.value);
			$value = Integer.parseInt($DIGITOS.text); // ALTERAR AQUII
		}
	;

fracao	returns [String value]
	:	
		'.'DIGITOS { $value = ("." + $DIGITOS.text); }
	;

FIRST_OP:	('+'|'-');

SECOND_OP
	:	('*'|'/');
	
//expoente:	'E'('+'|'-')?DIGITOS;

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

