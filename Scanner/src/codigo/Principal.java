package codigo;

import java.io.File;

/* @author kpala */
public class Principal {
    public static void main(String[] args) {
        System.out.println("");
        String ruta = "C:/Users/kpala/OneDrive/Desktop/JavaApplication8/src/codigo/Lexer.flex";
        generarLexer(ruta);
    }
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }
}
