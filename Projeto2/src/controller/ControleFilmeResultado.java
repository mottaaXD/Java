/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import view.TelaPrincipal;

import model.Filme;
/**
 *
 * @author Usuario
 */
public class ControleFilmeResultado {
    private TelaPrincipal tp;

    public ControleFilmeResultado(TelaPrincipal tp) {
        this.tp = tp;
    }
    
    public void abrirResultado(Filme filme){
        tp.getLbl_filmeNomeR().setText(filme.getNome());
        tp.getLbl_filmeDescR().setText(filme.getDesc());
        tp.getLbl_filmeDuracaoR().setText(filme.getDuracao());
        carregarImagem(filme.getImagem());
        tp.getTrocarTela().trocarFilmeResultado();
    }
    
    private void carregarImagem(String caminho){
        try{
            java.net.URL url = getClass().getResource(caminho);
            javax.swing.ImageIcon icon = new javax.swing.ImageIcon(url);

            java.awt.Image img = icon.getImage().getScaledInstance(
                    150, 150, java.awt.Image.SCALE_SMOOTH);

            tp.getLbl_filmeImagem().setIcon(new javax.swing.ImageIcon(img));
            
        }catch(Exception e){
            System.out.println("Erro ao carregar imagem: " + caminho);
            tp.getLbl_filmeImagem().setIcon(null);
        }
    }
}
