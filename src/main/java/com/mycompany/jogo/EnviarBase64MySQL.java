/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogo;

/**
 *
 * @author mateu
 */

import java.io.*;
import java.util.*; 
import org.apache.commons.io.FileUtils;
import java.sql.*;

public class EnviarBase64MySQL {
   
    private static String perguntaQuestao1Fase1Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\src\\main\\java\\com\\mycompany\\jogo\\PerguntaQuestao1Fase1.png";
    private static String item1Questao1Fase1Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\src\\main\\java\\com\\mycompany\\jogo\\Item1Questao1Fase1.png";
    private static String item2Questao1Fase1Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\src\\main\\java\\com\\mycompany\\jogo\\Item2Questao1Fase1.png";
    private static String item3Questao1Fase1Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\src\\main\\java\\com\\mycompany\\jogo\\Item3Questao1Fase1.png";
    private static String item4Questao1Fase1Caminho = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\src\\main\\java\\com\\mycompany\\jogo\\Item4Questao1Fase1.png";
    private static int numeroQuestao1Fase1 = 1;
    
    public void cadastrar(QuestoesJogo q) throws Exception{

        Connection conexao = ConnectionFactory.getConnection();


        String sql = "INSERT INTO Pergunta(numeroQuestao,alternativaCorreta,alternativa1,alternativa2,alternativa3,alternativa4,questao) VALUES(?,?,?,?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setInt(1,q.getNumeroQuestao());
        ps.setString(2,q.getItem1Questao());
        ps.setString(3,q.getItem1Questao());
        ps.setString(4,q.getItem2Questao());
        ps.setString(5,q.getItem3Questao());
        ps.setString(6,q.getItem4Questao());
        ps.setString(7,q.getPerguntaQuestao());

        ps.execute();
        ps.close();
        conexao.close();
    } 
    
    
    public static void main(String[] args){
        try{
            byte[] pergunta1Questao1 = FileUtils.readFileToByteArray(new File(perguntaQuestao1Fase1Caminho));
            String perguntaQuestaoString = Base64.getEncoder().encodeToString(pergunta1Questao1);

            byte[] item1Questao = FileUtils.readFileToByteArray(new File(item1Questao1Fase1Caminho));
            String item1QuestaoString = Base64.getEncoder().encodeToString(item1Questao);

            byte[] item2Questao = FileUtils.readFileToByteArray(new File(item2Questao1Fase1Caminho));
            String item2QuestaoString = Base64.getEncoder().encodeToString(item2Questao);

            byte[] item3Questao = FileUtils.readFileToByteArray(new File(item3Questao1Fase1Caminho));
            String item3QuestaoString = Base64.getEncoder().encodeToString(item3Questao);

            byte[] item4Questao = FileUtils.readFileToByteArray(new File(item4Questao1Fase1Caminho));
            String item4QuestaoString = Base64.getEncoder().encodeToString(item4Questao);
            
            QuestoesJogo questoes = new QuestoesJogo(1,perguntaQuestaoString,item1QuestaoString,item2QuestaoString,item3QuestaoString,item4QuestaoString);
            EnviarBase64MySQL envio = new EnviarBase64MySQL();
            envio.cadastrar(questoes);

                
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }


   
         
   
}
