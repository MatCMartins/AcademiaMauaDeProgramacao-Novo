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

public class FasesDAO {

    
    public String questao(Fases f){
        try{
            Connection conexao = ConnectionFactory.getConnection();
            //2.Executar comando sql
            String sql = "SELECT questao FROM Pergunta WHERE numeroQuestao = ?";
            //3. preparar o comando
            PreparedStatement ps = conexao.prepareStatement(sql);
            //4. substituir os placeholders
            ps.setInt(1, f.idFase);
            
            //5. executar o comando
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                String questaoFase = rs.getString(1); 
                    rs.close();
                    ps.close();
                    conexao.close();
                    return questaoFase;
            }
            else{
                return null;
            }

        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
        
    }
    public String alternativa1(Fases f){
        try{
            Connection conexao = ConnectionFactory.getConnection();
            //2.Executar comando sql
            String sql = "SELECT alternativa1 FROM Pergunta WHERE numeroQuestao = ?";
            //3. preparar o comando
            PreparedStatement ps = conexao.prepareStatement(sql);
            //4. substituir os placeholders
            ps.setInt(1, f.idFase);
            
            //5. executar o comando
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                String questaoFase = rs.getString(1); 
                    rs.close();
                    ps.close();
                    conexao.close();
                    return questaoFase;
            }
            else{
                return null;
            }

        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    public String alternativa2(Fases f){
        try{
            Connection conexao = ConnectionFactory.getConnection();
            //2.Executar comando sql
            String sql = "SELECT alternativa2 FROM Pergunta WHERE numeroQuestao = ?";
            //3. preparar o comando
            PreparedStatement ps = conexao.prepareStatement(sql);
            //4. substituir os placeholders
            ps.setInt(1, f.idFase);

            //5. executar o comando
            ResultSet rs = ps.executeQuery();

            if (rs.next()){
                String questaoFase = rs.getString(1); 
                    rs.close();
                    ps.close();
                    conexao.close();
                    return questaoFase;
            }
            else{
                return null;
            }

    }
    catch(Exception e){
        e.printStackTrace();
        return null;
    }
}
    public String alternativa3(Fases f){
        try{
            Connection conexao = ConnectionFactory.getConnection();
            //2.Executar comando sql
            String sql = "SELECT alternativa3 FROM Pergunta WHERE numeroQuestao = ?";
            //3. preparar o comando
            PreparedStatement ps = conexao.prepareStatement(sql);
            //4. substituir os placeholders
            ps.setInt(1, f.idFase);

            //5. executar o comando
            ResultSet rs = ps.executeQuery();

            if (rs.next()){
                String questaoFase = rs.getString(1); 
                    rs.close();
                    ps.close();
                    conexao.close();
                    return questaoFase;
            }
            else{
                return null;
            }

        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
        public String alternativa4(Fases f){
            try{
            Connection conexao = ConnectionFactory.getConnection();
            //2.Executar comando sql
            String sql = "SELECT alternativa4 FROM Pergunta WHERE numeroQuestao = ?";
            //3. preparar o comando
            PreparedStatement ps = conexao.prepareStatement(sql);
            //4. substituir os placeholders
            ps.setInt(1, f.idFase);

            //5. executar o comando
            ResultSet rs = ps.executeQuery();

            if (rs.next()){
                String questaoFase = rs.getString(1); 
                    rs.close();
                    ps.close();
                    conexao.close();
                    return questaoFase;
            }
            else{
                return null;
            }

    }
    catch(Exception e){
        e.printStackTrace();
        return null;
    }
    }
}
