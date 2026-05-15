/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplo;

import java.util.Scanner;

class Contas {
    public static void main(String[] args) {
        OperacaoMatematica operacao;
        
        Scanner input = new Scanner(System.in);
        String op = input.nextLine();
        
        if(op.equals("soma"))
            operacao = new Soma();
        else
            operacao = new Subtracao();
        
        System.out.println("Resultado: " + operacao.calcular(5, 4));
    }
}
