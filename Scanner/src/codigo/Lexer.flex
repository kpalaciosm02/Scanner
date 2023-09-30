package codigo;
import static codigo.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ \t\r\n]+
Exponente = [eE] [\+\-]? 0|[1-9][0-9]*
%{
    public String lexeme;
%}
%%
"ARRAY" | 
"BEGIN" | 
"BOOLEAN" | 
"BYTE" | 
"CASE" | 
"CHAR" | 
"CONST" | 
"DO" | 
"DOWNTO" | 
"ELSE" | 
"END" | 
"FALSE" | 
"FILE" | 
"FOR" | 
"FORWARD" | 
"FUNCTION" | 
"GOTO" | 
"IF" | 
"IN" | 
"INLINE" | 
"INT" | 
"LABEL" | 
"LONGINT" | 
"NIL" | 
"OF" | 
"PACKED" | 
"PROCEDURE" | 
"PROGRAM" | 
"READ" | 
"REAL" | 
"RECORD" | 
"REPEAT" | 
"SET" | 
"SHORTINT" | 
"STRING" | 
"THEN" | 
"TO" | 
"TRUE" | 
"TYPE" | 
"UNTIL" | 
"VAR" | 
"WHILE" | 
"WITH" | 
"WRITE"  {lexeme=yytext(); return PalabraReservada;}

{espacio} |
"//"({L}|{D}|" "|"\t"|"\r")*"\n" |
"{*"({L}|{D}|espacio)* "*}" |
"{"({L}|{D}|espacio)* "}" {/*Ignore*/}


"=" { return OperadorIgual; }
"," { return OperadorComa; }
";" { return OperadorPuntoYComa; }
"++" { return OperadorIncremento; }
"--" { return OperadorDecremento; }
">=" { return OperadorMayorOIgualQue; }
">" { return OperadorMayorQue; }
"<=" { return OperadorMenorOIgualQue; }
"<" { return OperadorMenorQue; }
"<>" { return OperadorDiferente; }
"+" { return OperadorSuma; }
"-" { return OperadorResta; }
"*" { return OperadorMultiplicacion; }
"/" { return OperadorDivision; }
"(" { return OperadorParentesisIzquierdo; }
")" { return OperadorParentesisDerecho; }
"[" { return OperadorCorcheteIzquierdo; }
"]" { return OperadorCorcheteDerecho; }
":=" { return OperadorAsignacion; }
"." { return OperadorPunto; }
":" { return OperadorDosPuntos; }
"+=" { return OperadorSumaAsignacion; }
"-=" { return OperadorRestaAsignacion; }
"*=" { return OperadorMultiplicacionAsignacion; }
"/=" { return OperadorDivisionAsignacion; }
">>" { return OperadorDesplazamientoDerecha; }
"<<" { return OperadorDesplazamientoIzquierda; }
"<<=" { return OperadorDesplazamientoIzquierdaAsignacion; }
">>=" { return OperadorDesplazamientoDerechaAsignacion; }
"NOT" { return OperadorNot; }
"OR" { return OperadorOr; }
"AND" { return OperadorAnd; }
"XOR" { return OperadorXor; }
"DIV" { return OperadorDiv; }
"MOD" { return OperadorMod; }


[a-zA-Z][a-zA-Z0-9_]{0,126} { return Identificador; }

//ENTEROS
0|[1-9][0-9]* {lexeme=yytext(); return Entero;}

//FLOTANTES
(0|[1-9][0-9]*)\.(0|[1-9][0-9]*){Exponente}? 
|\.(0|[1-9][0-9]*){Exponente}? {lexeme=yytext(); return Flotante;}




//CARACTERES
"“"[a-zA-Z0-9_]"”" {lexeme=yytext(); return Caracter;}

//STRINGS
"“"[a-zA-Z0-9_]*"”" {lexeme=yytext(); return String;}

 . {return Error;}
