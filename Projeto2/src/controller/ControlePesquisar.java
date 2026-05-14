/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.Conexao;
import dao.SerieDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import view.TelaPrincipal;
import controller.ControleSerieResultado;


import model.Serie;


/**
 *
 * @author uniflualves
 */
public class ControlePesquisar {
    private TelaPrincipal tp;

    private Serie serie1;
    private Serie serie2;
    private ControleSerieResultado csr;
    
    public ControlePesquisar(TelaPrincipal tp) {
        this.tp = tp;
        this.csr = new ControleSerieResultado(tp);
    }
    
    public void mostrarSerie1(boolean serie){
        tp.getLbl_nomeSerie1().setVisible(serie);
        tp.getLbl_descSerie1().setVisible(serie);
        tp.getLbl_temporadasSerie1().setVisible(serie);
        tp.getLbl_episodiosSerie1().setVisible(serie);
    }
    
    public void mostrarSerie2(boolean serie){
        tp.getLbl_nomeSerie2().setVisible(serie);
        tp.getLbl_descSerie2().setVisible(serie);
        tp.getLbl_temporadasSerie2().setVisible(serie);
        tp.getLbl_episodiosSerie2().setVisible(serie);
    }
    
    
    
    
    public void pesquisar(){

        
        
        Conexao conexao = new Conexao();
        
        mostrarSerie1(false);
        mostrarSerie2(false);
        
        try{
            Connection conn = conexao.getConnection();
            SerieDAO dao = new SerieDAO(conn);
            ResultSet res = dao.buscarSerie(String.valueOf(tp.getTxt_pesquisa().getText()));
            
            int contador = 1;
            while(res.next()){
                System.out.println(res.getString("nome"));
                switch(contador){
                    case 1:
                        mostrarSerie1(true);
                        
                        tp.getLbl_nomeSerie1().setText(res.getString("nome"));
                        
                        if(res.getString("descricao") == null) tp.getLbl_descSerie1().setText("Sem Descrição");
                        else tp.getLbl_descSerie1().setText(res.getString("descricao"));  
                        
                        tp.getLbl_temporadasSerie1().setText(res.getString("temporadas"));
                        tp.getLbl_episodiosSerie1().setText(res.getString("episodios"));
                        serie1 = new Serie(res.getString("nome"),
                                res.getString("descricao"),
                                res.getString("temporadas"),
                                res.getString("episodios"),
                                res.getString("imagem"));

                        break;
                    case 2:
                        mostrarSerie2(true);
                        tp.getLbl_nomeSerie2().setText(res.getString("nome"));
                        
                        if(res.getString("descricao") == null) tp.getLbl_descSerie2().setText("Sem Descrição");
                        else tp.getLbl_descSerie2().setText(res.getString("descricao"));  
                        
                        tp.getLbl_temporadasSerie2().setText(res.getString("temporadas"));
                        tp.getLbl_episodiosSerie2().setText(res.getString("episodios"));
                        
                        serie2 = new Serie(res.getString("nome"),
                                res.getString("descricao"),
                                res.getString("temporadas"),
                                res.getString("episodios"),
                                res.getString("imagem"));
                               
                        break;  
                }
                contador++;
                
                if(contador > 2) break;
                
               
                
            }
        } catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(tp, "Erro de conexão", "Erro", 
                                                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void clicarSerie1(){
        if(serie1 != null) csr.abrirResultado(serie1);
    }
    
    public void clicarSerie2(){
        if(serie2 != null) csr.abrirResultado(serie2);
    }
}
