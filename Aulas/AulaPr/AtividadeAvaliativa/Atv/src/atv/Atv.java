/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atv;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author uniflualves
 */
public class Atv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PrintType f1 = new PrintType();
        PrintType f2 = new PrintType();
        PrintType f3 = new PrintType();
        
        
        f3.printTipo("Teste1", "Teste2");
        f2.printTipo(10);
        f1.printTipo(10.0);
    }
    
}
