/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

/**
 *
 * @author uniflualves
 */
public class NavioMercante extends Navio{
    private double capacidadeCarga, carga;

    public NavioMercante(double capacidadeCarga, double carga) {
        this.capacidadeCarga = capacidadeCarga;
        this.carga = carga;
    }

    public NavioMercante(double capacidadeCarga, double carga, int numTripulantes, String nome) {
        super(numTripulantes, nome);
        this.capacidadeCarga = capacidadeCarga;
        this.carga = carga;
    }

    

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    public void carregamento(){
        super.exibirInfoGeral();
        System.out.println("Capacidade de carga=" + capacidadeCarga);
        System.out.println("Carga=" + carga);
    }
    
}
