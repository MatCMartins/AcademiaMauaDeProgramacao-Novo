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

public class EnviarBase64MySQL {
   
   private int numeroQuestao; 
   private String item1Questao1Fase1;
   private String item2Questao1Fase1;
   private String item3Questao1Fase1;
   private String item4Questao1Fase1;
   private String pergunta1Questao1Fase1;

    public EnviarBase64MySQL(int numeroQuestao, String item1Questao1Fase1, String item2Questao1Fase1, String item3Questao1Fase1, String item4Questao1Fase1, String pergunta1Questao1Fase1) {
        this.numeroQuestao = numeroQuestao;
        this.item1Questao1Fase1 = item1Questao1Fase1;
        this.item2Questao1Fase1 = item2Questao1Fase1;
        this.item3Questao1Fase1 = item3Questao1Fase1;
        this.item4Questao1Fase1 = item4Questao1Fase1;
        this.pergunta1Questao1Fase1 = pergunta1Questao1Fase1;
    }
   
   public void cadastrar(){
       
       try{
       String host = "localhost";
       String port = "3306";
       String bd = "AcademiaMauaDeProgramacao";
       Connection conexao = DriverManager.getConnection(
           String.format("jdbc:mysql://%s%s/%s?useTimezone=true&serverTimezone=UTC",
            host,
            port,
            bd
       ),
       "root",
       "LU1yo8Dqc**4^YVr7cFCkzR#TN!3Kexp"
       );
       
       String sql = "INSERT INTO AcademiaMauaDeProgramacao(numeroQuestao,alternativaCorreta,alternativa1,alternativa2,alternativa3,alternativa4,questao) VALUES(?,?,?,?,?,?,?)";
       PreparedStatement ps = conexao.prepareStatement(sql);
       ps.setInt(1,numeroQuestao);
       ps.setString(2,item1Questao1Fase1);
       ps.setString(3, item2Questao1Fase1);
       ps.setString(4,item3Questao1Fase1);
       ps.setString(5,item4Questao1Fase1);
       ps.setString(6,pergunta1Questao1Fase1);
       
       ps.execute();
       ps.close();
       conexao.close();
               
       }        
       catch(Exception e){
           System.out.printf("Exceção: %s", e.getMessage());
       }
   } 

    public int getNumeroQuestao() {
        return numeroQuestao;
    }

    public void setNumeroQuestao(int numeroQuestao) {
        this.numeroQuestao = numeroQuestao;
    }

    public String getItem1Questao1Fase1() {
        return item1Questao1Fase1;
    }

    public void setItem1Questao1Fase1(String item1Questao1Fase1) {
        this.item1Questao1Fase1 = item1Questao1Fase1;
    }

    public String getItem2Questao1Fase1() {
        return item2Questao1Fase1;
    }

    public void setItem2Questao1Fase1(String item2Questao1Fase1) {
        this.item2Questao1Fase1 = item2Questao1Fase1;
    }

    public String getItem3Questao1Fase1() {
        return item3Questao1Fase1;
    }

    public void setItem3Questao1Fase1(String item3Questao1Fase1) {
        this.item3Questao1Fase1 = item3Questao1Fase1;
    }

    public String getItem4Questao1Fase1() {
        return item4Questao1Fase1;
    }

    public void setItem4Questao1Fase1(String item4Questao1Fase1) {
        this.item4Questao1Fase1 = item4Questao1Fase1;
    }

    public String getPergunta1Questao1Fase1() {
        return pergunta1Questao1Fase1;
    }

    public void setPergunta1Questao1Fase1(String pergunta1Questao1Fase1) {
        this.pergunta1Questao1Fase1 = pergunta1Questao1Fase1;
    }
    
    
    public static void main(String[] args){
            }
   
}
