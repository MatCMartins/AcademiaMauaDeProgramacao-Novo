/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.jogo;

/**
 *
 * @author mateu
 */

import java.io.*;
import java.util.*;
import org.apache.commons.io.FileUtils;
import javax.swing.*;
import javax.sound.sampled.*;


public class TelaDeFase6Nivel1 extends javax.swing.JFrame {

    /**
     * Creates new form TelaDeFase6Nivel1
     */
    public TelaDeFase6Nivel1() {
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

        painelTelaDeFase6Nivel1 = new javax.swing.JPanel();
        perguntaFase6Nivel1 = new javax.swing.JLabel();
        primeiraResposta = new javax.swing.JButton();
        segundaResposta = new javax.swing.JButton();
        terceiraResposta = new javax.swing.JButton();
        quartaResposta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelTelaDeFase6Nivel1.setBackground(new java.awt.Color(0, 0, 45));

        perguntaFase6Nivel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        primeiraResposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeiraRespostaActionPerformed(evt);
            }
        });

        segundaResposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segundaRespostaActionPerformed(evt);
            }
        });

        terceiraResposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terceiraRespostaActionPerformed(evt);
            }
        });

        quartaResposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quartaRespostaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelTelaDeFase6Nivel1Layout = new javax.swing.GroupLayout(painelTelaDeFase6Nivel1);
        painelTelaDeFase6Nivel1.setLayout(painelTelaDeFase6Nivel1Layout);
        painelTelaDeFase6Nivel1Layout.setHorizontalGroup(
            painelTelaDeFase6Nivel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTelaDeFase6Nivel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(painelTelaDeFase6Nivel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelTelaDeFase6Nivel1Layout.createSequentialGroup()
                        .addComponent(terceiraResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(quartaResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelTelaDeFase6Nivel1Layout.createSequentialGroup()
                        .addComponent(primeiraResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(segundaResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTelaDeFase6Nivel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(perguntaFase6Nivel1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
        );
        painelTelaDeFase6Nivel1Layout.setVerticalGroup(
            painelTelaDeFase6Nivel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTelaDeFase6Nivel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(perguntaFase6Nivel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(painelTelaDeFase6Nivel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(primeiraResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(segundaResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(painelTelaDeFase6Nivel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quartaResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(terceiraResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        Fases numero = new Fases(16);
        FasesDAO dao = new FasesDAO();
        String questao = dao.questao(numero);
        byte[] fotoQuestao = Base64.getDecoder().decode(questao);
        Icon iconQuestao = new ImageIcon(fotoQuestao);
        perguntaFase6Nivel1.setIcon(iconQuestao);
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
                .addComponent(painelTelaDeFase6Nivel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelTelaDeFase6Nivel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void segundaRespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segundaRespostaActionPerformed
        try {
            String soundName = Ranking.audioCorreto;
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            FasesDAO fases = new FasesDAO();
            if (fases.verificar_jogador_pergunta(16, Jogador.nomeDoUsuario) == false) {
                fases.enviar_jogador_pergunta(16, Jogador.nomeDoUsuario);
                Ranking.pontuacao += 100;
                Ranking ranking = new Ranking(Jogador.nomeDoUsuario);
                JogadorDAO dao = new JogadorDAO();
                RankingDAO dao2 = new RankingDAO();
                dao.atualizarPontuacao(Jogador.nomeDoUsuario, Ranking.pontuacao, Ranking.tentativas);
                dao2.atualizarPontuacao(Ranking.pontuacao, Jogador.nomeDoUsuario);
            }
            new TelaDeFase6Nivel2().setVisible(true);
            this.dispose();
        
    }
    catch(Exception e){
        e.printStackTrace();
    }
    }//GEN-LAST:event_segundaRespostaActionPerformed

    private void primeiraRespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeiraRespostaActionPerformed
        try{
            String soundName = Ranking.audioErrado;    
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            new TelaDeFase6Nivel2().setVisible(true);
            this.dispose();
        }
        catch(Exception e){
            e.printStackTrace();
        }    }//GEN-LAST:event_primeiraRespostaActionPerformed

    private void terceiraRespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terceiraRespostaActionPerformed
        try{
            String soundName = Ranking.audioErrado;    
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            new TelaDeFase6Nivel2().setVisible(true);
            this.dispose();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_terceiraRespostaActionPerformed

    private void quartaRespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quartaRespostaActionPerformed
        try{
            String soundName = Ranking.audioErrado;    
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            new TelaDeFase6Nivel2().setVisible(true);
            this.dispose();
        }
        catch(Exception e){
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(TelaDeFase6Nivel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeFase6Nivel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeFase6Nivel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeFase6Nivel1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeFase6Nivel1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel painelTelaDeFase6Nivel1;
    private javax.swing.JLabel perguntaFase6Nivel1;
    private javax.swing.JButton primeiraResposta;
    private javax.swing.JButton quartaResposta;
    private javax.swing.JButton segundaResposta;
    private javax.swing.JButton terceiraResposta;
    // End of variables declaration//GEN-END:variables
}
