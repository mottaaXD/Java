/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import model.Usuario;

public class UsuarioDAO {
    private Connection conn;

    public UsuarioDAO(Connection conn) {
        this.conn = conn;
    }
    
    public ResultSet consultar(Usuario usuario) throws SQLException{
        System.out.println("Usuario: " + usuario.getUsuarioNome());
        System.out.println("Senha: " + usuario.getSenha());
        String sql = "SELECT * FROM userdata WHERE usuario = ? AND senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, usuario.getUsuarioNome());
        statement.setString(2, usuario.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        conn.close();
        return resultado;
    }
    
    public void inserir(Usuario usuario) throws SQLException{
        String sql = "INSERT INTO userdata (usuario, nome, senha) VALUES (?, ?, ?)";
    
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, usuario.getUsuarioNome());
        statement.setString(2, usuario.getNome());
        statement.setString(3, usuario.getSenha());
    
        statement.executeUpdate();
        conn.close();
    }
    
    public void atualizarDados(Usuario usuario) throws SQLException{
        String sql = "update userdata set nome = ?, senha =  ? where usuario = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, usuario.getNome());
        statement.setString(2, usuario.getSenha());
        statement.setString(3, usuario.getUsuarioNome());
        statement.execute();
        conn.close();
    }
    
    
}
