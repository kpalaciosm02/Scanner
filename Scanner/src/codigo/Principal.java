/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author kenda
 */
public class Principal {
    private static final String userPath = "C:\\Users\\kpala\\OneDrive\\Desktop\\";
    private static final String projectPath = "Scanner\\Scanner\\src\\codigo\\";
    private static final String pathWithoutSrc = "Scanner\\Scanner\\";
    public static void main(String[] args) throws Exception {
        String ruta1 = userPath+projectPath+"Lexer.flex";
        String ruta2 = userPath+projectPath+"LexerCup.flex";
        String[] rutaS = {"-parser", "Sintax", userPath+projectPath+"Sintax.cup"};
        generar(ruta1, ruta2, rutaS);
    }
    public static void generar(String ruta1, String ruta2, String[] rutaS) throws IOException, Exception{
        File archivo;
        archivo = new File(ruta1);
        JFlex.Main.generate(archivo);
        archivo = new File(ruta2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rutaS);
        Path rutaSym = Paths.get(userPath+projectPath+"sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        } 
        Path rutaSin = Paths.get(userPath+projectPath+"Sintax.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        
        Files.move(Paths.get(userPath+pathWithoutSrc+"sym.java"), 
                Paths.get(userPath+projectPath+"sym.java")
        );
        Files.move(Paths.get(userPath+pathWithoutSrc+"Sintax.java"), 
                Paths.get(userPath+projectPath+"Sintax.java")
        );
    }
}
