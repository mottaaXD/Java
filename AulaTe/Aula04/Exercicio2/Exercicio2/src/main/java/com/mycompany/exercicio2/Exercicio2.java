
package com.mycompany.exercicio2;

import java.util.ArrayList;


public class Exercicio2 {
    
    public static void main(String[] args) {
        ArrayList<String> c1 = new ArrayList<>();
        ArrayList<String> c2 = new ArrayList<>();
    
        c1.add("Azul");
        c1.add("Vermelho");
        c1.add("Amarelo");
        
        c2.add("Amarelo");
        c2.add("Vermelho");
        c2.add("Azul");
        
        if(c1.containsAll(c2) && c2.containsAll(c1)){
            System.out.println("Conteudo igual");
        }
    }
    
            
}
