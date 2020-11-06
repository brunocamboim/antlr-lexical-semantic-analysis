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
    
atribuicao:	VAR ':=' exprArit {
			memory.put($VAR.text, $exprArit.value);
			System.out.println("Variavel = " + $VAR.text);
			System.out.println("Valor = " +$exprArit.value);
		};

teste	:	('if' exprRela 'then' comandos)|('if' exprRela 'then' comandos 'else' comandos );

iteracao:	'while' exprRela 'do' comandos;

exprRela:	exprArit('='|'<>'|'<'|'>'|'<='|'>=')exprArit;

exprArit returns [int value]
	:       VAR op e=exprArit {
			$value = 0;
			if (memory.containsKey($VAR.text)) $value = (Integer)memory.get($VAR.text);
			else System.err.println("Undefined variable " + $VAR.text);

			if ($op.text.equals("/")) $value /= $e.value;
			else if ($op.text.equals("*")) $value *= $e.value;
			else if ($op.text.equals("+")) $value += $e.value;
			else if ($op.text.equals("-")) $value -= $e.value;
			else System.err.println("Occurred some errors");
			
		} 
		| d=num op e=exprArit {
			if ($op.text.equals("/")) $value = $d.value / $e.value;
			else if ($op.text.equals("*")) $value = $d.value * $e.value;
			else if ($op.text.equals("+")) $value = $d.value + $e.value;
			else if ($op.text.equals("-")) $value = $d.value - $e.value;
			else System.err.println("Occurred some errors");
		}
		| e=num { $value = $e.value; } 
		| VAR {
			$value = 0;
			if (memory.containsKey($VAR.text)) $value = (Integer)memory.get($VAR.text);
			else System.err.println("Undefined variable " + $VAR.text);
		}
		| '(' e=exprArit ')'  { $value = $e.value; }
	;
    
num returns [int value]
	:	DIGITOS d=fracao? expoente? {
			//$value = Integer.parseInt($DIGITOS.text + $d.value + $e.value);
			$value = Integer.parseInt($DIGITOS.text + $d.value); // ALTERAR AQUII
		}
	;

fracao	returns [String value]
	:	'.'DIGITOS { $value = ("." + $DIGITOS.text); }
	;

expoente:	'E'('+'|'-')?DIGITOS;

DIGITOS	:	('0'..'9')+;
VAR :           ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9')*;
WS:             (' '|'\n'|'\r')+ {skip();};
op	:	('*'|'/'|'+'|'-');
