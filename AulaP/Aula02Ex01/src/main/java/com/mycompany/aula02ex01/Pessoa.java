
package com.mycompany.aula02ex01;

// definindo uma classe chamada Pessoa
public class Pessoa {
    // definindo os atributos da classe Pessoa
    private String nome, cpf;
    private int idade;
    
    // definindo os métodos da classe Pessoa
    
    // métodos de get (usados para obter valores dos atributos)
    public String getNome(){
        return nome;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public int getIdade(){
        return idade;
    }
    
    // métodos de set (usados para atribuir valores aos atributos)
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public void setIdade(int idade){
        if(idade < 0 || idade > 120){
            idade = 0;
        }
        this.idade = idade;
    }
}
