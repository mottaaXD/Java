package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class CurtidasDAO {

    private Connection conn;

    public CurtidasDAO(Connection conn) {
        this.conn = conn;
    }

    

    public void curtirSerie(String usuario, String nomeSerie) throws SQLException {
        String sql = "INSERT INTO series_curtidas (usuario, nomeserie) VALUES (?, ?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, usuario);
        statement.setString(2, nomeSerie);
        statement.executeUpdate();
        conn.close();
    }

    public void descurtirSerie(String usuario, String nomeSerie) throws SQLException {
        String sql = "DELETE FROM series_curtidas WHERE usuario = ? AND nomeserie = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, usuario);
        statement.setString(2, nomeSerie);
        statement.executeUpdate();
        conn.close();
    }

    public ResultSet verificarCurtidaSerie(String usuario, String nomeSerie) throws SQLException {
        String sql = "SELECT * FROM series_curtidas WHERE usuario = ? AND nomeserie = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, usuario);
        statement.setString(2, nomeSerie);
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        conn.close();
        return resultado;
    }

    public ResultSet listarSeriesCurtidas(String usuario) throws SQLException {
        String sql = "SELECT s.* FROM series s " +
                     "JOIN series_curtidas c ON s.nome = c.nomeserie " +
                     "WHERE c.usuario = ?";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, usuario);
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        conn.close();
        return resultado;
    }


    

    public void curtirFilme(String usuario, String nomeFilme) throws SQLException {
        String sql = "INSERT INTO filmes_curtidos (usuario, nomefilme) VALUES (?, ?)";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, usuario);
        statement.setString(2, nomeFilme);
        statement.executeUpdate();
        conn.close();
    }

    public void descurtirFilme(String usuario, String nomeFilme) throws SQLException {
        String sql = "DELETE FROM filmes_curtidos WHERE usuario = ? AND nomefilme = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, usuario);
        statement.setString(2, nomeFilme);
        statement.executeUpdate();
        conn.close();
    }

    public ResultSet verificarCurtidaFilme(String usuario, String nomeFilme) throws SQLException {
        String sql = "SELECT * FROM filmes_curtidos WHERE usuario = ? AND nomefilme = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, usuario);
        statement.setString(2, nomeFilme);
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        conn.close();
        return resultado;
    }

    public ResultSet listarFilmesCurtidos(String usuario) throws SQLException {
        String sql = "SELECT f.* FROM filmes f " +
                     "JOIN filmes_curtidos c ON f.nome = c.nomefilme " +
                     "WHERE c.usuario = ?";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, usuario);
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        conn.close();
        return resultado;
    }
}
