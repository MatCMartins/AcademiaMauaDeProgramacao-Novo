/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogo;

import java.io.*;
import java.util.*; 
import org.apache.commons.io.FileUtils;

/**
 *
 * @author mateu
 */
public class ConversaoBase64 {
    
    //Perguntas do Jogo
    private String perguntaQuestao1Fase1Caminho = "PerguntaQuestao1Fase1.png";
    private String perguntaQuestao2Fase1Caminho = "PerguntaQuestao2Fase1.png";
    private String perguntaQuestao3Fase1Caminho = "PerguntaQuestao3Fase1.png";
    private String perguntaQuestao1Fase2Caminho = "PerguntaQuestao1Fase2.png";
    private String perguntaQuestao2Fase2Caminho = "PerguntaQuestao2Fase2.png";
    private String perguntaQuestao3Fase2Caminho = "PerguntaQuestao3Fase2.png";
    private String perguntaQuestao1Fase3Caminho = "PerguntaQuestao1Fase3.png";
    private String perguntaQuestao2Fase3Caminho = "PerguntaQuestao2Fase3.png";
    private String perguntaQuestao3Fase3Caminho = "PerguntaQuestao3Fase3.png";
    private String perguntaQuestao1Fase4Caminho = "PerguntaQuestao1Fase4.png";
    private String perguntaQuestao2Fase4Caminho = "PerguntaQuestao2Fase4.png";
    private String perguntaQuestao3Fase4Caminho = "PerguntaQuestao3Fase4.png";
    private String perguntaQuestao1Fase5Caminho = "PerguntaQuestao1Fase5.png";
    private String perguntaQuestao2Fase5Caminho = "PerguntaQuestao2Fase5.png";
    private String perguntaQuestao3Fase5Caminho = "PerguntaQuestao3Fase5.png";
    private String perguntaQuestao1Fase6Caminho = "PerguntaQuestao1Fase6.png";
    private String perguntaQuestao2Fase6Caminho = "PerguntaQuestao2Fase6.png";
    private String perguntaQuestao3Fase6Caminho = "PerguntaQuestao3Fase6.png";
    
  
    //Itens do Jogo
    private String item1Questao1Fase1Caminho = "Item1Questao1Fase1.png";
    private String item2Questao1Fase1Caminho = "Item2Questao1Fase1.png";
    private String item3Questao1Fase1Caminho = "Item3Questao1Fase1.png";
    private String item4Questao1Fase1Caminho = "Item4Questao1Fase1.png";
    private String item1Questao2Fase1Caminho = "Item1Questao2Fase1.png";
    private String item2Questao2Fase1Caminho = "Item2Questao2Fase1.png";
    private String item3Questao2Fase1Caminho = "Item3Questao2Fase1.png";
    private String item4Questao2Fase1Caminho = "Item4Questao2Fase1.png";
    private String item1Questao3Fase1Caminho = "Item1Questao3Fase1.png";
    private String item2Questao3Fase1Caminho = "Item2Questao3Fase1.png";
    private String item3Questao3Fase1Caminho = "Item3Questao3Fase1.png";
    private String item4Questao3Fase1Caminho = "Item4Questao3Fase1.png";
    private String item1Questao1Fase2Caminho = "Item1Questao1Fase2.png";
    private String item2Questao1Fase2Caminho = "Item2Questao1Fase2.png";
    private String item3Questao1Fase2Caminho = "Item3Questao1Fase2.png";
    private String item4Questao1Fase2Caminho = "Item4Questao1Fase2.png";
    private String item1Questao2Fase2Caminho = "Item1Questao2Fase2.png";
    private String item2Questao2Fase2Caminho = "Item2Questao2Fase2.png";
    private String item3Questao2Fase2Caminho = "Item3Questao2Fase2.png";
    private String item4Questao2Fase2Caminho = "Item4Questao2Fase2.png";
    private String item1Questao3Fase2Caminho = "Item1Questao3Fase2.png";
    private String item2Questao3Fase2Caminho = "Item2Questao3Fase2.png";
    private String item3Questao3Fase2Caminho = "Item3Questao3Fase2.png";
    private String item4Questao3Fase2Caminho = "Item4Questao3Fase2.png";
    private String item1Questao1Fase3Caminho = "Item1Questao1Fase3.png";
    private String item2Questao1Fase3Caminho = "Item2Questao1Fase3.png";
    private String item3Questao1Fase3Caminho = "Item3Questao1Fase3.png";
    private String item4Questao1Fase3Caminho = "Item4Questao1Fase3.png";
    private String item1Questao2Fase3Caminho = "Item1Questao2Fase3.png";
    private String item2Questao2Fase3Caminho = "Item2Questao2Fase3.png";
    private String item3Questao2Fase3Caminho = "Item3Questao2Fase3.png";
    private String item4Questao2Fase3Caminho = "Item4Questao2Fase3.png";
    private String item1Questao3Fase3Caminho = "Item1Questao3Fase3.png";
    private String item2Questao3Fase3Caminho = "Item2Questao3Fase3.png";
    private String item3Questao3Fase3Caminho = "Item3Questao3Fase3.png";
    private String item4Questao3Fase3Caminho = "Item4Questao3Fase3.png";
    private String item1Questao1Fase4Caminho = "Item1Questao1Fase4.png";
    private String item2Questao1Fase4Caminho = "Item2Questao1Fase4.png";
    private String item3Questao1Fase4Caminho = "Item3Questao1Fase4.png";
    private String item4Questao1Fase4Caminho = "Item4Questao1Fase4.png";
    private String item1Questao2Fase4Caminho = "Item1Questao2Fase4.png";
    private String item2Questao2Fase4Caminho = "Item2Questao2Fase4.png";
    private String item3Questao2Fase4Caminho = "Item3Questao2Fase4.png";
    private String item4Questao2Fase4Caminho = "Item4Questao2Fase4.png";
    private String item1Questao3Fase4Caminho = "Item1Questao3Fase4.png";
    private String item2Questao3Fase4Caminho = "Item2Questao3Fase4.png";
    private String item3Questao3Fase4Caminho = "Item3Questao3Fase4.png";
    private String item4Questao3Fase4Caminho = "Item4Questao3Fase4.png";
    private String item1Questao1Fase5Caminho = "Item1Questao1Fase5.png";
    private String item2Questao1Fase5Caminho = "Item2Questao1Fase5.png";
    private String item3Questao1Fase5Caminho = "Item3Questao1Fase5.png";
    private String item4Questao1Fase5Caminho = "Item4Questao1Fase5.png";
    private String item1Questao2Fase5Caminho = "Item1Questao2Fase5.png";
    private String item2Questao2Fase5Caminho = "Item2Questao2Fase5.png";
    private String item3Questao2Fase5Caminho = "Item3Questao2Fase5.png";
    private String item4Questao2Fase5Caminho = "Item4Questao2Fase5.png";
    private String item1Questao3Fase5Caminho = "Item1Questao3Fase5.png";
    private String item2Questao3Fase5Caminho = "Item2Questao3Fase5.png";
    private String item3Questao3Fase5Caminho = "Item3Questao3Fase5.png";
    private String item4Questao3Fase5Caminho = "Item4Questao3Fase5.png";
    private String item1Questao1Fase6Caminho = "Item1Questao1Fase6.png";
    private String item2Questao1Fase6Caminho = "Item2Questao1Fase6.png";
    private String item3Questao1Fase6Caminho = "Item3Questao1Fase6.png";
    private String item4Questao1Fase6Caminho = "Item4Questao1Fase6.png";
    private String item1Questao2Fase6Caminho = "Item1Questao2Fase6.png";
    private String item2Questao2Fase6Caminho = "Item2Questao2Fase6.png";
    private String item3Questao2Fase6Caminho = "Item3Questao2Fase6.png";
    private String item4Questao2Fase6Caminho = "Item4Questao2Fase6.png";
    private String item1Questao3Fase6Caminho = "Item1Questao3Fase6.png";
    private String item2Questao3Fase6Caminho = "Item2Questao3Fase6.png";
    private String item3Questao3Fase6Caminho = "Item3Questao3Fase6.png";
    private String item4Questao3Fase6Caminho = "Item4Questao3Fase6.png";
   
    
    
    
            
