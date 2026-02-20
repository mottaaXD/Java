/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package invoice;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author uniflualves
 */
public class InvoiceTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random nGen = new Random();
        
        Invoice inv = new Invoice();
        String id = "" + nGen.nextInt(900);
        
        inv.setId(id);
        System.out.println("Descre ou nomeie o item");
        inv.setDesc(input.nextLine());
        System.out.println("Digite a quantidade:");
        inv.setQuant(input.nextInt());
        System.out.println("Digite o preco");
        inv.setPreco(input.nextDouble());
        
        
        System.out.println(inv.toString());
        
        
    
        
        
    
    }
}
