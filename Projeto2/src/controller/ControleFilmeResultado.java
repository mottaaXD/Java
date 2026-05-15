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

import model.Filme;
/**
 *
 * @author Usuario
 */
public class ControleFilmeResultado {
    private TelaPrincipal tp;
    private ControlePrincipal conP;
    public ControleFilmeResultado(TelaPrincipal tp) {
        this.tp = tp;
        this.conP = conP;
    }
    
    public void abrirResultado(Filme filme){
        tp.getLbl_filmeNomeR().setText(filme.getNome());
        if(filme.getDesc()== null) tp.getLbl_filmeDescR().setText("Sem descrição");
        else tp.getLbl_filmeDescR().setText(filme.getDesc());
        tp.getLbl_filmeDuracaoR().setText(filme.getDuracao());
        carregarImagem(filme.getImagem());
        tp.getTrocarTela().trocarFilmeResultado();
        atualizarBotao(filme.getNome());

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
    
    public void curtirFilme(String nomeFilme){
        try{
            Conexao conexao = new Conexao();
            Connection conn = conexao.getConnection();
            CurtidasDAO dao = new CurtidasDAO(conn);

            String usuario = tp.getUsuarioLogado().getUsuarioNome();

            ResultSet rs = dao.verificarCurtidaFilme(usuario, nomeFilme);

            if(rs.next()){
                dao = new CurtidasDAO(new Conexao().getConnection());
                dao.descurtirFilme(usuario, nomeFilme);
            }else{
                dao = new CurtidasDAO(new Conexao().getConnection());
                dao.curtirFilme(usuario, nomeFilme);
            }


            atualizarBotao(nomeFilme);

        }catch(Exception e){
            e.printStackTrace();
        }
}
    
   public void atualizarBotao(String nomeFilme){
        try{
            Conexao conexao = new Conexao();
            Connection conn = conexao.getConnection();
            CurtidasDAO dao = new CurtidasDAO(conn);

            String usuario = tp.getUsuarioLogado().getUsuarioNome();

            ResultSet rs = dao.verificarCurtidaFilme(usuario, nomeFilme);

            if(rs.next()){
                tp.getBt_curtirFilme().setText("Descurtir");
            }else{
                tp.getBt_curtirFilme().setText("Curtir");
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
