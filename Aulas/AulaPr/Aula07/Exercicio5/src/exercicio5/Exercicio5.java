/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author uniflualves
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       while(true){
        
        
        try{
            System.out.println("Digite um numero: ");
            int numero01 = input.nextInt();
            System.out.println("DIgite um segundo numero");
            int numero02 = input.nextInt();
            int resultado = numero01/numero02;

            System.out.printf("A divisao de %d/%d = %d", numero01, numero02, resultado);
            break;
        }catch(Exception e){
            System.out.println(e);

        }
    }
    }
    
}
