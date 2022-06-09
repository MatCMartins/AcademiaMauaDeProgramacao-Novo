/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.jogo;

/**
 *
 * @author bilzi
 */
import java.io.*;
import java.util.*; 
import org.apache.commons.io.FileUtils;
import javax.swing.*;


public class TelaDeFase4Nivel2 extends javax.swing.JFrame {

    /**
     * Creates new form TelaDeFase4Nivel2
     */
    public TelaDeFase4Nivel2() {
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

        painelFase4Nivel2 = new javax.swing.JPanel();
        perguntaFase4Nivel2 = new javax.swing.JLabel();
        primeiraResposta = new javax.swing.JButton();
        segundaResposta = new javax.swing.JButton();
        terceiraResposta = new javax.swing.JButton();
        quartaResposta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelFase4Nivel2.setBackground(new java.awt.Color(0, 0, 45));
        painelFase4Nivel2.setPreferredSize(new java.awt.Dimension(1128, 720));

        perguntaFase4Nivel2.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        perguntaFase4Nivel2.setForeground(new java.awt.Color(255, 255, 255));
        perguntaFase4Nivel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        primeiraResposta.setForeground(new java.awt.Color(255, 255, 255));
        primeiraResposta.setPreferredSize(new java.awt.Dimension(370, 237));

        segundaResposta.setForeground(new java.awt.Color(255, 255, 255));
        segundaResposta.setPreferredSize(new java.awt.Dimension(370, 237));

        terceiraResposta.setForeground(new java.awt.Color(255, 255, 255));
        terceiraResposta.setPreferredSize(new java.awt.Dimension(370, 237));

        quartaResposta.setForeground(new java.awt.Color(255, 255, 255));
        quartaResposta.setPreferredSize(new java.awt.Dimension(370, 237));

        javax.swing.GroupLayout painelFase4Nivel2Layout = new javax.swing.GroupLayout(painelFase4Nivel2);
        painelFase4Nivel2.setLayout(painelFase4Nivel2Layout);
        painelFase4Nivel2Layout.setHorizontalGroup(
            painelFase4Nivel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFase4Nivel2Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(painelFase4Nivel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(perguntaFase4Nivel2, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelFase4Nivel2Layout.createSequentialGroup()
                        .addGroup(painelFase4Nivel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(primeiraResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(terceiraResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(182, 182, 182)
                        .addGroup(painelFase4Nivel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quartaResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(segundaResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        painelFase4Nivel2Layout.setVerticalGroup(
            painelFase4Nivel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFase4Nivel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(perguntaFase4Nivel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(painelFase4Nivel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(primeiraResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(segundaResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(painelFase4Nivel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(terceiraResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quartaResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        Fases numero = new Fases(11);
        FasesDAO dao = new FasesDAO();
        String questao = dao.questao(numero);
        byte[] fotoQuestao = Base64.getDecoder().decode(questao);
        Icon iconQuestao = new ImageIcon(fotoQuestao);
        perguntaFase4Nivel2.setIcon(iconQuestao);
        String alternativa1 = dao.alternativa1(numero);
        byte[] fotoAlternativa1 = Base64.getDecoder().decode(alternativa1);
        Icon iconAlternativa1 = new ImageIcon(fotoAlternativa1);
        primeiraResposta.setIcon(iconAlternativa1);
        String alternativa2 = dao.alternativa2(numero);
        byte[] fotoAlternativa2 = Base64.getDecoder().decode(alternativa2);
        Icon iconAlternativa2 = new ImageIcon(fotoAlternativa2);
        segundaResposta.setIcon(iconAlternativa2);
        String alternativa3 = dao.alternativa3(numero);
        byte[] fotoAlternativa3 = Base64.getDecoder().decode(alternativa3);
        Icon iconAlternativa3 = new ImageIcon(fotoAlternativa3);
        terceiraResposta.setIcon(iconAlternativa3);
        String alternativa4 = dao.alternativa4(numero);
        byte[] fotoAlternativa4 = Base64.getDecoder().decode(alternativa4);
        Icon iconAlternativa4 = new ImageIcon(fotoAlternativa4);
        quartaResposta.setIcon(iconAlternativa4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelFase4Nivel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelFase4Nivel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaDeFase4Nivel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeFase4Nivel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeFase4Nivel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeFase4Nivel2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeFase4Nivel2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel painelFase4Nivel2;
    private javax.swing.JLabel perguntaFase4Nivel2;
    private javax.swing.JButton primeiraResposta;
    private javax.swing.JButton quartaResposta;
    private javax.swing.JButton segundaResposta;
    private javax.swing.JButton terceiraResposta;
    // End of variables declaration//GEN-END:variables
}
