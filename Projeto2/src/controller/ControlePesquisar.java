/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.Conexao;
import dao.SerieDAO;
import dao.FilmeDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import view.TelaPrincipal;
import controller.ControleSerieResultado;
import model.Filme;


import model.Serie;


/**
 *
 * @author uniflualves
 */
public class ControlePesquisar {
    private TelaPrincipal tp;

    private Serie serie1;
    private Serie serie2;
    
    private Filme filme1;
    private Filme filme2;
    
    private ControleSerieResultado csr;
    private ControleFilmeResultado cfr;
    
    public ControlePesquisar(TelaPrincipal tp) {
        this.tp = tp;
        this.csr = new ControleSerieResultado(tp);
        this.cfr = new ControleFilmeResultado(tp);
        mostrarSerie1(false);
        mostrarSerie2(false);
        mostrarFilme1(false);
        mostrarFilme2(false);
    }
    
    public void mostrarSerie1(boolean visible){
        tp.getLbl_textNome1().setVisible(visible);
        tp.getLbl_textDesc1().setVisible(visible);
        tp.getLbl_textTemporada1().setVisible(visible);
        tp.getLbl_textEp1().setVisible(visible);        
        tp.getLbl_nomeSerie1().setVisible(visible);
        tp.getLbl_descSerie1().setVisible(visible);
        tp.getLbl_temporadasSerie1().setVisible(visible);
        tp.getLbl_episodiosSerie1().setVisible(visible);
    }
    
    public void mostrarSerie2(boolean visible){
        tp.getLbl_textNome2().setVisible(visible);
        tp.getLbl_textDesc2().setVisible(visible);
        tp.getLbl_textTemporada2().setVisible(visible);
        tp.getLbl_textEp2().setVisible(visible);  
        tp.getLbl_nomeSerie2().setVisible(visible);
        tp.getLbl_descSerie2().setVisible(visible);
        tp.getLbl_temporadasSerie2().setVisible(visible);
        tp.getLbl_episodiosSerie2().setVisible(visible);
    }
    
    public void mostrarFilme1(boolean visible){
        tp.getLbl_textNome3().setVisible(visible);
        tp.getLbl_textDesc3().setVisible(visible);
        tp.getLbl_textDuracao1().setVisible(visible);      
        tp.getLbl_nomeFilme1().setVisible(visible);
        tp.getLbl_descFilme1().setVisible(visible);
        tp.getLbl_duracaoFilme1().setVisible(visible);
    }
    
    public void mostrarFilme2(boolean visible){
        tp.getLbl_textNome4().setVisible(visible);
        tp.getLbl_textDesc4().setVisible(visible);
        tp.getLbl_textDuracao2().setVisible(visible);      
        tp.getLbl_nomeFilme2().setVisible(visible);
        tp.getLbl_descFilme2().setVisible(visible);
        tp.getLbl_duracaoFilme2().setVisible(visible);
    }
    
    
    public void pesquisar(){
        pesquisarSerie();
        pesquisarFilme();
    }
    
    public void pesquisarSerie(){

        
        
        Conexao conexao = new Conexao();
        
        mostrarSerie1(false);
        mostrarSerie2(false);
        

        
        try{
            Connection conn = conexao.getConnection();
            SerieDAO dao = new SerieDAO(conn);
            ResultSet resS = dao.buscarSerie(String.valueOf(tp.getTxt_pesquisa().getText()));
            
            int contador = 1;
            while(resS.next()){
                System.out.println(resS.getString("nome"));
                switch(contador){
                    case 1:
                        mostrarSerie1(true);
                        
                        tp.getLbl_nomeSerie1().setText(resS.getString("nome"));
                        
                        if(resS.getString("descricao") == null) tp.getLbl_descSerie1().setText("Sem Descrição");
                        else tp.getLbl_descSerie1().setText(resS.getString("descricao"));  
                        
                        tp.getLbl_temporadasSerie1().setText(resS.getString("temporadas"));
                        tp.getLbl_episodiosSerie1().setText(resS.getString("episodios"));
                        serie1 = new Serie(resS.getString("nome"),
                                resS.getString("descricao"),
                                resS.getString("temporadas"),
                                resS.getString("episodios"),
                                resS.getString("imagem"));

                        break;
                    case 2:
                        mostrarSerie2(true);
                        tp.getLbl_nomeSerie2().setText(resS.getString("nome"));
                        
                        if(resS.getString("descricao") == null) tp.getLbl_descSerie2().setText("Sem Descrição");
                        else tp.getLbl_descSerie2().setText(resS.getString("descricao"));  
                        
                        tp.getLbl_temporadasSerie2().setText(resS.getString("temporadas"));
                        tp.getLbl_episodiosSerie2().setText(resS.getString("episodios"));
                        
                        serie2 = new Serie(resS.getString("nome"),
                                resS.getString("descricao"),
                                resS.getString("temporadas"),
                                resS.getString("episodios"),
                                resS.getString("imagem"));
                               
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
    
    
   public void pesquisarFilme(){


        
        
        Conexao conexao = new Conexao();
        
        mostrarFilme1(false);
        mostrarFilme2(false);
        

        
        try{
            Connection conn = conexao.getConnection();
            FilmeDAO dao = new FilmeDAO(conn);
            ResultSet resF = dao.buscarFilme(String.valueOf(tp.getTxt_pesquisa().getText()));
            
            int contador = 1;
            while(resF.next()){
                System.out.println(resF.getString("nome"));
                switch(contador){
                    case 1:
                        mostrarFilme1(true);
                        
                        tp.getLbl_nomeFilme1().setText(resF.getString("nome"));
                        
                        if(resF.getString("descricao") == null) tp.getLbl_descFilme1().setText("Sem Descrição");
                        else tp.getLbl_descFilme1().setText(resF.getString("descricao"));                  
                        tp.getLbl_duracaoFilme1().setText(resF.getString("duracao"));
                        filme1 = new Filme(resF.getString("nome"),
                                resF.getString("descricao"),
                                resF.getString("duracao"),
                                resF.getString("imagem"));

                        break;
                    case 2:
                        mostrarFilme2(true);
                        
                        tp.getLbl_nomeFilme2().setText(resF.getString("nome"));
                        
                        if(resF.getString("descricao") == null) tp.getLbl_descFilme2().setText("Sem Descrição");
                        else tp.getLbl_descFilme2().setText(resF.getString("descricao"));                  
                        tp.getLbl_duracaoFilme2().setText(resF.getString("duracao"));
                        filme2 = new Filme(resF.getString("nome"),
                                resF.getString("descricao"),
                                resF.getString("duracao"),
                                resF.getString("imagem"));
                               
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
   
   public void clicarFilme1(){
       if(filme1 != null) cfr.abrirResultado(filme1);
   }
   
   public void clicarFilme2(){
       if(filme2 != null) cfr.abrirResultado(filme2);
   }
   
}
