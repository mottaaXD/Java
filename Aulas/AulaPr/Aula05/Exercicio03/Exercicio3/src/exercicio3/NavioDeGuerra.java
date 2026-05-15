/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

/**
 *
 * @author uniflualves
 */
public class NavioDeGuerra extends Navio{
    double blindagem;
    double ataque;

    public NavioDeGuerra(double blindagem, double ataque) {
        this.blindagem = blindagem;
        this.ataque = ataque;
    }

    public NavioDeGuerra(double blindagem, double ataque, int numTripulantes, String nome) {
        super(numTripulantes, nome);
        this.blindagem = blindagem;
        this.ataque = ataque;
    }

    public double getBlindagem() {
        return blindagem;
    }

    public double getAtaque() {
        return ataque;
    }




    public void setBlindagem(double blindagem) {
        this.blindagem = blindagem;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    
    public void poderDeFogo(){
        System.out.println("Valor do ataque=" + ataque);
    }
    
    public void exibirArmas(){
        super.exibirInfoGeral();
        System.out.println("Blindagem=" + blindagem);
        this.poderDeFogo();
    }
}
