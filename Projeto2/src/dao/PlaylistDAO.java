package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class PlaylistDAO {

    private Connection conn;

    public PlaylistDAO(Connection conn) {
        this.conn = conn;
    }


    public void criarPlaylist(String usuario, String nomePlaylist) throws SQLException {
        String sql = "INSERT INTO playlists (usuario, nome) VALUES (?, ?)";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, usuario);
        statement.setString(2, nomePlaylist);

        statement.executeUpdate();
        conn.close();
    }


    public void deletarPlaylist(int idPlaylist) throws SQLException {
        String sql1 = "DELETE FROM playlist_series WHERE id_playlist = ?";
        String sql2 = "DELETE FROM playlist_filmes WHERE id_playlist = ?";
        String sql3 = "DELETE FROM playlists WHERE id = ?";

        PreparedStatement s1 = conn.prepareStatement(sql1);
        s1.setInt(1, idPlaylist);
        s1.executeUpdate();

        PreparedStatement s2 = conn.prepareStatement(sql2);
        s2.setInt(1, idPlaylist);
        s2.executeUpdate();

        PreparedStatement s3 = conn.prepareStatement(sql3);
        s3.setInt(1, idPlaylist);
        s3.executeUpdate();

        conn.close();
    }

    
    public ResultSet listarPlaylists(String usuario) throws SQLException {
        String sql = "SELECT * FROM playlists WHERE usuario = ?";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, usuario);

        statement.execute();
        ResultSet resultado = statement.getResultSet();
        conn.close();
        return resultado;
    }


    public void adicionarSerie(int idPlaylist, int idSerie) throws SQLException {
        String sql = "INSERT INTO playlist_series (id_playlist, nomeserie) VALUES (?, ?)";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, idPlaylist);
        statement.setInt(2, idSerie);

        statement.executeUpdate();
        conn.close();
    }


    public void removerSerie(int idPlaylist, int idSerie) throws SQLException {
        String sql = "DELETE FROM playlist_series WHERE id_playlist = ? AND nomeserie = ?";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, idPlaylist);
        statement.setInt(2, idSerie);

        statement.executeUpdate();
        conn.close();
    }


    public void adicionarFilme(int idPlaylist, int idFilme) throws SQLException {
        String sql = "INSERT INTO playlist_filmes (id_playlist, nomefilme) VALUES (?, ?)";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, idPlaylist);
        statement.setInt(2, idFilme);

        statement.executeUpdate();
        conn.close();
    }


    public void removerFilme(int idPlaylist, int idFilme) throws SQLException {
        String sql = "DELETE FROM playlist_filmes WHERE id_playlist = ? AND nomefilme = ?";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, idPlaylist);
        statement.setInt(2, idFilme);

        statement.executeUpdate();
        conn.close();
    }


    public ResultSet listarSeriesDaPlaylist(int idPlaylist) throws SQLException {
        String sql = "SELECT s.* FROM series s " +
                     "JOIN playlist_series p ON s.id = p.nomeserie " +
                     "WHERE p.id_playlist = ?";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, idPlaylist);

        statement.execute();
        ResultSet resultado = statement.getResultSet();
        conn.close();
        return resultado;
    }


    public ResultSet listarFilmesDaPlaylist(int idPlaylist) throws SQLException {
        String sql = "SELECT f.* FROM filmes f " +
                     "JOIN playlist_filmes p ON f.id = p.nomefilme " +
                     "WHERE p.id_playlist = ?";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setInt(1, idPlaylist);

        statement.execute();
        ResultSet resultado = statement.getResultSet();
        conn.close();
        return resultado;
    }
}