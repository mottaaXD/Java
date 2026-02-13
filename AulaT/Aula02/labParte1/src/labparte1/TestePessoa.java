
package labparte1;

import java.util.Scanner;

public class TestePessoa {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        
        System.out.println("Digite o nome: ");
        p1.setNome(input.nextLine());
        System.out.println("Digite o cpf: ");
        p1.setCpf(input.nextLine());
        System.out.println("Digite a idade: ");
        p1.setIdade(input.nextInt());
        input.nextLine();
        
        
        System.out.println("Digite o nome de p2: ");
        p2.setNome(input.nextLine());
        System.out.println("Digite o cpf de p2: ");
        p2.setCpf(input.nextLine());
        System.out.println("Digite a idade de p2: ");
        p2.setIdade(input.nextInt());
        input.nextLine();
        
        System.out.println("Digite o nome de p3: ");
        p3.setNome(input.nextLine());
        System.out.println("Digite o cpf de p3: ");
        p3.setCpf(input.nextLine());
        System.out.println("Digite a idade de p3: ");
        p3.setIdade(input.nextInt());
        input.nextLine();
        
        p1.setNome("Fulano");
        
        System.out.println("Nome p1 " + p1.getNome());
        System.out.println("CPF p1 " + p1.getCpf());
        System.out.println("Idade p1 " + p1.getIdade());
        
        System.out.println("Nome p2 " + p2.getNome());
        System.out.println("CPF p2 " + p2.getCpf());
        System.out.println("Idade p2 " + p2.getIdade());
        
        System.out.println("Nome p3 " + p3.getNome());
        System.out.println("CPF p3 " + p3.getCpf());
        System.out.println("Idade p3 " + p3.getIdade());
    }
}
