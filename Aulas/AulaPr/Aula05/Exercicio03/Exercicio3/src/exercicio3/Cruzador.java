/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

import static java.lang.Math.sqrt;

/**
 *
 * @author uniflualves
 */
public class Cruzador extends NavioDeGuerra{
    private int numCanhoes;

    public Cruzador(int numCanhoes, double blindagem, double ataque) {
        super(blindagem, ataque);
        this.numCanhoes = numCanhoes;
    }

    public Cruzador(int numCanhoes, double blindagem, double ataque, int numTripulantes, String nome) {
        super(blindagem, ataque, numTripulantes, nome);
        this.numCanhoes = numCanhoes;
    }

    public void setNumCanhoes(int numCanhoes) {
        this.numCanhoes = numCanhoes;
    }

    public int getNumCanhoes() {
        return numCanhoes;
    }
    
    @Override
    public void poderDeFogo(){
        System.out.println("Poder de Fogo =" + getAtaque() * Math.sqrt(numCanhoes));
    }
}
