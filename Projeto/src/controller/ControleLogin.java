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
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author uniflualves
 */
public class ControleLogin {
    private TelaInicio ti;
    
    public ControleLogin(TelaInicio ti) {
        this.ti = ti;
    }
    
    public void logarUsuario(){
        Usuario usuario;
        usuario = new Usuario(ti.getTxt_usuarioNome().getText(), ti.getTxt_nome().getText(), ti.getTxt_senha().getText());
        
        Conexao conexao = new Conexao();
        
        try{
            Connection conn = conexao.getConnection();
            UsuarioDAO dao = new UsuarioDAO(conn);
            ResultSet res = dao.consultar(usuario);
            if(res.next()){
                JOptionPane.showMessageDialog(ti, "Login efetuado", "Aviso", 
                                                JOptionPane.INFORMATION_MESSAGE);
                String usuarioNome = res.getString("usuario");
                String senha = res.getString("senha");
                
            } else{
               
                JOptionPane.showMessageDialog(ti, "Login não efetuado", "Erro", 
                                                JOptionPane.ERROR_MESSAGE);
                
            }
        } catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(ti, "Erro de conexão", "Erro", 
                                                JOptionPane.ERROR_MESSAGE);
        }
    }
}
