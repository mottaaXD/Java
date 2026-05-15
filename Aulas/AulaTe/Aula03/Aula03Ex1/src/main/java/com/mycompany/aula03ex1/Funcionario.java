
package com.mycompany.aula03ex1;


public class Funcionario {
    // atributos da classe Funcionario
    private String nome, sobrenome, sexo;
    private int idade, numero;
    private double salarioMensal;
 
    
    // metodos da classe Funcionario

    // metodos construtores
    public Funcionario(){ // construtor padrao (nao parametrizado)
        nome = "Nao informado";
        sobrenome = "Nao informado";
        sexo = "Nao informado";
        numero = 99999;
    }
    
    public Funcionario(String nome, String sobrenome, String sexo, int idade, 
                       int numero, double salarioMensal){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.idade = idade;
        this.numero = numero;
        this.salarioMensal = salarioMensal;
    }
    
    
    // metodos de get
    public String getNome(){
        return nome;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public double getSalarioMensal(){
        return salarioMensal;
    }
    
    
    
    // metodos de set
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    public void setIdade(int idade){
        if(idade >= 0 && idade < 150) this.idade = idade;
        else this.idade = 0;
            
    }
    
    public void setNumero(int numero){
        if(numero >= 0 && numero <10000) this.numero = numero;
        else this.numero = 0;
    }
    
    public void setSalarioMensal(int salarioMensal){
        if(salarioMensal < 0) this.salarioMensal = 0;
        else this.salarioMensal = salarioMensal;
    }
    
    
    // toString()
    public String toString(){
        return "Nome=" + nome + "\nSobrenome=" + sobrenome + "\nSexo=" + sexo + 
                "\nIdade=" + idade + "\nNumero=" + numero + "\nSalario Mensal=" +
                salarioMensal;
    }
}
