/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

import java.util.ArrayList;

/**
 *
 * @author uniflualves
 */
public class Exercicio3 {
    public static void main(String[] args) {
        

        
        
        NavioMercante nm1 = new NavioMercante(1000, 300, 20, "navio mercante 1");
        NavioMercante nm2 = new NavioMercante(2000, 1500, 50, "navio mercante 2");
        
        nm1.carregamento();
        nm2.carregamento();
        
        Cruzador c1 = new Cruzador(3, 100, 5, 10, "cruzador 1");
        Cruzador c2 = new Cruzador(10, 20, 50, 15, "cruzador 2");
        
        c1.exibirArmas();
        c2.exibirArmas();
        
        PortaAvioes p1 = new PortaAvioes(3, 300, 20, 50, "porta avioes 1");
        PortaAvioes p2 = new PortaAvioes(10, 600, 30, 70, "porta avioes 2");
        
        p1.exibirArmas();
        p2.exibirArmas();
    }
}
