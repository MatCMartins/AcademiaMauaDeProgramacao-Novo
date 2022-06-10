/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogo;

/**
 *
 * @author mateu
 */
public class Ranking {
    private int posicao;
    private String nomeUsuario;
    public static int pontuacao;
    public static int tentativas;
    public static String audioCorreto = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Audios\\RespostaCorreta.wav";
    public static String audioErrado = "D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\Audios\\RespostaErrada.wav";
    public static int soma = 0;
    public static int soma2 = 0;
    public static int soma3 = 0;
    public static int soma4 = 0;
    public static int soma5 = 0;
    public static int soma6 = 0;
    public static int soma7 = 0;
    public static int soma8 = 0;
    public static int soma9 = 0;
    public static int soma10 = 0;
    public static int soma11 = 0;
    public static int soma12 = 0;
    public static int soma13 = 0;
    public static int soma14 = 0;
    public static int soma15 = 0;
    public static int soma16 = 0;
    public static int soma17 = 0;
    public static int soma18 = 0;
    
    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getTentativas() {
        return tentativas;
    }

    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    public Ranking(int posicao, String nomeUsuario, int pontuacao, int tentativas) {
        this.posicao = posicao;
        this.nomeUsuario = nomeUsuario;
        this.pontuacao = pontuacao;
        this.tentativas = tentativas;
    }
    public Ranking(String nomeUsuario){
        this.nomeUsuario = nomeUsuario;
    }
    
    
}
