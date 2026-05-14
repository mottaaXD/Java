/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario
 */
public class Serie {
    private String nome, desc, temporadas, episodios, imagem;

    public Serie(String nome, String desc, String temporadas, String episodios, String imagem) {
        this.nome = nome;
        this.desc = desc;
        this.temporadas = temporadas;
        this.episodios = episodios;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public String getDesc() {
        return desc;
    }

    public String getTemporadas() {
        return temporadas;
    }

    public String getEpisodios() {
        return episodios;
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

    public void setTemporadas(String temporadas) {
        this.temporadas = temporadas;
    }

    public void setEpisodios(String episodios) {
        this.episodios = episodios;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    
    
}
