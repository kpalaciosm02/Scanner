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

{newline} {return CambioLinea;}

//Operadores
","|"="|"<"|">"|":"|"NOT"|"OR"|"AND"|"XOR"|"DIV"|"MOD"|"+"|"-"|"*"|"/"|";"|"("|")"|"["|"]"|":="|".."|"+="|"-="|"*="|"/="|"<="|">="|"<>"|"<<"|">>"|"<<="|">>=" {lexeme=yytext(); return Operador;}

//Errores
{D}{L}({L}|{D})* {lexeme=yytext(); return Error;}//Error de string que empieza por numero
{E}({L}|{D})* {lexeme=yytext(); return Error;}//Error de string que empieza por simbolo raro
({L}|{D})*{E}{E}*({L}|{D})* {lexeme=yytext(); return Error;}//Error de string que contiene simbolo raro
\"[^\"\n]*\n[^\"\n]*\" {lexeme=yytext(); return Error;}//Error de strings multilinea
//(({L}\*)|({L}\*({L}|{D})*) {lexeme=yytext(); return Error;}
\{.+ {lexeme=yytext(); return Error;}//intento de comentario multilinea



//{L}({L}|{D})* {lexeme=yytext(); return Identificador;}
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
(0|[1-9][0-9]*)\.(0|[1-9][0-9]*){Exponente}? 
|\.(0|[1-9][0-9]*){Exponente}? {lexeme=yytext(); return Flotante;}


//CARACTERES
\"[a-zA-Z0-9_]\" {lexeme=yytext(); return Caracter;}

//STRINGS
\"[a-zA-Z0-9_ ]+*\" {lexeme=yytext(); return String;}

/*{L}(({L}|{D})*) {
    int stringLength = yytext().length();
    if (stringLength < 128){
        return Identificador;
    }else {
        return Error;
    }
}*/

 . {lexeme=yytext(); return Error;}
