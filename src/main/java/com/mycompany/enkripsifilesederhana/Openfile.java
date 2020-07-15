/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enkripsifilesederhana;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author atikacomel
 */
public class Openfile extends javax.swing.JFrame {
    Enkripsi enkripsi = new Enkripsi();
    /**
     * Creates new form Openfile
     */
    public Openfile() {
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

        fileChooserEnkrip = new javax.swing.JFileChooser();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        textarea1 = new javax.swing.JTextArea();
        fileChooserDekrip = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        textareaenkrip = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuEnkripsi = new javax.swing.JMenu();
        OpenEnkripsi = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar3.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar3.add(jMenu4);

        textarea1.setColumns(20);
        textarea1.setRows(5);
        jScrollPane2.setViewportView(textarea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textareaenkrip.setColumns(20);
        textareaenkrip.setRows(5);
        jScrollPane1.setViewportView(textareaenkrip);

        MenuEnkripsi.setText("Enkripsi");

        OpenEnkripsi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        OpenEnkripsi.setText("Open");
        OpenEnkripsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenEnkripsiActionPerformed(evt);
            }
        });
        MenuEnkripsi.add(OpenEnkripsi);

        jMenuBar1.add(MenuEnkripsi);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpenEnkripsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenEnkripsiActionPerformed
        // TODO add your handling code here:
        int returnValEn = fileChooserEnkrip.showOpenDialog(this);
        
        if(returnValEn==JFileChooser.APPROVE_OPTION){
            File file = fileChooserEnkrip.getSelectedFile();
            try{
                InputStream input = new FileInputStream(file);
                OutputStream output = new FileOutputStream("output.txt");
                textareaenkrip.read(new FileReader(file.getAbsolutePath()), null);
                Enkripsi.enkripsi(input, output);
            } catch (IOException ex){
                System.out.println("File tidak dapat diakses pada"+file.getAbsolutePath());
            }
        }else{
            System.out.println("Akses file dibatalkan");
        }
    }//GEN-LAST:event_OpenEnkripsiActionPerformed

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
            java.util.logging.Logger.getLogger(Openfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Openfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Openfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Openfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Openfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuEnkripsi;
    private javax.swing.JMenuItem OpenEnkripsi;
    private javax.swing.JFileChooser fileChooserDekrip;
    private javax.swing.JFileChooser fileChooserEnkrip;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea textarea1;
    private javax.swing.JTextArea textareaenkrip;
    // End of variables declaration//GEN-END:variables
}
