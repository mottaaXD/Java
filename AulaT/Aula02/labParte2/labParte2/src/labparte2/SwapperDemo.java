/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labparte2;

import java.util.Scanner;


public class SwapperDemo {
    
    
    public static void main(String[] args) {
        Swapper sp = new Swapper();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite valor de x: ");
        sp.setX(input.nextDouble());
        System.out.println("Digite valor de y: ");
        sp.setY(input.nextDouble());
        
        System.out.println("Valor de X: " + sp.getX());
        System.out.println("Valor de y: " + sp.getY());
        
        sp.swap();
        
        System.out.println("Valor de X: " + sp.getX());
        System.out.println("Valor de y: " + sp.getY());
       
    }
    
}
