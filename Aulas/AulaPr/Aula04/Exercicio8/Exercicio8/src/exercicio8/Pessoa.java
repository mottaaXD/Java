/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio8;

/**
 *
 * @author uniflualves
 */
public class Pessoa {
    private String nome, telefone;
    private static int contador;
    private int id;
    
    public Pessoa(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
        this.contador++;
        this.id = contador;
    }

    
    public String getNome(){
        return nome;
    }
    
    @Override
    public String toString(){
        return "\nNome=" + nome + "\nTelefone=" + telefone + "\nId=" + id;
    }
    
}
