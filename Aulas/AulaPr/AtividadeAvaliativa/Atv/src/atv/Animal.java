/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv;

/**
 *
 * @author uniflualves
 */
public class Animal {
    private double peso;
    private int idade;

    public Animal(double peso, int idade) {
        this.peso = peso;
        this.idade = idade;
    }

    
    
    public double getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void fala(){
        
    }
    
}
