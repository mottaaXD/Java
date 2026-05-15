/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carro;

import java.util.Scanner;

/**
 *
 * @author uniflualves
 */
public class TesteCarro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Carro carro01 = new Carro();
        Carro carro02 = new Carro("Ferrari", 2020, 1000000);
        Carro carro03 = new Carro("Porsche", "preto", 2022, 300000, 100);
        
        System.out.println(carro01);
        System.out.println(carro02);
        System.out.println(carro03);
    }
}
