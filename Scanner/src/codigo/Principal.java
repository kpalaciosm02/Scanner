package codigo;
/* @author kpala */
import java.io.File;

public class Principal {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\kpala\\OneDrive\\Desktop\\Scanner\\Scanner\\src\\codigo\\Lexer.flex";
        generarLexer(ruta);
    }
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
        vtnPrincipal vp = new vtnPrincipal();
        vp.setVisible(true);
    }
}
