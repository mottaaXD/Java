/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import model.Serie;

/**
 *
 * @author uniflualves
 */
public class SerieDAO {
    private Connection conn;

    public SerieDAO(Connection conn) {
        this.conn = conn;
    }
    
    public ResultSet buscarSerie(String pesquisa) throws SQLException{
        String sql = "SELECT * FROM series WHERE LOWER(nome) LIKE ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, "%" + pesquisa.toLowerCase() + "%");
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        conn.close();
        return resultado;
    }
    
   
}
