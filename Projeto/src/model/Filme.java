/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario
 */
public class Filme {
    private String nome, desc, duracao, imagem;

    
    public Filme(String nome, String desc, String duracao, String imagem) {
        this.nome = nome;
        this.desc = desc;
        this.duracao = duracao;
        this.imagem = imagem;
    }
    
    
    public String getNome() {
        return nome;
    }

    public String getDesc() {
        return desc;
    }

    public String getDuracao() {
        return duracao;
    }

    public String getImagem() {
        return imagem;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    
    
    
}
