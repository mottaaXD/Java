/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.Conexao;
import dao.UsuarioDAO;
import java.awt.CardLayout;

import model.Usuario;
import view.TelaPrincipal;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class ControleAlterarLogin {
    private TelaPrincipal tp;
    private Usuario usuario;

    public ControleAlterarLogin(TelaPrincipal tp, Usuario usuario) {
        this.tp = tp;
        this.usuario = usuario;
    }
    
    public void atualizarDados(){
        String nome = usuario.getNome();
        String novoNome = tp.getTxt_novoNome().getText();
        
        String usuarioNome = usuario.getUsuarioNome();
        
        String senha = usuario.getSenha();
        String novaSenha = tp.getTxt_novaSenha().getText();
        
        if(novoNome.isEmpty()) novoNome = nome;
        
        if(novaSenha.isEmpty()) novaSenha = senha;
            
        usuario.setNome(novoNome);
        usuario.setSenha(novaSenha);
        
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            dao.atualizarDados(usuario);
            tp.getLbl_usuarioLogado().setText(usuario.getNome());
            
            JOptionPane.showMessageDialog(tp, "Senha de Usuário atualizada com Sucesso!", 
                                        "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(tp, "Falha de conexão!", 
                                        "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
}
