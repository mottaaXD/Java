/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import view.Janela;
import model.Soma;
/**
 *
 * @author uniflualves
 */
public class Controle {
    
    private Janela view;

    public Controle(Janela view) {
        this.view = view;
    }
    
    
    
    
    public void controleSomar(){
        double n1 = Float.parseFloat(view.getTxt_n1().getText());
        double n2 = Float.parseFloat(view.getTxt_n2().getText());
        
        Soma s = new Soma();
        double r = s.calcular(n1, n2);
        view.getTxt_resultado().setText(String.valueOf(r));
    }
    
    public void controleLimpar(){
        view.getTxt_n1().setText("");
        view.getTxt_n2().setText("");
        view.getTxt_resultado().setText("");
    }
}
