
package com.mycompany.exercicio3;

import java.util.ArrayList;


public class Exercicio3 {
    public static void main(String[] args) {
        ArrayList<String> lista1 = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();
    
        lista1.add("Oi");
        lista1.add("Tchau");
        
        lista2.addAll(lista1);

        System.out.print(lista2);
    }
}
