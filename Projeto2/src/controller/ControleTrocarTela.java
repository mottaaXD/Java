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


public class ControleTrocarTela {
    private TelaInicio telaInicio;
    private Usuario usuario;
    private CardLayout cl;
    private CardLayout cl2;
    private TelaPrincipal tp;
    
    private ControlePesquisar cPesc;
    
    public ControleTrocarTela(TelaInicio telaInicio) {
        this.telaInicio = telaInicio;
        this.cl = (CardLayout) telaInicio.getPainelInicio().getLayout();
    }

    
    public ControleTrocarTela(TelaPrincipal tp){
        this.tp = tp;
        this.cl2 = (CardLayout) tp.getPainelCardPrincipal().getLayout();
        this.cPesc = new ControlePesquisar(tp);
    }
    
    
    //Trocar Telas do Inicio(cadastro, login)....
    public void trocarCadastro(){
        cl.show(telaInicio.getPainelInicio(), "cadastro");
    }
    
    public void trocarInicio(){
        cl.show(telaInicio.getPainelInicio(), "inicio");
    }
    
    public void trocarLogin(){
        cl.show(telaInicio.getPainelInicio(), "login");
    }
    
    
    //Trocar Telas da tela Principal
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
        tp.getTxt_pesquisa().setText("");
        cl2.show(tp.getPainelCardPrincipal(), "pesquisar");
        
    }
    
    
    public void trocarSerieResultado(){
        cl2.show(tp.getPainelCardPrincipal(), "serieResultados");
    }
}
