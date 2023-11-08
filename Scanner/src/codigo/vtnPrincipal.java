/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package codigo;

import static codigo.Tokens.Identificador;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
/**
 *
 * @author kpala
 */
public class vtnPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form vtnPrincipal
     */
    public vtnPrincipal() {
        initComponents();
    }

    private void analizarLexico() throws IOException{
        int cont = 1;
        
        String expr = (String) txtArchivoLeido.getText();
        Lexer lexer = new Lexer(new StringReader(expr));
        String resultado = "LINEA " + cont + "\t\tSimbolo\n";
        while(true){
            Tokens token = lexer.yylex();
            if (token == null){
                txtAnalizarLex.setText(resultado);
                return;
            }
            switch(token){
                case CambioLinea:
                    cont++;
                    resultado += "LINEA " + cont + "\n";
                    break;
                case Identificador:
                    resultado += "  <Identificador>\t" + lexer.lexeme + "\n";
                    break;
                case String:
                    resultado += "  <Cadena>\t\t" + lexer.lexeme + "\n";
                    break;
                case Caracter:
                    resultado += "  <Caracter>\t" + lexer.lexeme + "\n";
                    break;
                case Flotante:
                    resultado += "  <Numero flotante>\t" + lexer.lexeme + "\n";
                    break;
                case Entero:
                    resultado += "  <Numero entero>\t" + lexer.lexeme + "\n";
                    break;
                case ReservadaArray:
                case ReservadaBegin:
                case ReservadaBoolean:
                case ReservadaByte:
                case ReservadaCase:
                case ReservadaChar:
                case ReservadaConst:
                case ReservadaDo:
                case ReservadaDownto:
                case ReservadaElse:
                case ReservadaEnd:
                case ReservadaFalse:
                case ReservadaFile:
                case ReservadaFor:
                case ReservadaForward:
                case ReservadaFunction:
                case ReservadaGoto:
                case ReservadaIf:
                case ReservadaIn:
                case ReservadaInline:
                case ReservadaInt:
                case ReservadaLabel:
                case ReservadaLongInt:
                case ReservadaNil:
                case ReservadaOf:
                case ReservadaPacked:
                case ReservadaProcedure:
                case ReservadaProgram:
                case ReservadaRead:
                case ReservadaReal:
                case ReservadaRecord:
                case ReservadaRepeat:
                case ReservadaSet:
                case ReservadaShortInt:
                case ReservadaString:
                case ReservadaThen:
                case ReservadaTo:
                case ReservadaTrue:
                case ReservadaType:
                case ReservadaUntil:
                case ReservadaWhile:
                case ReservadaWrite:
                    resultado += "<" + token.toString()+ ">\t" + lexer.lexeme + "\n";
                    break;
                case ReservadaVar:
                    resultado += " <Reservada var>\t" + lexer.lexeme + "\n";
                    break;
                case Error:
                    resultado += "  <Error>\t\t" + lexer.lexeme + "\n";
                    break;
                case OperadorPuntoYComa:
                    resultado += "  <Operador punto y coma>\t" + lexer.lexeme + "\n";
                    break;
                case OperadorDivisionAsignacion:
                    resultado += "  <Operador divsion asignacion>\t" + lexer.lexeme + "\n";
                    break;
                case OperadorIgual:
                    resultado += "  <Operador asignacion>\t" + lexer.lexeme + "\n";
                    break;
                default:
                    resultado += "  <" + token +">\t" + lexer.lexeme + "\n";
                    break;
            }
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSeleccionarArchivo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArchivoLeido = new javax.swing.JTextArea();
        btnAnalizarLexico = new javax.swing.JButton();
        btnLimpiarLexico = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAnalizarSintaxis = new javax.swing.JButton();
        btnLimpiarSintaxis = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAnalizarLex = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtAnalizarSin = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSeleccionarArchivo.setText("Seleccionar archivo");
        btnSeleccionarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarArchivoActionPerformed(evt);
            }
        });

        txtArchivoLeido.setColumns(20);
        txtArchivoLeido.setRows(5);
        jScrollPane1.setViewportView(txtArchivoLeido);

        btnAnalizarLexico.setText("Analizar");
        btnAnalizarLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarLexicoActionPerformed(evt);
            }
        });

        btnLimpiarLexico.setText("Limpiar");
        btnLimpiarLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarLexicoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Analizador Lexico");

        btnAnalizarSintaxis.setText("Analizar");
        btnAnalizarSintaxis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarSintaxisActionPerformed(evt);
            }
        });

        btnLimpiarSintaxis.setText("Limpiar");
        btnLimpiarSintaxis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarSintaxisActionPerformed(evt);
            }
        });

        txtAnalizarLex.setColumns(20);
        txtAnalizarLex.setRows(5);
        jScrollPane5.setViewportView(txtAnalizarLex);

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Analizador Sintactico");

        txtAnalizarSin.setColumns(20);
        txtAnalizarSin.setRows(5);
        jScrollPane6.setViewportView(txtAnalizarSin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSeleccionarArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 336, Short.MAX_VALUE)
                                .addComponent(btnAnalizarLexico, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(207, 207, 207)
                                .addComponent(btnLimpiarLexico))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(304, 304, 304))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(332, 332, 332))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAnalizarSintaxis, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpiarSintaxis, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(538, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeleccionarArchivo)
                    .addComponent(btnAnalizarLexico)
                    .addComponent(btnLimpiarLexico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAnalizarSintaxis)
                    .addComponent(btnLimpiarSintaxis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(371, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarArchivoActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File archivo = new File(chooser.getSelectedFile().getAbsolutePath());
        try{
            String ST = new String(Files.readAllBytes(archivo.toPath()));
            txtArchivoLeido.setText(ST);
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }catch(IOException e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        
    }//GEN-LAST:event_btnSeleccionarArchivoActionPerformed

    private void btnLimpiarLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarLexicoActionPerformed
        txtAnalizarLex.setText(null);
    }//GEN-LAST:event_btnLimpiarLexicoActionPerformed

    private void btnLimpiarSintaxisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarSintaxisActionPerformed
        txtAnalizarSin.setText(null);
    }//GEN-LAST:event_btnLimpiarSintaxisActionPerformed

    private void btnAnalizarLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarLexicoActionPerformed
        try {
            analizarLexico();
        } catch (IOException ex) {
            Logger.getLogger(vtnPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAnalizarLexicoActionPerformed

    private void btnAnalizarSintaxisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarSintaxisActionPerformed
        String ST = txtArchivoLeido.getText();
        Sintax s = new Sintax(new codigo.LexerCup(new StringReader(ST)));
        try {
            s.parse();
            txtAnalizarSin.setText("Analisis realizado correctamente");
            txtAnalizarSin.setForeground(new Color(25,111,61));
        } catch (Exception ex) {
            Symbol sym = s.getS();
            txtAnalizarSin.setText("Error de sintaxis. Linea: " + (sym.right + 1) + " Caracter: " + (sym.left + 1) + " Texto: \"" + (sym.value) + "\"\n");
            //txtAnalizarSin.setText(ex.toString());
            txtAnalizarSin.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnAnalizarSintaxisActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new vtnPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizarLexico;
    private javax.swing.JButton btnAnalizarSintaxis;
    private javax.swing.JButton btnLimpiarLexico;
    private javax.swing.JButton btnLimpiarSintaxis;
    private javax.swing.JButton btnSeleccionarArchivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea txtAnalizarLex;
    private javax.swing.JTextArea txtAnalizarSin;
    private javax.swing.JTextArea txtArchivoLeido;
    // End of variables declaration//GEN-END:variables
}
