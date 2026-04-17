/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.Divisao;
import model.Multiplicacao;
import model.OperacaoMatematica;
import view.Janela;
import model.Soma;
import model.Subtracao;
/**
 *
 * @author uniflualves
 */
public class Controle {
    private double n1;
    private double n2;
    private Janela view;
    
    private OperacaoMatematica op;

    public Controle(Janela view) {
        this.view = view;
    }
    
    public void controleLimpar(){
        view.getTxt_resultado().setText("");
        
    }
    
    public void colocarN(int n){
        String atual = view.getTxt_resultado().getText();
        view.getTxt_resultado().setText(atual+n);
    }
    
    public void salvarN(){
        n1 = Float.parseFloat(view.getTxt_resultado().getText());
        view.getTxt_resultado().setText("");
    }
    
    public void somar(){
       salvarN();
       op = new Soma();
       
        
    }
    
   public void subtrair(){
       salvarN();
       op = new Subtracao();
   }
   
   public void multiplicar(){
       salvarN();
       op = new Multiplicacao();
   }
   
   public void dividir(){
       salvarN();
       op = new Divisao();
   }
    
    public void igual(){
        n2 = Float.parseFloat(view.getTxt_resultado().getText());
        double r = op.calcular(n1, n2);
        view.getTxt_resultado().setText(String.valueOf(r));
        n1 = r;
    }
}
