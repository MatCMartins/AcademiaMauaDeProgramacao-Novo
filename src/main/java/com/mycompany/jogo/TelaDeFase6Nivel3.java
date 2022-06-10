/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.jogo;

/**
 *
 * @author Othavio
 */


import java.io.*;
import java.util.*;
import org.apache.commons.io.FileUtils;
import javax.swing.*;
import javax.sound.sampled.*;

public class TelaDeFase6Nivel3 extends javax.swing.JFrame {

    /**
     * Creates new form TelaDeFase6Nivel3
     */
    public TelaDeFase6Nivel3() {
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

        painelTelaFase6Nivel3 = new javax.swing.JPanel();
        perguntaFase6Nivel3 = new javax.swing.JLabel();
        primeiraResposta = new javax.swing.JButton();
        segundaResposta = new javax.swing.JButton();
        terceiraResposta = new javax.swing.JButton();
        quartaResposta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelTelaFase6Nivel3.setBackground(new java.awt.Color(0, 0, 45));

        perguntaFase6Nivel3.setBackground(new java.awt.Color(0, 0, 45));
        perguntaFase6Nivel3.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        perguntaFase6Nivel3.setForeground(new java.awt.Color(255, 255, 255));
        perguntaFase6Nivel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        primeiraResposta.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        primeiraResposta.setForeground(new java.awt.Color(255, 255, 255));

        segundaResposta.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        segundaResposta.setForeground(new java.awt.Color(255, 255, 255));

        terceiraResposta.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        terceiraResposta.setForeground(new java.awt.Color(255, 255, 255));

        quartaResposta.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        quartaResposta.setForeground(new java.awt.Color(255, 255, 255));
        quartaResposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quartaRespostaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelTelaFase6Nivel3Layout = new javax.swing.GroupLayout(painelTelaFase6Nivel3);
        painelTelaFase6Nivel3.setLayout(painelTelaFase6Nivel3Layout);
        painelTelaFase6Nivel3Layout.setHorizontalGroup(
            painelTelaFase6Nivel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTelaFase6Nivel3Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(painelTelaFase6Nivel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(painelTelaFase6Nivel3Layout.createSequentialGroup()
                        .addComponent(terceiraResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(quartaResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelTelaFase6Nivel3Layout.createSequentialGroup()
                        .addComponent(primeiraResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(182, 182, 182)
                        .addComponent(segundaResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(perguntaFase6Nivel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        painelTelaFase6Nivel3Layout.setVerticalGroup(
            painelTelaFase6Nivel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTelaFase6Nivel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(perguntaFase6Nivel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(painelTelaFase6Nivel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(primeiraResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(segundaResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(painelTelaFase6Nivel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(terceiraResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quartaResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        Fases numero = new Fases(18);
        FasesDAO dao = new FasesDAO();
        String questao = dao.questao(numero);
        byte[] fotoQuestao = Base64.getDecoder().decode(questao);
        Icon iconQuestao = new ImageIcon(fotoQuestao);
        perguntaFase6Nivel3.setIcon(iconQuestao);
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
                .addComponent(painelTelaFase6Nivel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelTelaFase6Nivel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quartaRespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quartaRespostaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quartaRespostaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDeFase6Nivel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeFase6Nivel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeFase6Nivel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeFase6Nivel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeFase6Nivel3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel painelTelaFase6Nivel3;
    private javax.swing.JLabel perguntaFase6Nivel3;
    private javax.swing.JButton primeiraResposta;
    private javax.swing.JButton quartaResposta;
    private javax.swing.JButton segundaResposta;
    private javax.swing.JButton terceiraResposta;
    // End of variables declaration//GEN-END:variables
}
