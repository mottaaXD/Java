
package exemplo1;

import java.util.Scanner;

public class TesteExemplo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ContaComum conta01 = new ContaComum(1, 123, 1000);
        Pessoa pessoa01 = new Pessoa("Lucas", "avenida joao", 1000, conta01);
        
        System.out.println(pessoa01);
    }
}