    public void conversaoParaBase64() throws IOException{
        
        //Questao 1 Fase 1
        
        byte[] perguntaQuestao1Fase1 = FileUtils.readFileToByteArray(new File(perguntaQuestao1Fase1Caminho));
        String perguntaQuestao1Fase1String = Base64.getEncoder().encodeToString(perguntaQuestao1Fase1);
        byte[] perguntaQuestao1Fase1Foto = Base64.getDecoder().decode(perguntaQuestao1Fase1String);
        
        byte[] item1Questao1Fase1 = FileUtils.readFileToByteArray(new File(item1Questao1Fase1Caminho));
        String item1Questao1Fase1String = Base64.getEncoder().encodeToString(item1Questao1Fase1);
        byte[] item1Questao1Fase1Foto = Base64.getDecoder().decode(item1Questao1Fase1String);
        
        byte[] item2Questao1Fase1 = FileUtils.readFileToByteArray(new File(item2Questao1Fase1Caminho));
        String item2Questao1Fase1String = Base64.getEncoder().encodeToString(item2Questao1Fase1);
        byte[] item2Questao1Fase1Foto = Base64.getDecoder().decode(item2Questao1Fase1String);
        
        byte[] item3Questao1Fase1 = FileUtils.readFileToByteArray(new File(item3Questao1Fase1Caminho));
        String item3Questao1Fase1String = Base64.getEncoder().encodeToString(item3Questao1Fase1);
        byte[] item3Questao1Fase1Foto = Base64.getDecoder().decode(item3Questao1Fase1String);
        
        byte[] item4Questao1Fase1 = FileUtils.readFileToByteArray(new File(item4Questao1Fase1Caminho));
        String item4Questao1Fase1String = Base64.getEncoder().encodeToString(item4Questao1Fase1);
        byte[] item4Questao1Fase1Foto = Base64.getDecoder().decode(item4Questao1Fase1String);
                
        //Questao 2 Fase 1  
        
        byte[] perguntaQuestao2Fase1 = FileUtils.readFileToByteArray(new File(perguntaQuestao2Fase1Caminho));
        String perguntaQuestao2Fase1String = Base64.getEncoder().encodeToString(perguntaQuestao2Fase1);
        byte[] perguntaQuestao2Fase1Foto = Base64.getDecoder().decode(perguntaQuestao2Fase1String);
        
        byte[] item1Questao2Fase1 = FileUtils.readFileToByteArray(new File(item1Questao2Fase1Caminho));
        String item1Questao2Fase1String = Base64.getEncoder().encodeToString(item1Questao2Fase1);
        byte[] item1Questao2Fase1Foto = Base64.getDecoder().decode(item1Questao2Fase1String);
        
        byte[] item2Questao2Fase1 = FileUtils.readFileToByteArray(new File(item2Questao2Fase1Caminho));
        String item2Questao2Fase1String = Base64.getEncoder().encodeToString(item2Questao2Fase1);
        byte[] item2Questao2Fase1Foto = Base64.getDecoder().decode(item2Questao2Fase1String);
        
        byte[] item3Questao2Fase1 = FileUtils.readFileToByteArray(new File(item3Questao2Fase1Caminho));
        String item3Questao2Fase1String = Base64.getEncoder().encodeToString(item3Questao2Fase1);
        byte[] item3Questao2Fase1Foto = Base64.getDecoder().decode(item3Questao2Fase1String);
        
        byte[] item4Questao2Fase1 = FileUtils.readFileToByteArray(new File(item4Questao2Fase1Caminho));
        String item4Questao2Fase1String = Base64.getEncoder().encodeToString(item4Questao2Fase1);
        byte[] item4Questao2Fase1Foto = Base64.getDecoder().decode(item4Questao2Fase1String);
        
        //Questao 3 Fase 1
        
        byte[] perguntaQuestao3Fase1 = FileUtils.readFileToByteArray(new File(perguntaQuestao3Fase1Caminho));
        String perguntaQuestao3Fase1String = Base64.getEncoder().encodeToString(perguntaQuestao3Fase1);
        byte[] perguntaQuestao3Fase1Foto = Base64.getDecoder().decode(perguntaQuestao3Fase1String);
        
        byte[] item1Questao3Fase1 = FileUtils.readFileToByteArray(new File(item1Questao3Fase1Caminho));
        String item1Questao3Fase1String = Base64.getEncoder().encodeToString(item1Questao3Fase1);
        byte[] item1Questao3Fase1Foto = Base64.getDecoder().decode(item1Questao3Fase1String);
        
        byte[] item2Questao3Fase1 = FileUtils.readFileToByteArray(new File(item2Questao3Fase1Caminho));
        String item2Questao3Fase1String = Base64.getEncoder().encodeToString(item2Questao3Fase1);
        byte[] item2Questao3Fase1Foto = Base64.getDecoder().decode(item2Questao3Fase1String);
        
        byte[] item3Questao3Fase1 = FileUtils.readFileToByteArray(new File(item3Questao3Fase1Caminho));
        String item3Questao3Fase1String = Base64.getEncoder().encodeToString(item3Questao3Fase1);
        byte[] item3Questao3Fase1Foto = Base64.getDecoder().decode(item3Questao3Fase1String);
        
        byte[] item4Questao3Fase1 = FileUtils.readFileToByteArray(new File(item4Questao3Fase1Caminho));
        String item4Questao3Fase1String = Base64.getEncoder().encodeToString(item4Questao3Fase1);
        byte[] item4Questao3Fase1Foto = Base64.getDecoder().decode(item4Questao3Fase1String);
        
        //Questao 1 Fase 2
        
        byte[] perguntaQuestao1Fase2 = FileUtils.readFileToByteArray(new File(perguntaQuestao1Fase2Caminho));
        String perguntaQuestao1Fase2String = Base64.getEncoder().encodeToString(perguntaQuestao1Fase2);
        byte[] perguntaQuestao1Fase2Foto = Base64.getDecoder().decode(perguntaQuestao1Fase2String);
        
        byte[] item1Questao1Fase2 = FileUtils.readFileToByteArray(new File(item1Questao1Fase2Caminho));
        String item1Questao1Fase2String = Base64.getEncoder().encodeToString(item1Questao1Fase2);
        byte[] item1Questao1Fase2Foto = Base64.getDecoder().decode(item1Questao1Fase2String);
        
        byte[] item2Questao1Fase2 = FileUtils.readFileToByteArray(new File(item2Questao1Fase2Caminho));
        String item2Questao1Fase2String = Base64.getEncoder().encodeToString(item2Questao1Fase2);
        byte[] item2Questao1Fase2Foto = Base64.getDecoder().decode(item2Questao1Fase2String);
        
        byte[] item3Questao1Fase2 = FileUtils.readFileToByteArray(new File(item3Questao1Fase2Caminho));
        String item3Questao1Fase2String = Base64.getEncoder().encodeToString(item3Questao1Fase2);
        byte[] item3Questao1Fase2Foto = Base64.getDecoder().decode(item3Questao1Fase2String);
        
        byte[] item4Questao1Fase2 = FileUtils.readFileToByteArray(new File(item4Questao1Fase2Caminho));
        String item4Questao1Fase2String = Base64.getEncoder().encodeToString(item4Questao1Fase2);
        byte[] item4Questao1Fase2Foto = Base64.getDecoder().decode(item4Questao1Fase2String);
        
        //Questao 2 Fase 2
        
        byte[] perguntaQuestao2Fase2 = FileUtils.readFileToByteArray(new File(perguntaQuestao2Fase2Caminho));
        String perguntaQuestao2Fase2String = Base64.getEncoder().encodeToString(perguntaQuestao2Fase2);
        byte[] perguntaQuestao2Fase2Foto = Base64.getDecoder().decode(perguntaQuestao2Fase2String);
       
        byte[] item1Questao2Fase2 = FileUtils.readFileToByteArray(new File(item1Questao2Fase2Caminho));
        String item1Questao2Fase2String = Base64.getEncoder().encodeToString(item1Questao2Fase2);
        byte[] item1Questao2Fase2Foto = Base64.getDecoder().decode(item1Questao2Fase2String);
        
        byte[] item2Questao2Fase2 = FileUtils.readFileToByteArray(new File(item2Questao2Fase2Caminho));
        String item2Questao2Fase2String = Base64.getEncoder().encodeToString(item2Questao2Fase2);
        byte[] item2Questao2Fase2Foto = Base64.getDecoder().decode(item2Questao2Fase2String);
        
        byte[] item3Questao2Fase2 = FileUtils.readFileToByteArray(new File(item3Questao2Fase2Caminho));
        String item3Questao2Fase2String = Base64.getEncoder().encodeToString(item3Questao2Fase2);
        byte[] item3Questao2Fase2Foto = Base64.getDecoder().decode(item3Questao2Fase2String);
        
        byte[] item4Questao2Fase2 = FileUtils.readFileToByteArray(new File(item4Questao2Fase2Caminho));
        String item4Questao2Fase2String = Base64.getEncoder().encodeToString(item4Questao2Fase2);
        byte[] item4Questao2Fase2Foto = Base64.getDecoder().decode(item4Questao2Fase2String);
        
        //Questao 3 Fase 2
        
        byte[] perguntaQuestao3Fase2 = FileUtils.readFileToByteArray(new File(perguntaQuestao3Fase2Caminho));
        String perguntaQuestao3Fase2String = Base64.getEncoder().encodeToString(perguntaQuestao3Fase2);
        byte[] perguntaQuestao3Fase2Foto = Base64.getDecoder().decode(perguntaQuestao3Fase2String);
        
        byte[] item1Questao3Fase2 = FileUtils.readFileToByteArray(new File(item1Questao3Fase2Caminho));
        String item1Questao3Fase2String = Base64.getEncoder().encodeToString(item1Questao3Fase2);
        byte[] item1Questao3Fase2Foto = Base64.getDecoder().decode(item1Questao3Fase2String);
       
        byte[] item2Questao3Fase2 = FileUtils.readFileToByteArray(new File(item2Questao3Fase2Caminho));
        String item2Questao3Fase2String = Base64.getEncoder().encodeToString(item2Questao3Fase2);
        byte[] item2Questao3Fase2Foto = Base64.getDecoder().decode(item2Questao3Fase2String);
        
        byte[] item3Questao3Fase2 = FileUtils.readFileToByteArray(new File(item3Questao3Fase2Caminho));
        String item3Questao3Fase2String = Base64.getEncoder().encodeToString(item3Questao3Fase2);
        byte[] item3Questao3Fase2Foto = Base64.getDecoder().decode(item3Questao3Fase2String);
        
        byte[] item4Questao3Fase2 = FileUtils.readFileToByteArray(new File(item4Questao3Fase2Caminho));
        String item4Questao3Fase2String = Base64.getEncoder().encodeToString(item4Questao3Fase2);
        byte[] item4Questao3Fase2Foto = Base64.getDecoder().decode(item4Questao3Fase2String);
        
        //Questao 1 Fase 3
        
        byte[] perguntaQuestao1Fase3 = FileUtils.readFileToByteArray(new File(perguntaQuestao1Fase3Caminho));
        String perguntaQuestao1Fase3String = Base64.getEncoder().encodeToString(perguntaQuestao1Fase3);
        byte[] perguntaQuestao1Fase3Foto = Base64.getDecoder().decode(perguntaQuestao1Fase3String);
        
        byte[] item1Questao1Fase3 = FileUtils.readFileToByteArray(new File(item1Questao1Fase3Caminho));
        String item1Questao1Fase3String = Base64.getEncoder().encodeToString(item1Questao1Fase3);
        byte[] item1Questao1Fase3Foto = Base64.getDecoder().decode(item1Questao1Fase3String);
     
        byte[] item2Questao1Fase3 = FileUtils.readFileToByteArray(new File(item2Questao1Fase3Caminho));
        String item2Questao1Fase3String = Base64.getEncoder().encodeToString(item2Questao1Fase3);
        byte[] item2Questao1Fase3Foto = Base64.getDecoder().decode(item2Questao1Fase3String);
        
        byte[] item3Questao1Fase3 = FileUtils.readFileToByteArray(new File(item3Questao1Fase3Caminho));
        String item3Questao1Fase3String = Base64.getEncoder().encodeToString(item3Questao1Fase3);
        byte[] item3Questao1Fase3Foto = Base64.getDecoder().decode(item3Questao1Fase3String);
        
        byte[] item4Questao1Fase3 = FileUtils.readFileToByteArray(new File(item4Questao1Fase3Caminho));
        String item4Questao1Fase3String = Base64.getEncoder().encodeToString(item4Questao1Fase3);
        byte[] item4Questao1Fase3Foto = Base64.getDecoder().decode(item4Questao1Fase3String);
        
        //Questao 2 Fase 3
        
        byte[] perguntaQuestao2Fase3 = FileUtils.readFileToByteArray(new File(perguntaQuestao2Fase3Caminho));
        String perguntaQuestao2Fase3String = Base64.getEncoder().encodeToString(perguntaQuestao2Fase3);
        byte[] perguntaQuestao2Fase3Foto = Base64.getDecoder().decode(perguntaQuestao2Fase3String);
        
        byte[] item1Questao2Fase3 = FileUtils.readFileToByteArray(new File(item1Questao2Fase3Caminho));
        String item1Questao2Fase3String = Base64.getEncoder().encodeToString(item1Questao2Fase3);
        byte[] item1Questao2Fase3Foto = Base64.getDecoder().decode(item1Questao2Fase3String);
     
        byte[] item2Questao2Fase3 = FileUtils.readFileToByteArray(new File(item2Questao2Fase3Caminho));
        String item2Questao2Fase3String = Base64.getEncoder().encodeToString(item2Questao2Fase3);
        byte[] item2Questao2Fase3Foto = Base64.getDecoder().decode(item2Questao2Fase3String);
        
        byte[] item3Questao2Fase3 = FileUtils.readFileToByteArray(new File(item3Questao2Fase3Caminho));
        String item3Questao2Fase3String = Base64.getEncoder().encodeToString(item3Questao2Fase3);
        byte[] item3Questao2Fase3Foto = Base64.getDecoder().decode(item3Questao2Fase3String);
        
        byte[] item4Questao2Fase3 = FileUtils.readFileToByteArray(new File(item4Questao2Fase3Caminho));
        String item4Questao2Fase3String = Base64.getEncoder().encodeToString(item4Questao2Fase3);
        byte[] item4Questao2Fase3Foto = Base64.getDecoder().decode(item4Questao2Fase3String);
        
        //Questao 3 Fase 3
        
        byte[] perguntaQuestao3Fase3 = FileUtils.readFileToByteArray(new File(perguntaQuestao3Fase3Caminho));
        String perguntaQuestao3Fase3String = Base64.getEncoder().encodeToString(perguntaQuestao3Fase3);
        byte[] perguntaQuestao3Fase3Foto = Base64.getDecoder().decode(perguntaQuestao3Fase3String);
       
        byte[] item1Questao3Fase3 = FileUtils.readFileToByteArray(new File(item1Questao3Fase3Caminho));
        String item1Questao3Fase3String = Base64.getEncoder().encodeToString(item1Questao3Fase3);
        byte[] item1Questao3Fase3Foto = Base64.getDecoder().decode(item1Questao3Fase3String);
     
        byte[] item2Questao3Fase3 = FileUtils.readFileToByteArray(new File(item2Questao3Fase3Caminho));
        String item2Questao3Fase3String = Base64.getEncoder().encodeToString(item2Questao3Fase3);
        byte[] item2Questao3Fase3Foto = Base64.getDecoder().decode(item2Questao3Fase3String);
        
        byte[] item3Questao3Fase3 = FileUtils.readFileToByteArray(new File(item3Questao3Fase3Caminho));
        String item3Questao3Fase3String = Base64.getEncoder().encodeToString(item3Questao3Fase3);
        byte[] item3Questao3Fase3Foto = Base64.getDecoder().decode(item3Questao3Fase3String);
        
        byte[] item4Questao3Fase3 = FileUtils.readFileToByteArray(new File(item4Questao3Fase3Caminho));
        String item4Questao3Fase3String = Base64.getEncoder().encodeToString(item4Questao3Fase3);
        byte[] item4Questao3Fase3Foto = Base64.getDecoder().decode(item4Questao3Fase3String);
        

        
        
    
    }
    
    
    
}
