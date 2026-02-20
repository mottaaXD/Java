
package televisao;

import java.util.Scanner;
import java.util.Set;


public class TelevisaoTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Televisao tv1 = new Televisao();
        Televisao tv2 = new Televisao();
        
        tv1.setModelo("TV1");
        tv1.setPreco(2000);
        tv1.setTamanho(40);
        tv1.setVolume(10);
        tv1.setCanal(5);
        tv1.setLigada(true);
        System.out.println(tv1.toString());
        
        System.out.println("Digite o modelo da segunda tv");
        tv2.setModelo(input.nextLine());
        System.out.println("Digite o preco da segunda tv");
        tv2.setPreco(input.nextFloat());
        System.out.println("Digite o tamanho da segunda tv");
        tv2.setTamanho(input.nextFloat());
        System.out.println("Digite o volume da segunda tv");
        tv2.setVolume(input.nextInt());
        System.out.println("Digite o canal da segunda tv");
        tv2.setCanal(input.nextInt());
        tv2.setLigada(true);
        System.out.println(tv2.toString());
        
        while(tv2.getLigada()){
            System.out.println("Deseja desligar tv? [S] [N]");
            String escolha;
            escolha = input.nextLine();
            if(escolha.equalsIgnoreCase("S")){
                tv2.setLigada(false);
                System.out.println("Desligando....\nUltimas informações da TV:" + tv2.toString2());
            }
            else{
                System.out.println(tv2.toString());
                
            }
        }
        
        
    }
}
