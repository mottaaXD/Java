
package perfildesaude;

import java.util.Scanner;

public class TestePerfilDeSaude {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite seu nome");
        String nome = input.nextLine();
        System.out.println("Digite seu sobrenome");
        String sobrenome = input.nextLine();
        System.out.println("Digite seu sexo");
        String sexo = input.nextLine();
        System.out.println("Digite o dia em que nasceu");
        int dia = input.nextInt();
        System.out.println("Digite o mês");
        int mes = input.nextInt();
        System.out.println("Digite o ano");
        int ano = input.nextInt();
        System.out.println("Digite a altura");
        float altura = input.nextFloat();
        System.out.println("Digite o seu peso");
        float peso = input.nextFloat();
        
        PerfilDeSaude perf = new PerfilDeSaude(nome, sobrenome, sexo, dia, mes, ano, altura, peso);
        
        
        System.out.println(perf.toString());
    }
}
