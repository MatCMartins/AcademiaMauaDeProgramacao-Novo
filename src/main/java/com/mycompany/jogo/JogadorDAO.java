/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogo;

/**
 *
 * @author mateu
 */

import java.sql.*;

public class JogadorDAO {
    public void criar(Jogador j) throws Exception{
        try{
        //1. abrir conexao com mysql server
        Connection conexao = ConnectionFactory.getConnection();
        //2.Executar comando sql
        String sql = "INSERT INTO jogador(nome, email, idade, telefone, nomeUsuario, senhaUsuario) VALUES(?, ?, ?, ?, ?, ?)";
        //3. preparar o comando
        PreparedStatement ps = conexao.prepareStatement(sql);
        //4. substituir os placeholders
        ps.setString(1, j.getNome());
        ps.setString(2, j.getEmail());
        ps.setInt(3, j.getIdade());
        ps.setString(4, j.getTelefone());
        ps.setString(5, j.getNomeUsuario());
        ps.setString(6, j.getSenhaUsuario());

        //5. executar o comando
        ps.execute();
        //6. fechar os recursos
        ps.close();
        conexao.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public boolean verificar(Jogador j) throws Exception{
        Connection conexao = ConnectionFactory.getConnection();
        //2.Executar comando sql
        String sql = "SELECT nomeUsuario,senhaUsuario FROM Jogador WHERE nomeUsuario = ? AND senhaUsuario = ?";
        //3. preparar o comando
        PreparedStatement ps = conexao.prepareStatement(sql);
        //4. substituir os placeholders
        ps.setString(1, j.getNomeUsuario());
        ps.setString(2, j.getSenhaUsuario());
        //5. executar o comando
        ResultSet rs = ps.executeQuery();
        boolean usuarioExiste = rs.next();
        
        //6. fechar os recursos
        rs.close();
        ps.close();
        conexao.close();
        
        return usuarioExiste;
    }
    public void registrar(String nomeJogador,String senhaJogador) throws Exception{
        
        Connection conexao = ConnectionFactory.getConnection();   

        String sql = "select nomeUsuario,senhaUsuario from Jogador where nomeUsuario = ? and senhaUsuario = ?";

        PreparedStatement ps = conexao.prepareStatement(sql);

        ps.setString(1, nomeJogador);
        ps.setString(2, senhaJogador);

        
        
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            Jogador.nomeDoUsuario = rs.getString(1);
            Jogador.senhaDoUsuario = rs.getString(2);
            System.out.println(Jogador.nomeDoUsuario);
            System.out.println(Jogador.senhaDoUsuario);
        }
    
    }
    public void deletar(Jogador j) throws Exception{
        
    try{
        //2.Executar comando sql
        String sql = "DELETE FROM Jogador WHERE nomeUsuario = ?";
        //2: Abrir uma conexão
        Connection conexao = ConnectionFactory.getConnection();
        //3: Pré compila o comando
        PreparedStatement ps = conexao.prepareStatement(sql);
        //4: Preenche os dados faltantes
        ps.setString(1, j.getNomeUsuario());
        //5: Executa o comando
        ps.execute();
    }
    catch (Exception e){
        e.printStackTrace();
    }
}
    
    
}