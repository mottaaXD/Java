/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

/**
 *
 * @author uniflualves
 */
public class Prefeito extends Politico{
    private String municipio;

    public Prefeito() {
    }

    public Prefeito(String municipio) {
        this.municipio = municipio;
    }

    public Prefeito(String municipio, String nome, String partido, String estado, String funcao) {
        super(nome, partido, estado, funcao);
        this.municipio = municipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
    
    public void apresentacao(){
        System.out.println("-------------Prefeitos--------------");
        System.out.println("Nome: " + getNome());
        System.out.println("Partido: " + getPartido());
        System.out.println("Estado: " + getEstado());
        System.out.println("Funcao: " + getFuncao());
        System.out.println("Municipio: " + getMunicipio());
        System.out.println("---------------------------");
    }
}
