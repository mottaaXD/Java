/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

/**
 *
 * @author uniflualves
 */
public class Politico {
    protected String nome, partido, estado, funcao;

    public Politico() {
    }

    public Politico(String nome, String partido, String estado, String funcao) {
        this.nome = nome;
        this.partido = partido;
        this.estado = estado;
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public String getPartido() {
        return partido;
    }

    public String getEstado() {
        return estado;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    public void apresentacao(){
        System.out.println("---------------------------");
        System.out.println("Nome: " + getNome());
        System.out.println("Partido: " + getPartido());
        System.out.println("Estado: " + getEstado());
        System.out.println("Funcao: " + getFuncao());
        System.out.println("---------------------------");
    }
}
