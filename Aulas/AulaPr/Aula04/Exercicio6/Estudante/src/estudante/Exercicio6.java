/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudante;

import java.util.ArrayList;

/**
 *
 * @author uniflualves
 */
public class Exercicio6 {
    public static void main(String[] args) {
        ArrayList<Estudante> estudantes = new ArrayList<>();
        
        for(int i = 0; i < 30; i++){
            estudantes.add(new Estudante("Teste", "Sobrenome"));
        }
        
        System.out.println("\nTamanho=" + estudantes.size());
        
        for(Estudante aluno : estudantes){
            System.out.println(aluno + "\n");
        }
    }
}
