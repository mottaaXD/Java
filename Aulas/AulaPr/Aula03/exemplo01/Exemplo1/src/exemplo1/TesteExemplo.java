
package exemplo1;

import java.util.Scanner;

public class TesteExemplo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Pessoa pessoa01 = new Pessoa("Lucas", "avenida joao", 1000, new ContaComum(1, 123, 10000));
        
        System.out.println(pessoa01);
        
        
        System.out.println("\n\n" + pessoa01.getConta());
        
        pessoa01.setConta(new ContaComum(1000, 1234, 15000));
        
        System.out.println("\n\n" + pessoa01);
        
        ContaComum contaPessoa = pessoa01.getConta();// ou pessoa01.getConta().setSaldo(tanto de saldo);
        contaPessoa.setSaldo(18500);
        
        System.out.println("\n\n" + pessoa01);
        
        
         pessoa01.getConta().setSaldo(20000);
         System.out.println("\n\n" + pessoa01);
    }
}
