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

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;

public class ControleCadastro {
    private TelaInicio ti;

    public ControleCadastro(TelaInicio ti) {
        this.ti = ti;
    }
    
    public void salvarUsuario(String usuarioNomeL, String nomeL, String senhaL){
        
        String usuarioNome = usuarioNomeL;
        String nome = nomeL;
        String senha = senhaL;
        Usuario usuario = new Usuario(usuarioNome, nome, senha);
        
        Conexao conexao = new Conexao();
        
        try{
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            dao.inserir(usuario);
            JOptionPane.showMessageDialog(ti, "Usuario Cadastrado!","Aviso", 
                                        JOptionPane.INFORMATION_MESSAGE);
        }catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(ti, "Usuário não cadastrado!");
        }
        
    }
}
