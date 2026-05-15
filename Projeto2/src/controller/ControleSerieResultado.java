/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.TelaPrincipal;
import dao.FilmeDAO;
import dao.Conexao;
import java.sql.ResultSet;
import controller.ControlePrincipal;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;

import dao.CurtidasDAO;

import model.Serie;
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
        if(serie.getDesc()== null) tp.getLbl_serieDescR().setText("Sem descrição");
        else tp.getLbl_serieDescR().setText(serie.getDesc());
        tp.getLbl_serieTemporadaR().setText(serie.getTemporadas());
        tp.getLbl_serieEpisodiosR().setText(serie.getEpisodios());
        carregarImagem(serie.getImagem());
        tp.getTrocarTela().trocarSerieResultado();
        atualizarBotao(serie.getNome());
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
            tp.getLbl_serieImagem().setIcon(null);
        }
    }
    
    public void curtirSerie(String nomeSerie){
        try{
            Conexao conexao = new Conexao();
            Connection conn = conexao.getConnection();
            CurtidasDAO dao = new CurtidasDAO(conn);

            String usuario = tp.getUsuarioLogado().getUsuarioNome();

            ResultSet rs = dao.verificarCurtidaSerie(usuario, nomeSerie);

            if(rs.next()){
                dao = new CurtidasDAO(new Conexao().getConnection());
                dao.descurtirSerie(usuario, nomeSerie);
            }else{
                dao = new CurtidasDAO(new Conexao().getConnection());
                dao.curtirSerie(usuario, nomeSerie);
            }


            atualizarBotao(nomeSerie);

        }catch(Exception e){
            e.printStackTrace();
        }
}
    
   public void atualizarBotao(String nomeSerie){
        try{
            Conexao conexao = new Conexao();
            Connection conn = conexao.getConnection();
            CurtidasDAO dao = new CurtidasDAO(conn);

            String usuario = tp.getUsuarioLogado().getUsuarioNome();

            ResultSet rs = dao.verificarCurtidaSerie(usuario, nomeSerie);

            if(rs.next()){
                tp.getBt_curtirSerie().setText("Descurtir");
            }else{
                tp.getBt_curtirSerie().setText("Curtir");
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
