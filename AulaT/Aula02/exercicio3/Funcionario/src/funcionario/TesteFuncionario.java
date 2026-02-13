/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionario;

import java.util.Scanner;

/**
 *
 * @author uniflualves
 */
public class TesteFuncionario {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        
        System.out.println("Digite o nome do funcionario 1: ");
        f1.setNome(input.nextLine());
        System.out.println("Digite o sobrenome do funcionario 1: ");
        f1.setSobreNome(input.nextLine());
        System.out.println("Digite o salario mensal do funcionario 1:");
        f1.setSalario(input.nextDouble());
        input.nextLine();
        
        System.out.println("Digite o nome do funcionario 2: ");
        f2.setNome(input.nextLine());
        System.out.println("Digite o sobrenome do funcionario 2: ");
        f2.setSobreNome(input.nextLine());
        System.out.println("Digite o salario mensal do funcionario 2:");
        f2.setSalario(input.nextDouble());
        input.nextLine();
        
        f1.salarioAnual();
        f2.salarioAnual();
        System.out.println("Salario anual do funcionario 1: " + f1.getSalario());
        System.out.println("Salario anual do funcionario 2: " + f2.getSalario());
        
        f1.setAumento();
        f2.setAumento();
        
        System.out.println("Salario anual com aumento do  funcionario 1: " + f1.getSalario());
        System.out.println("Salario anual com aumento do funcionario 2: " + f2.getSalario());
    }
}
