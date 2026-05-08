/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author uniflualves
 */
public class Serie {
    private String serieNome, serieDesc, temporadas, episodios;

    public Serie(String serieNome, String serieDesc, String temporadas, String episodios) {
        this.serieNome = serieNome;
        this.serieDesc = serieDesc;
        this.temporadas = temporadas;
        this.episodios = episodios;
    }

    public String getSerieNome() {
        return serieNome;
    }

    public String getSerieDesc() {
        return serieDesc;
    }

    public String getTemporadas() {
        return temporadas;
    }

    public String getEpisodios() {
        return episodios;
    }

    public void setSerieNome(String serieNome) {
        this.serieNome = serieNome;
    }

    public void setSerieDesc(String serieDesc) {
        this.serieDesc = serieDesc;
    }

    public void setTemporadas(String temporadas) {
        this.temporadas = temporadas;
    }

    public void setEpisodios(String episodios) {
        this.episodios = episodios;
    }
    
    
}
