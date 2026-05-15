/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio2;

/**
 *
 * @author uniflualves
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mensagem objeto = null;
        
        try{
        objeto.mensagem();
        }catch(NullPointerException e){
            System.out.println(e);
            objeto = new Mensagem();
            objeto.mensagem();
        }
    }
    
}
