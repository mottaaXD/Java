/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author uniflualves
 */
public class TesteAluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Aluno> turma = new ArrayList<>();
        
        String nome, sobrenome, curso;
        int idade;
        
        turma.add(new Aluno());
        System.out.println("Informe o nome");
        nome = input.nextLine();
        System.out.println("Informe o sobrenome");
        sobrenome = input.nextLine();
        System.out.println("Inform o curso");
        curso = input.nextLine();
        System.out.println("Informe a idade");
        idade = input.nextInt();
        turma.add(new Aluno(curso, nome, sobrenome, idade));
        
        for(Aluno a : turma){
            a.print();
        }
        
        
        
        
    }
}
