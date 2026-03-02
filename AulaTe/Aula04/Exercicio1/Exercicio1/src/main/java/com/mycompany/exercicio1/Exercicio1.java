
package com.mycompany.exercicio1;

import java.util.Scanner;


public class Exercicio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Laser l[] = new Laser[10];
        
        /*for(int i = 0; i < 10; i++){
            System.out.println("Digite o fabricante, alcance, precisao, e a medida respectivamente");
            l[i] = new Laser(input.nextLine(), input.nextInt(), input.nextInt(), input.nextFloat());
            input.nextLine();
        }
        */
        for(int i = 0; i < 10; i++){
            System.out.println("Digite a medida do sensor" + (i+1));
            l[i] = new Laser(input.nextFloat());
            input.nextLine();
        }
        
        System.out.println("Medidas dos sensores: ");
        for(int i = 0; i < 10; i++){
            System.out.println("Laser" + (i+1) + ":" + l[i].getMedida());
        }
    }
}
