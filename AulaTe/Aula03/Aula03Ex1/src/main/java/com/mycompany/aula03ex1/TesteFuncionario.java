
package com.mycompany.aula03ex1;

import java.util.Scanner;


public class TesteFuncionario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nome, sobrenome, sexo;
        int idade, numero;
        double salarioMensal;
        
        Funcionario f1 = new Funcionario();
        
        System.out.println("------- FUNCIONARIO 1 -------");
        System.out.println("Nome........: " + f1.getNome());
        System.out.println("Sobrenome...: " + f1.getSobrenome());
        System.out.println("Sexo........: " + f1.getSexo());
        System.out.println("Idade.......: " + f1.getIdade());
        System.out.println("Numero......: " + f1.getNumero());
        System.out.println("Salario.....: " + f1.getSalarioMensal());
        System.out.println("======================-------");
        
        System.out.println("Informe o nome: ");
        nome = input.nextLine();
        
        System.out.println("Informe o sobrenome: ");
        sobrenome = input.nextLine();
        
        System.out.println("Informe o sexo: ");
        sexo = input.nextLine();
        
        System.out.println("Informe a idade: ");
        idade = input.nextInt();
        
        System.out.println("Informe o numero: ");
        numero = input.nextInt();
        
        System.out.println("Informe o salario mensal: ");
        salarioMensal = input.nextDouble();
        
        Funcionario f2 = new Funcionario(nome, sobrenome, sexo, idade, numero,
                                         salarioMensal);
        
        System.out.println("------- FUNCIONARIO 2 -------");
        System.out.println("Nome........: " + f2.getNome());
        System.out.println("Sobrenome...: " + f2.getSobrenome());
        System.out.println("Sexo........: " + f2.getSexo());
        System.out.println("Idade.......: " + f2.getIdade());
        System.out.println("Numero......: " + f2.getNumero());
        System.out.println("Salario.....: " + f2.getSalarioMensal());
        System.out.println("======================-------");
    }
}
