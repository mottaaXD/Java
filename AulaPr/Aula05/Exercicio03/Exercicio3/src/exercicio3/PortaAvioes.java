/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

/**
 *
 * @author uniflualves
 */
public class PortaAvioes extends NavioDeGuerra{
    private int numAvioes;

    public PortaAvioes(int numAvioes, double blindagem, double ataque) {
        super(blindagem, ataque);
        this.numAvioes = numAvioes;
    }

    public PortaAvioes(int numAvioes, double blindagem, double ataque, int numTripulantes, String nome) {
        super(blindagem, ataque, numTripulantes, nome);
        this.numAvioes = numAvioes;
    }

    public int getNumAvioes() {
        return numAvioes;
    }

    public void setNumAvioes(int numAvioes) {
        this.numAvioes = numAvioes;
    }
    
    @Override
    public void poderDeFogo(){
        System.out.println("Poder de ataque=" + getAtaque() * Math.pow(numAvioes, 2));
    }
}
