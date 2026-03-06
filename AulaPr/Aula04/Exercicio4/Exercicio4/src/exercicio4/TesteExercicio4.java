/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author uniflualves
 */
public class TesteExercicio4 {
    public static void main(String[] args) {
        ArrayList<ContaCorrente> contas = new ArrayList<>();
        Random random = new Random();
        
        contas.add(new ContaCorrente(0));
        
        
        for(int i = 0; i < 8; i++){
            contas.add(new ContaCorrente(1000));
        }
        
        
        System.out.println("Tamanho=" + contas.size());
        System.out.println(contas);
        
        contas.get(0).depositar(1000);
        
        contas.get(2).depositar(10000);
        
        System.out.println(contas);
        
        contas.get(2).sacar(5000);
        
        System.out.println(contas);
    }
}
