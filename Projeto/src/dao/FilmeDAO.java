/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
    
/**
 *
 * @author Usuario
 */
public class FilmeDAO {
    private Connection conn;

    public FilmeDAO(Connection conn) {
        this.conn = conn;
    }
    
    public ResultSet buscarFilme(String pesquisa) throws SQLException{
        String sql = "SELECT * FROM filmes WHERE nome ILIKE ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, "%" + pesquisa + "%");
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        conn.close();
        return resultado;
    }
}
