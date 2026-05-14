/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import controller.ControlePesquisar;
import model.Serie;
import view.TelaPrincipal;


/**
 *
 * @author Usuario
 */
public class ControleSerieResultado {
    private TelaPrincipal tp;

    public ControleSerieResultado(TelaPrincipal tp){
        this.tp = tp;
    }

    public void abrirResultado(Serie serie){
        tp.getLbl_serieNomeR().setText(serie.getNome());
        tp.getLbl_serieDescR().setText(serie.getDesc());
        carregarImagem(serie.getImagem());
        tp.getTrocarTela().trocarSerieResultado();
    }
    
    private void carregarImagem(String caminho){
        try{
            java.net.URL url = getClass().getResource(caminho);
            javax.swing.ImageIcon icon = new javax.swing.ImageIcon(url);

            java.awt.Image img = icon.getImage().getScaledInstance(
                    150, 150, java.awt.Image.SCALE_SMOOTH);

            tp.getLbl_serieImagem().setIcon(new javax.swing.ImageIcon(img));
            
        }catch(Exception e){
            System.out.println("Erro ao carregar imagem: " + caminho);
        }
    }
}
