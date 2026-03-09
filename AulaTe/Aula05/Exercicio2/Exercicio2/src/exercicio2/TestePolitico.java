/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author uniflualves
 */
public class TestePolitico {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nome, funcao, municipio, partido, estado;
        
        ArrayList<Prefeito> prefeitos = new ArrayList<>();
        ArrayList<Vereador> vereadores = new ArrayList<>();
        
        
        
        for(int i = 0; i < 4; i++){
            System.out.println("Informe o nome: ");
            nome = input.nextLine();
            System.out.println("Informe a funcao: ");
            funcao = input.nextLine();
            System.out.println("Infome o municipio: ");
            municipio = input.nextLine();
            System.out.println("Informe o partido: ");
            partido = input.nextLine();
            System.out.println("Informe o estado: ");
            estado = input.nextLine();
        
            if("vereador".equalsIgnoreCase(funcao)){
            vereadores.add(new Vereador(municipio, nome, partido, estado, funcao));
            }
        
            if("prefeito".equalsIgnoreCase(funcao)){
            prefeitos.add(new Prefeito(municipio, nome, partido, estado, funcao));
            }
        }
        
        for(Prefeito a : prefeitos){
            a.apresentacao();
        }
        
        for(Vereador b : vereadores){
            b.apresentacao();
        }
        
    }
}
