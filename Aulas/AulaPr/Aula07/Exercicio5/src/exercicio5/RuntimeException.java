/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio5;

/**
 *
 * @author uniflualves
 */

class Arithmetic extends Exception{
    public Arithmetic(String message){
        
        
    }
}

class InputMismatch extends Exception{
    public InputMismatch(String message){
        super(message);
    }
}

class NumNegativo extends Exception{
    public NumNegativo(int n){
        if(n<0) System.out.println("Digite numero positivo!");
    }
}

public class RuntimeException extends Exception{
    
    
    public static void getMessage(int escolha, int num) throws Arithmetic, InputMismatch, NumNegativo{
        if(escolha == 1) throw new Arithmetic("Erro: digite novamente os valores sem 0 no segundo numero");
        else if(escolha == 2) throw new InputMismatch("Digite novamente os valores, digite apenas numeros inteiros");
        else if(escolha == 3) throw new NumNegativo(num);
    }
}
