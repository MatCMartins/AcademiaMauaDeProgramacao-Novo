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

public class TelaDeFase5Nivel3 extends javax.swing.JFrame {

    /**
     * Creates new form TelaDeFase5Nivel3
     */
    public TelaDeFase5Nivel3() {
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

        painelFase5Nivel3 = new javax.swing.JPanel();
        perguntaFase5Nivel3 = new javax.swing.JLabel();
        primeiraResposta = new javax.swing.JButton();
        segundaResposta = new javax.swing.JButton();
        terceiraResposta = new javax.swing.JButton();
        quartaResposta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelFase5Nivel3.setBackground(new java.awt.Color(0, 0, 45));

        perguntaFase5Nivel3.setToolTipText("");

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

        javax.swing.GroupLayout painelFase5Nivel3Layout = new javax.swing.GroupLayout(painelFase5Nivel3);
        painelFase5Nivel3.setLayout(painelFase5Nivel3Layout);
        painelFase5Nivel3Layout.setHorizontalGroup(
            painelFase5Nivel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFase5Nivel3Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(painelFase5Nivel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(segundaResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(primeiraResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(terceiraResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quartaResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 100, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFase5Nivel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(perguntaFase5Nivel3, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
        );
        painelFase5Nivel3Layout.setVerticalGroup(
            painelFase5Nivel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFase5Nivel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(perguntaFase5Nivel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(primeiraResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(segundaResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(terceiraResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(quartaResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Fases numero = new Fases(15);
        FasesDAO dao = new FasesDAO();
        String questao = dao.questao(numero);
        byte[] fotoQuestao = Base64.getDecoder().decode(questao);
        Icon iconQuestao = new ImageIcon(fotoQuestao);
        perguntaFase5Nivel3.setIcon(iconQuestao);
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
                .addComponent(painelFase5Nivel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelFase5Nivel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void primeiraRespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeiraRespostaActionPerformed
        try {
            String soundName = Ranking.audioCorreto;
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            FasesDAO fases = new FasesDAO();
            Ranking.tentativas += 1;
            if (fases.verificar_jogador_pergunta(15, Jogador.nomeDoUsuario) == false) {
                fases.enviar_jogador_pergunta(15, Jogador.nomeDoUsuario);
                Ranking.pontuacao += 100;
                Ranking ranking = new Ranking(Jogador.nomeDoUsuario);
                JogadorDAO dao = new JogadorDAO();
                RankingDAO dao2 = new RankingDAO();
                dao.atualizarPontuacao(Jogador.nomeDoUsuario, Ranking.pontuacao, Ranking.tentativas);
                dao2.atualizarPontuacao(Ranking.pontuacao, Jogador.nomeDoUsuario);
                dao2.atualizarTentativas(Ranking.tentativas,Jogador.nomeDoUsuario);
            }
            new TelaInicial().setVisible(true);
            this.dispose();
        
    }
    catch(Exception e){
        e.printStackTrace();
    }
    }//GEN-LAST:event_primeiraRespostaActionPerformed

    private void segundaRespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segundaRespostaActionPerformed
        try{
            String soundName = Ranking.audioErrado;    
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            new TelaInicial().setVisible(true);
            this.dispose();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_segundaRespostaActionPerformed

    private void terceiraRespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terceiraRespostaActionPerformed
        try{
            String soundName = Ranking.audioErrado;    
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            new TelaInicial().setVisible(true);
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
            new TelaInicial().setVisible(true);
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
            java.util.logging.Logger.getLogger(TelaDeFase5Nivel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeFase5Nivel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeFase5Nivel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeFase5Nivel3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeFase5Nivel3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel painelFase5Nivel3;
    private javax.swing.JLabel perguntaFase5Nivel3;
    private javax.swing.JButton primeiraResposta;
    private javax.swing.JButton quartaResposta;
    private javax.swing.JButton segundaResposta;
    private javax.swing.JButton terceiraResposta;
    // End of variables declaration//GEN-END:variables
}
