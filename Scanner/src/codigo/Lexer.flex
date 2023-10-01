package codigo;
import static codigo.Tokens.*;
%%
%ignorecase
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
"{*"~"*}" | 
"//"[^\r\n]*|
"{"~"}" {/*Ignore*/}


"=" {lexeme=yytext(); return OperadorIgual; }
"," {lexeme=yytext(); return OperadorComa; }
";" {lexeme=yytext(); return OperadorPuntoYComa; }
"++" {lexeme=yytext(); return OperadorIncremento; }
"--" {lexeme=yytext(); return OperadorDecremento; }
">=" {lexeme=yytext(); return OperadorMayorOIgualQue; }
">" {lexeme=yytext(); return OperadorMayorQue; }
"<=" {lexeme=yytext(); return OperadorMenorOIgualQue; }
"<" {lexeme=yytext(); return OperadorMenorQue; }
"<>" {lexeme=yytext(); return OperadorDiferente; }
"+" {lexeme=yytext(); return OperadorSuma; }
"-" {lexeme=yytext(); return OperadorResta; }
"*" {lexeme=yytext(); return OperadorMultiplicacion; }
"/" {lexeme=yytext(); return OperadorDivision; }
"(" {lexeme=yytext(); return OperadorParentesisIzquierdo; }
")" {lexeme=yytext(); return OperadorParentesisDerecho; }
"[" {lexeme=yytext(); return OperadorCorcheteIzquierdo; }
"]" {lexeme=yytext(); return OperadorCorcheteDerecho; }
":=" {lexeme=yytext(); return OperadorAsignacion; }
"." {lexeme=yytext(); return OperadorPunto; }
":" {lexeme=yytext(); return OperadorDosPuntos; }
"+=" {lexeme=yytext(); return OperadorSumaAsignacion; }
"-=" {lexeme=yytext(); return OperadorRestaAsignacion; }
"*=" {lexeme=yytext(); return OperadorMultiplicacionAsignacion; }
"/=" {lexeme=yytext(); return OperadorDivisionAsignacion; }
">>" {lexeme=yytext(); return OperadorDesplazamientoDerecha; }
"<<" {lexeme=yytext(); return OperadorDesplazamientoIzquierda; }
"<<=" {lexeme=yytext(); return OperadorDesplazamientoIzquierdaAsignacion; }
">>=" {lexeme=yytext(); return OperadorDesplazamientoDerechaAsignacion; }

"NOT" {lexeme=yytext(); return OperadorNot; }
"OR" {lexeme=yytext(); return OperadorOr; }
"AND" {lexeme=yytext(); return OperadorAnd; }
"XOR" {lexeme=yytext(); return OperadorXor; }
"DIV" {lexeme=yytext(); return OperadorDiv; }
"MOD" {lexeme=yytext(); return OperadorMod; }

[^A-Za-z "][_A-Za-z0-9]*{0,126} {lexeme=yytext(); return Error;}

(0|[1-9][0-9]*)[_A-Za-z0-9]*{0,126} {lexeme=yytext(); return Identificador; }

//ENTEROS
0|[1-9][0-9]* {lexeme=yytext(); return Entero;}

//FLOTANTES
(0|[1-9][0-9]*)\.(0|[1-9][0-9]*){Exponente}? 
|\.(0|[1-9][0-9]*){Exponente}? {lexeme=yytext(); return Flotante;}


//CARACTERES
\"[a-zA-Z0-9_]\" {lexeme=yytext(); return Caracter;}

//STRINGS
\"[a-zA-Z0-9_]*\" {lexeme=yytext(); return String;}

 . {lexeme=yytext(); return Error;}
