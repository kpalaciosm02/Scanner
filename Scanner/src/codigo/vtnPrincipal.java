/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package codigo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

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
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSeleccionarArchivo.setText("Seleccionar archivo");
        btnSeleccionarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarArchivoActionPerformed(evt);
            }
        });

        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSeleccionarArchivo)
                        .addGap(39, 39, 39))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnSeleccionarArchivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarArchivoActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        /*File archivo = new File("salida.txt");
        PrintWriter escritor;
        
        try{
            escritor = new PrintWriter(archivo);
            escritor.print("if");
            escritor.close();
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }*/
        
        try{
            Reader lector = new BufferedReader(new FileReader(chooser.getSelectedFile()));
            Lexer lexer = new Lexer(lector);
            String resultado = "";
            while(true){
                Tokens tokens = lexer.yylex();
                if (tokens == null){
                    resultado += "No mas tokens";
                    txtResultado.append(resultado);
                    return;
                }
                switch(tokens){
                    case Error:
                        resultado += "Simbolo no definido\n";
                        break;
                    case Identificador:
                    case Entero:
                    case PalabraReservada:
                    case OperadorComa:
                    case OperadorPuntoYComa:
                    case OperadorIncremento:
                    case OperadorDecremento:
                    case OperadorMayorOIgualQue:
                    case OperadorMayorQue:
                    case OperadorMenorOIgualQue:
                    case OperadorMenorQue:
                    case OperadorDiferente:
                    case OperadorIgual:
                    case OperadorSuma:
                    case OperadorResta:
                    case OperadorMultiplicacion:
                    case OperadorDivision:
                    case OperadorParentesisIzquierdo:
                    case OperadorParentesisDerecho:
                    case OperadorCorcheteIzquierdo:
                    case OperadorCorcheteDerecho:
                    case OperadorAsignacion:
                    case OperadorPunto:
                    case OperadorDosPuntos:
                    case OperadorSumaAsignacion:
                    case OperadorRestaAsignacion:
                    case OperadorMultiplicacionAsignacion:
                    case OperadorDivisionAsignacion:
                    case OperadorDesplazamientoDerecha:
                    case OperadorDesplazamientoIzquierda:
                    case OperadorDesplazamientoIzquierdaAsignacion:
                    case OperadorDesplazamientoDerechaAsignacion:
                    case OperadorOr:
                    case OperadorAnd:
                    case OperadorXor:
                    case OperadorDiv:
                    case OperadorMod:
                    case OperadorNot:
                        resultado += lexer.lexeme + ": Es un " + tokens + "\n";
                        break;
                    default:
                        resultado += lexer.lexeme + ": Es un " + tokens + "\n";
                        break;
                }
            }
        }catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }catch(IOException e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        
    }//GEN-LAST:event_btnSeleccionarArchivoActionPerformed

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
    private javax.swing.JButton btnSeleccionarArchivo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
