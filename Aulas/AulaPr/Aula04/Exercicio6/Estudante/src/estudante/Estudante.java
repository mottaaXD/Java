/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudante;

/**
 *
 * @author uniflualves
 */
public class Estudante {

    public String nome, sobrenome;
    public int proximoId;
    public static int contador = 0;
    
    public Estudante(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.contador++;
        this.proximoId = contador;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getSobrenone(){
        return sobrenome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSorbenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    @Override
    public String toString(){
        return "\nNome=" + nome + "\nSobrenome=" + sobrenome + "\nProximoId=" +
                proximoId;
    }
    
}
