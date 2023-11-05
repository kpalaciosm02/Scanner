package codigo;
import static codigo.Tokens.*;
%%
%state COMENTARIO_MULTILINEA
%ignorecase
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
espacio=[ \t\r]+
newline=[\n]+
E=[@|!|$|&|\|`|~|*]+
Exponente = [eE] [\+\-]? 0|[1-9][0-9]*
%{
    public String lexeme;
%}
%%
/*"ARRAY" | "BEGIN" | "BOOLEAN" | "BYTE" | "CASE" | "CHAR" | "CONST" | "DO" | "DOWNTO" | "ELSE" | 
"END" | "FALSE" | "FILE" | "FOR" | "FORWARD" | "FUNCTION" | "GOTO" | "IF" | "IN" | "INLINE" | 
"INT" | "LABEL" | "LONGINT" | "NIL" | "OF" | "PACKED" | "PROCEDURE" | "PROGRAM" | "READ" | 
"REAL" | "RECORD" | 
"REPEAT" | "SET" | "SHORTINT" | "STRING" | "THEN" | "TO" | "TRUE" | "TYPE" | "UNTIL" | "VAR" | 
"WHILE" | "WITH" | "WRITE"  {lexeme=yytext(); return PalabraReservada;}*/

/* Definición de palabras reservadas */
"ARRAY" { lexeme = yytext(); return ReservadaArray; }
"BEGIN" { lexeme = yytext(); return ReservadaBegin; }
"BOOLEAN" { lexeme = yytext(); return ReservadaBoolean; }
"BYTE" { lexeme = yytext(); return ReservadaByte; }
"CASE" { lexeme = yytext(); return ReservadaCase; }
"CHAR" { lexeme = yytext(); return ReservadaChar; }
"CONST" { lexeme = yytext(); return ReservadaConst; }
"DO" { lexeme = yytext(); return ReservadaDo; }
"DOWNTO" { lexeme = yytext(); return ReservadaDownto; }
"ELSE" { lexeme = yytext(); return ReservadaElse; }
"END" { lexeme = yytext(); return ReservadaEnd; }
"FALSE" { lexeme = yytext(); return ReservadaFalse; }
"FILE" { lexeme = yytext(); return ReservadaFile; }
"FOR" { lexeme = yytext(); return ReservadaFor; }
"FORWARD" { lexeme = yytext(); return ReservadaForward; }
"FUNCTION" { lexeme = yytext(); return ReservadaFunction; }
"GOTO" { lexeme = yytext(); return ReservadaGoto; }
"IF" { lexeme = yytext(); return ReservadaIf; }
"IN" { lexeme = yytext(); return ReservadaIn; }
"INLINE" { lexeme = yytext(); return ReservadaInline; }
"INT" { lexeme = yytext(); return ReservadaInt; }
"LABEL" { lexeme = yytext(); return ReservadaLabel; }
"LONGINT" { lexeme = yytext(); return ReservadaLongInt; }
"NIL" { lexeme = yytext(); return ReservadaNil; }
"OF" { lexeme = yytext(); return ReservadaOf; }
"PACKED" { lexeme = yytext(); return ReservadaPacked; }
"PROCEDURE" { lexeme = yytext(); return ReservadaProcedure; }
"PROGRAM" { lexeme = yytext(); return ReservadaProgram; }
"READ" { lexeme = yytext(); return ReservadaRead; }
"REAL" { lexeme = yytext(); return ReservadaReal; }
"RECORD" { lexeme = yytext(); return ReservadaRecord; }
"REPEAT" { lexeme = yytext(); return ReservadaRepeat; }
"SET" { lexeme = yytext(); return ReservadaSet; }
"SHORTINT" { lexeme = yytext(); return ReservadaShortInt; }
"STRING" { lexeme = yytext(); return ReservadaString; }
"THEN" { lexeme = yytext(); return ReservadaThen; }
"TO" { lexeme = yytext(); return ReservadaTo; }
"TRUE" { lexeme = yytext(); return ReservadaTrue; }
"TYPE" { lexeme = yytext(); return ReservadaType; }
"UNTIL" { lexeme = yytext(); return ReservadaUntil; }
"VAR" { lexeme = yytext(); return ReservadaVar; }
"WHILE" { lexeme = yytext(); return ReservadaWhile; }
"WITH" { lexeme = yytext(); return ReservadaWith; }
"WRITE" { lexeme = yytext(); return ReservadaWrite; }

{espacio} |
"(*"~"*)" | 
"//"[^\r\n]*|
"{"~"}" {/*Ignore*/}

//Error string que esta en varias lineas
\"[^\"]*\n[^\"\n]*\" { lexeme=yytext(); return String;}

//Error string que abre comillas y no cierra o comentario que abre y no cierra
^\"[^\"\n]*$ {lexeme=yytext(); return Error;}

//Error comentario que abre con { pero no cierra
^"{"[^"}"~]*$ {lexeme=yytext(); return Error;}

//Error comentario que abre con (* pero no cierra
^"(\*"[^"\*)"~]*$ {lexeme=yytext(); return Error;}

//Caso de cambio de linea y espacios en blanco
{newline} {return CambioLinea;}


//Caracteres
\#[0-9]+ {lexeme=yytext(); return Caracter;}

//Operadores
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
"-" {lexeme=yytext(); return OperadorResta; }|12
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


//Errores
//Error de string que empieza por numero
{D}{L}({L}|{D})* {lexeme=yytext(); return Error;}

//Error de string que empieza por simbolo raro
{E}({L}|{D})* {lexeme=yytext(); return Error;}

//Error de string que contiene simbolo raro
({L}|{D})*{E}{E}*({L}|{D})* {lexeme=yytext(); return Error;}

//Error de strings multilinea
\"[^\"\n]*\n[^\"\n]*\" {lexeme=yytext(); return Error;}

//Error flotante que no tiene nada antes del punto
\.{D}+ {lexeme=yytext(); return Error;}

//Error notacion cientifica que no tiene nada despues de la e
(-?)[0-9].[0-9][0-9]*E+$ {lexeme=yytext(); return Error;}

//Error notacion cinetifica sin nada despues del punto
(-?)[0-9].E(-?)[1-9][0-9]* {lexeme=yytext(); return Error;}

//Error notacion cientifica de punto despues de la E
(-?)[0-9].[0-9][0-9]*E(-?)[1-9]\.[0-9]* {lexeme=yytext(); return Error;}

//Error flotante que no tiene nada despues del punto
{D}*\. {lexeme=yytext(); return Error;}

{L}({L}|{D})* {
    lexeme=yytext();
    if (lexeme.length() < 128){
        return Identificador;
    }
    return Error;
}

//ENTEROS
0|[1-9][0-9]* {lexeme=yytext(); return Entero;}

//FLOTANTES
(0|[1-9][0-9]*)\.(0|[1-9][0-9]*) {lexeme=yytext(); return Flotante;}

//NOTACION CIENTIFICA
(-?)[0-9].[0-9][0-9]*E(-?)[1-9][0-9]* {lexeme=yytext(); return Flotante;}

//CARACTERES
\"[a-zA-Z0-9_]\" {lexeme=yytext(); return Caracter;}

//STRINGS
\"[a-zA-Z0-9_ ]+*\" {lexeme=yytext(); return String;}

 . {lexeme=yytext(); return Error;}
