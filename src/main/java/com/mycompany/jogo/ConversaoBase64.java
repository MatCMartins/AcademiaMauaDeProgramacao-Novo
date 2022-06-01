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
    private String perguntaQuestao1Fase1Caminho = "PerguntaQuestao1Fase1.png";
            
    public void conversaoParaBase64() throws IOException{
    byte[] perguntaQuestao1Fase1 = FileUtils.readFileToByteArray(new File(perguntaQuestao1Fase1Caminho));
    String perguntaQuestao1Fase1String = Base64.getEncoder().encodeToString(perguntaQuestao1Fase1);
    
    byte[] decodedBytes = Base64.getDecoder().decode(perguntaQuestao1Fase1String);
    FileUtils.writeByteArrayToFile(new File("perguntaQuestao1Fase1CaminhoFile"), decodedBytes);
    }
    
    
    
}
