grammar trabalho;
options {
	language=Java;
	backtrack=true;
}
@header {
	import java.util.HashMap;
}
@members {
	String s;
	HashMap<String, Integer> memory = new HashMap<String, Integer>();
}

prog 	:	comandos EOF;

comandos:	(comando';')+ | comando | ;

comando:	atribuicao|teste|iteracao;
    
atribuicao:	VAR ':=' expr {
			memory.put($VAR.text, $expr.value);
			System.out.println("Variavel = " + $VAR.text);
			System.out.println("Valor = " +$expr.value);
		};

teste	:	('if' exprRela 'then' comandos)|('if' exprRela 'then' comandos 'else' comandos );

iteracao:	'while' exprRela 'do' comandos;

exprRela:	expr('='|'<>'|'<'|'>'|'<='|'>=')expr;

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
	:	d=fator {
			$value += $d.value;
		}
			(SECOND_OP e=fator {
				if ($SECOND_OP.text.equals("*")) $value *= $e.value;
				else $value /= $e.value;
			})*
	;

fator	returns [int value]
	:	 VAR {
			$value = 0;
			if (memory.containsKey($VAR.text)) $value = (Integer)memory.get($VAR.text);
			else System.err.println("Undefined variable " + $VAR.text);
		}
		| e=num { $value = $e.value; } 
		| '(' e=expr ')' { $value = $e.value; };

    
num returns [int value]
	:	DIGITOS d=fracao? {
			//$value = Integer.parseInt($DIGITOS.text + $d.value + $e.value);
			$value = Integer.parseInt($DIGITOS.text); // ALTERAR AQUII
		}
	;

fracao	returns [String value]
	:	'.'DIGITOS { $value = ("." + $DIGITOS.text); }
	;

FIRST_OP:	('+'|'-');
SECOND_OP
	:	('*'|'/');
//expoente:	'E'('+'|'-')?DIGITOS;
DIGITOS	:	('0'..'9')+;
VAR :           ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9')*;
WS:             (' '|'\n'|'\r')+ {skip();};


