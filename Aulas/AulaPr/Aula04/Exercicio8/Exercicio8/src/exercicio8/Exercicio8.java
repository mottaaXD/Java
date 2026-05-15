/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author uniflualves
 */
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String esc;
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        
        while(true){
            System.out.println("Entre com uma das seguintes opções\nn [nova entrada]\n"
                + "d [apaga registro da agenda]\np [imprime toda a agenda]\n"
                + "q [sai do programa]");
            esc = input.nextLine();
            
            
            if(esc.equalsIgnoreCase("n")){
            String nome, telefone;
            System.out.println("Digite o nome");
            nome = input.nextLine();
            System.out.println("Digite o seu telefone");
            telefone = input.nextLine();
            pessoas.add(new Pessoa(nome, telefone));
            }
            
            if(esc.equalsIgnoreCase("d")){
                System.out.println("Digite o nome que deseja deletar");
                String esc2 = input.nextLine();
                for(Pessoa agenda : pessoas){
                    if(agenda.getNome().equalsIgnoreCase(esc2)){
                        pessoas.remove(agenda);
                        System.out.println("Contato removido");
                        break;
                    }
                }
            }
            
            if(esc.equalsIgnoreCase("p")){
                for(Pessoa agenda : pessoas){
                    System.out.println(agenda + "\n");
                }
            }
            
            if(esc.equalsIgnoreCase("q")) break;
        }
        
        
        
    }
}
