
package com.mycompany.aula02ex01;

import java.util.Scanner;


public class TestePessoa {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nomeLocal, cpfLocal;
        int idadeLocal;
        
        // criando o primeiro objeto da classe Pessoa
        Pessoa p1 = new Pessoa();
        System.out.println("Digite o nome da 1ª pessoa: ");
        nomeLocal = input.nextLine();
        p1.setNome(nomeLocal);
        System.out.println("Digite o cpf da 1ª pessoa: ");
        cpfLocal = input.nextLine();
        p1.setCpf(cpfLocal);
        System.out.println("Digite a idade da 1ª pessoa: ");
        idadeLocal = input.nextInt();
        p1.setIdade(idadeLocal);
        
        System.out.println("------------------------------");
        System.out.println("---- DADOS DA 1ª PESSOA ------");
        System.out.println("Nome...........: " + p1.getNome());
        System.out.println("CPF............: " + p1.getCpf());
        System.out.println("Idade..........: " + p1.getIdade());
        System.out.println("------------------------------");
    }
}
