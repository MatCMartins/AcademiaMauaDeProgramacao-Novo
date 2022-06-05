/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.jogo;

/**
 *
 * @author mateu
 */
public class TelaDeCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaDeCadastro
     */
    public TelaDeCadastro() {
        initComponents();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelTelaDeCadastro = new javax.swing.JPanel();
        textoSenha = new javax.swing.JPasswordField();
        textoNome = new javax.swing.JTextField();
        textoEmail = new javax.swing.JTextField();
        textoIdade = new javax.swing.JTextField();
        textoTelefone = new javax.swing.JTextField();
        textoUsuario = new javax.swing.JTextField();
        fotoNome = new javax.swing.JLabel();
        fotoEmail = new javax.swing.JLabel();
        fotoIdade = new javax.swing.JLabel();
        fotoCelular = new javax.swing.JLabel();
        fotoUsuario = new javax.swing.JLabel();
        fotoSenha = new javax.swing.JLabel();
        botaoEntrar = new javax.swing.JButton();
        descricaoNome = new javax.swing.JLabel();
        descricaoTelefone = new javax.swing.JLabel();
        descricaoUsuario = new javax.swing.JLabel();
        descricaoSenha = new javax.swing.JLabel();
        tituloPaginaCadastro = new javax.swing.JLabel();
        tituloCadastro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelTelaDeCadastro.setBackground(new java.awt.Color(0, 0, 45));

        textoSenha.setBackground(new java.awt.Color(0, 0, 45));
        textoSenha.setForeground(new java.awt.Color(187, 187, 187));
        textoSenha.setText("jPasswordField1");
        textoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoSenhaActionPerformed(evt);
            }
        });

        textoNome.setBackground(new java.awt.Color(0, 0, 45));
        textoNome.setForeground(new java.awt.Color(187, 187, 187));
        textoNome.setText("name");

        textoEmail.setBackground(new java.awt.Color(0, 0, 45));
        textoEmail.setForeground(new java.awt.Color(187, 187, 187));
        textoEmail.setText("email");

        textoIdade.setBackground(new java.awt.Color(0, 0, 45));
        textoIdade.setForeground(new java.awt.Color(187, 187, 187));
        textoIdade.setText("age");

        textoTelefone.setBackground(new java.awt.Color(0, 0, 45));
        textoTelefone.setForeground(new java.awt.Color(187, 187, 187));
        textoTelefone.setText("phone");
        textoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoTelefoneActionPerformed(evt);
            }
        });

        textoUsuario.setEditable(false);
        textoUsuario.setBackground(new java.awt.Color(0, 0, 45));
        textoUsuario.setForeground(new java.awt.Color(187, 187, 187));
        textoUsuario.setText("username");

        fotoNome.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\src\\main\\java\\com\\mycompany\\jogo\\name.png")); // NOI18N
        fotoNome.setText("jLabel1");

        fotoEmail.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\src\\main\\java\\com\\mycompany\\jogo\\email.png")); // NOI18N
        fotoEmail.setText("jLabel2");

        fotoIdade.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\src\\main\\java\\com\\mycompany\\jogo\\age.png")); // NOI18N
        fotoIdade.setText("jLabel3");

        fotoCelular.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\src\\main\\java\\com\\mycompany\\jogo\\phone.png")); // NOI18N
        fotoCelular.setText("jLabel4");

        fotoUsuario.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\src\\main\\java\\com\\mycompany\\jogo\\Usuario.png")); // NOI18N
        fotoUsuario.setText("jLabel5");

        fotoSenha.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\src\\main\\java\\com\\mycompany\\jogo\\Cadeado.png")); // NOI18N
        fotoSenha.setText("jLabel6");

        botaoEntrar.setBackground(new java.awt.Color(0, 0, 45));
        botaoEntrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        botaoEntrar.setForeground(new java.awt.Color(187, 187, 187));
        botaoEntrar.setText("Sign Up");
        botaoEntrar.setToolTipText("");

        descricaoNome.setBackground(new java.awt.Color(0, 0, 45));
        descricaoNome.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        descricaoNome.setForeground(new java.awt.Color(187, 187, 187));
        descricaoNome.setText("Nome Completo");

        descricaoTelefone.setBackground(new java.awt.Color(0, 0, 45));
        descricaoTelefone.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        descricaoTelefone.setForeground(new java.awt.Color(187, 187, 187));
        descricaoTelefone.setText("DDD + 9 digitos");

        descricaoUsuario.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        descricaoUsuario.setForeground(new java.awt.Color(187, 187, 187));
        descricaoUsuario.setText("Min - 4 Caracteres");

        descricaoSenha.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        descricaoSenha.setForeground(new java.awt.Color(187, 187, 187));
        descricaoSenha.setText("Min - 4 , Max - 20,1 Letra Maiuscula, 1 Número, 1 Caracter Especial");

        tituloPaginaCadastro.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloPaginaCadastro.setForeground(new java.awt.Color(187, 187, 187));
        tituloPaginaCadastro.setText("ACADEMIA MAUÁ DE PROGRAMAÇÃO");

        tituloCadastro.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tituloCadastro.setForeground(new java.awt.Color(187, 187, 187));
        tituloCadastro.setText("Cadastro");

        javax.swing.GroupLayout painelTelaDeCadastroLayout = new javax.swing.GroupLayout(painelTelaDeCadastro);
        painelTelaDeCadastro.setLayout(painelTelaDeCadastroLayout);
        painelTelaDeCadastroLayout.setHorizontalGroup(
            painelTelaDeCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTelaDeCadastroLayout.createSequentialGroup()
                .addGroup(painelTelaDeCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelTelaDeCadastroLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(tituloPaginaCadastro))
                    .addGroup(painelTelaDeCadastroLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(painelTelaDeCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descricaoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTelaDeCadastroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelTelaDeCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTelaDeCadastroLayout.createSequentialGroup()
                        .addGroup(painelTelaDeCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTelaDeCadastroLayout.createSequentialGroup()
                                .addGroup(painelTelaDeCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fotoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fotoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelTelaDeCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(descricaoUsuario)
                                    .addComponent(textoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTelaDeCadastroLayout.createSequentialGroup()
                                .addGroup(painelTelaDeCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(painelTelaDeCadastroLayout.createSequentialGroup()
                                        .addGroup(painelTelaDeCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(fotoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fotoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fotoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(10, 10, 10))
                                    .addGroup(painelTelaDeCadastroLayout.createSequentialGroup()
                                        .addComponent(fotoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(painelTelaDeCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(descricaoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelTelaDeCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(textoEmail)
                                        .addComponent(textoNome)
                                        .addComponent(textoIdade)
                                        .addComponent(textoTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                                    .addComponent(descricaoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(224, 224, 224))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelTelaDeCadastroLayout.createSequentialGroup()
                        .addComponent(tituloCadastro)
                        .addGap(295, 295, 295))))
        );
        painelTelaDeCadastroLayout.setVerticalGroup(
            painelTelaDeCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTelaDeCadastroLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(tituloPaginaCadastro)
                .addGap(43, 43, 43)
                .addComponent(tituloCadastro)
                .addGap(51, 51, 51)
                .addGroup(painelTelaDeCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fotoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(descricaoNome)
                .addGap(18, 18, 18)
                .addGroup(painelTelaDeCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fotoEmail))
                .addGap(35, 35, 35)
                .addGroup(painelTelaDeCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fotoIdade))
                .addGap(35, 35, 35)
                .addGroup(painelTelaDeCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fotoCelular))
                .addGap(1, 1, 1)
                .addComponent(descricaoTelefone)
                .addGap(18, 18, 18)
                .addGroup(painelTelaDeCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fotoUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricaoUsuario)
                .addGap(18, 18, 18)
                .addGroup(painelTelaDeCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fotoSenha))
                .addGap(18, 18, 18)
                .addComponent(descricaoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(botaoEntrar)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelTelaDeCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelTelaDeCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        painelTelaDeCadastro.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoTelefoneActionPerformed

    private void textoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JLabel descricaoNome;
    private javax.swing.JLabel descricaoSenha;
    private javax.swing.JLabel descricaoTelefone;
    private javax.swing.JLabel descricaoUsuario;
    private javax.swing.JLabel fotoCelular;
    private javax.swing.JLabel fotoEmail;
    private javax.swing.JLabel fotoIdade;
    private javax.swing.JLabel fotoNome;
    private javax.swing.JLabel fotoSenha;
    private javax.swing.JLabel fotoUsuario;
    private javax.swing.JPanel painelTelaDeCadastro;
    private javax.swing.JTextField textoEmail;
    private javax.swing.JTextField textoIdade;
    private javax.swing.JTextField textoNome;
    private javax.swing.JPasswordField textoSenha;
    private javax.swing.JTextField textoTelefone;
    private javax.swing.JTextField textoUsuario;
    private javax.swing.JLabel tituloCadastro;
    private javax.swing.JLabel tituloPaginaCadastro;
    // End of variables declaration//GEN-END:variables
}
