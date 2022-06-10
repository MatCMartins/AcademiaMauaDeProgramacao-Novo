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

public class MaterialDeApoioDAO {

    public String material(int idMaterial) {
        try {
            Connection conexao = ConnectionFactory.getConnection();
            //2.Executar comando sql
            String sql = "SELECT material FROM MaterialDeApoio WHERE idMaterial = ?";
            //3. preparar o comando
            PreparedStatement ps = conexao.prepareStatement(sql);
            //4. substituir os placeholders
            ps.setInt(1, idMaterial);

            //5. executar o comando
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String questaoFase = rs.getString(1);
                rs.close();
                ps.close();
                conexao.close();
                return questaoFase;
            } else {
                return null;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
