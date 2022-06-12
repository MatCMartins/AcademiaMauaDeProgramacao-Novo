/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogo;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author mateu
 */
public class RankingDAO {

    public void criar(Ranking r) throws Exception {
        try {
            //1. abrir conexao com mysql server
            Connection conexao = ConnectionFactory.getConnection();
            //2.Executar comando sql
            String sql = "INSERT INTO Ranking(nomeUsuario) VALUES(?)";
            //3. preparar o comando
            PreparedStatement ps = conexao.prepareStatement(sql);
            //4. substituir os placeholders
            ps.setString(1, r.getNomeUsuario());
            //5. executar o comando
            ps.execute();
            //6. fechar os recursos
            ps.close();
            conexao.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void atualizarPontuacao(int Pontuacao, String nomeUsuario) throws Exception {
        Connection conexao = ConnectionFactory.getConnection();

        String sql = "UPDATE jogador SET pontuacao = ? WHERE nomeUsuario = ?;";

        PreparedStatement ps = conexao.prepareStatement(sql);

        ps.setInt(1, Ranking.pontuacao);
        ps.setString(2, Jogador.nomeDoUsuario);

        ps.execute();

        ps.close();
        conexao.close();
    }

    public void atualizarTentativas(int tentativas, String nomeUsuario) throws Exception {
        Connection conexao = ConnectionFactory.getConnection();

        String sql = "UPDATE jogador SET tentativas = ? WHERE nomeUsuario = ?;";

        PreparedStatement ps = conexao.prepareStatement(sql);

        ps.setInt(1, Ranking.tentativas);
        ps.setString(2, Jogador.nomeDoUsuario);

        ps.execute();

        ps.close();
        conexao.close();
    }

    public void pegarPontuacao(String nomeUsuario) throws Exception {

        Connection conexao = ConnectionFactory.getConnection();

        String sql = "select pontuacao, tentativas from Ranking where nomeUsuario = ?";

        PreparedStatement ps = conexao.prepareStatement(sql);

        ps.setString(1, Jogador.nomeDoUsuario);

        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            Ranking.pontuacao = rs.getInt(1);
            Ranking.tentativas = rs.getInt(2);
        }
        rs.close();
        ps.close();
        conexao.close();
    }

    public void consultarRanking1(int pontuacao, int tentativas) {
        try {
            Connection conexao = ConnectionFactory.getConnection();

            String sql = "SELECT Jogador_nomeUsuario, pontuacao, tentativas FROM Ranking WHERE Jogador_nomeUsuario = ?;";
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
