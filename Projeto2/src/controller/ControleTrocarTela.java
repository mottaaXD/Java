/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.Conexao;
import dao.UsuarioDAO;
import java.awt.CardLayout;


import model.Usuario;
import view.TelaInicio;
import view.TelaPrincipal;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;

import controller.ControlePesquisar;
import controller.ControleFilmeResultado;
import controller.ControleFilmesCurtidos;
import controller.ControleSeriesCurtidas;
import controller.ControleListarPlaylist;


public class ControleTrocarTela {
    private TelaInicio telaInicio;
    private Usuario usuario;
    private CardLayout cl;
    private CardLayout cl2;
    private TelaPrincipal tp;
    private ControleFilmeResultado cfr;
    private ControleFilmesCurtidos cfc;
    private ControleSeriesCurtidas csc;
    private ControleListarPlaylist clp;
    
    private ControlePesquisar cPesc;
    
    public ControleTrocarTela(TelaInicio telaInicio) {
        this.telaInicio = telaInicio;
        this.cl = (CardLayout) telaInicio.getPainelInicio().getLayout();
    }

    
    public ControleTrocarTela(TelaPrincipal tp){
        this.tp = tp;
        this.cl2 = (CardLayout) tp.getPainelCardPrincipal().getLayout();
        this.cPesc = new ControlePesquisar(tp);
        this.cfr = new ControleFilmeResultado(tp);
        this.cfc = new ControleFilmesCurtidos(tp);
        this.csc = new ControleSeriesCurtidas(tp);
        this.clp = new ControleListarPlaylist(tp);
    }
    
    
    
    public void trocarCadastro(){
        cl.show(telaInicio.getPainelInicio(), "cadastro");
    }
    
    public void trocarInicio(){
        cl.show(telaInicio.getPainelInicio(), "inicio");
    }
    
    public void trocarLogin(){
        cl.show(telaInicio.getPainelInicio(), "login");
    }
    
    
    
    public void trocarAlterarLogin(){
       
        cl2.show(tp.getPainelCardPrincipal(), "telaAlterar");
    }
    
    public void trocarMenu(){
        tp.getLbl_serieImagem().setIcon(null);
        cl2.show(tp.getPainelCardPrincipal(), "menuPrincipal");
    }
    
    public void trocarPesquisar(){
        cPesc.mostrarSerie1(false);
        cPesc.mostrarSerie2(false);
        cPesc.mostrarFilme1(false);
        cPesc.mostrarFilme2(false);
        tp.getTxt_pesquisa().setText("");
        cl2.show(tp.getPainelCardPrincipal(), "pesquisar");
        
    }
    
    
    public void trocarSerieResultado(){
        cl2.show(tp.getPainelCardPrincipal(), "serieResultados");
    }
    
    public void trocarFilmeResultado(){
        cl2.show(tp.getPainelCardPrincipal(), "filmeResultados");
    }
    
    public void trocarFilmesCurtidos(){
        cfc.carregarFilmesCurtidos();
        cl2.show(tp.getPainelCardPrincipal(), "filmesCurtidos");
    }
    
    public void trocarSeriesCurtidas(){
        csc.carregarSeriesCurtidos();
        cl2.show(tp.getPainelCardPrincipal(), "seriesCurtidas");
    }
    
    public void trocarPlaylists(){
        cl2.show(tp.getPainelCardPrincipal(), "playlists");
    }
    
    public void trocarListaPlaylists(){
        clp.abrirTelaPlaylists();
        cl2.show(tp.getPainelCardPrincipal(), "listaPlaylist");
    }
    
    public void trocarConteudoPlay(){
        cl2.show(tp.getPainelCardPrincipal(), "conteudoPlaylist");
    }
}
