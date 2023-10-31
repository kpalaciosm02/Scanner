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
"ARRAY" | "BEGIN" | "BOOLEAN" | "BYTE" | "CASE" | "CHAR" | "CONST" | "DO" | "DOWNTO" | "ELSE" | 
"END" | "FALSE" | "FILE" | "FOR" | "FORWARD" | "FUNCTION" | "GOTO" | "IF" | "IN" | "INLINE" | 
"INT" | "LABEL" | "LONGINT" | "NIL" | "OF" | "PACKED" | "PROCEDURE" | "PROGRAM" | "READ" | 
"REAL" | "RECORD" | 
"REPEAT" | "SET" | "SHORTINT" | "STRING" | "THEN" | "TO" | "TRUE" | "TYPE" | "UNTIL" | "VAR" | 
"WHILE" | "WITH" | "WRITE"  {lexeme=yytext(); return PalabraReservada;}

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
","|"="|"<"|">"|":"|"NOT"|"OR"|"AND"|"XOR"|"DIV"|"MOD"|"+"|"-"|"*"|"/"|";"|"("|")"|"["|"]"|":="|".."|"+="|"-="|"*="|"/="|"<="|">="|"<>"|"<<"|">>"|"<<="|">>=" {lexeme=yytext(); return Operador;}

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
(-?)[0-9].[0-9][0-9]*E {lexeme=yytext(); return Error;}

//Error notacion cinetifica sin nada despues del punto
(-?)[0-9].E(-?)[1-9][0-9]* {lexeme=yytext(); return Error;}

//Error notacion cientifica de punto despues de la E
(-?)[0-9].[0-9][0-9]*E(-?)[1-9].[0-9]* {lexeme=yytext(); return Error;}

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
