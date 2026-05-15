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
        String sql = "INSERT INTO playlists (usuario, nomeplaylist) VALUES (?, ?)";

        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, usuario);
        st.setString(2, nomePlaylist);

        st.executeUpdate();
        conn.close();
    }

    public ResultSet listarPlaylists(String usuario) throws SQLException {
        String sql = "SELECT * FROM playlists WHERE usuario = ?";

        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, usuario);

        ResultSet rs = st.executeQuery();
        return rs;
    }

    public void deletarPlaylist(int idPlaylist) throws SQLException {
        String sql1 = "DELETE FROM playlist_itens WHERE id_playlist = ?";
        String sql2 = "DELETE FROM playlists WHERE id = ?";

        PreparedStatement st1 = conn.prepareStatement(sql1);
        st1.setInt(1, idPlaylist);
        st1.executeUpdate();

        PreparedStatement st2 = conn.prepareStatement(sql2);
        st2.setInt(1, idPlaylist);
        st2.executeUpdate();

        conn.close();
    }

    

    public void adicionarItem(int idPlaylist, String tipo, String nomeItem) throws SQLException {
        String sql = "INSERT INTO playlist_itens (id_playlist, tipo, nome_item) VALUES (?, ?, ?)";

        PreparedStatement st = conn.prepareStatement(sql);
        st.setInt(1, idPlaylist);
        st.setString(2, tipo);
        st.setString(3, nomeItem);

        st.executeUpdate();
        conn.close();
    }

    public void removerItem(int idPlaylist, String nomeItem) throws SQLException {
        String sql = "DELETE FROM playlist_itens WHERE id_playlist = ? AND nome_item = ?";

        PreparedStatement st = conn.prepareStatement(sql);
        st.setInt(1, idPlaylist);
        st.setString(2, nomeItem);

        st.executeUpdate();
        conn.close();
    }

    public ResultSet listarItensDaPlaylist(int idPlaylist) throws SQLException {
        String sql = "SELECT * FROM playlist_itens WHERE id_playlist = ?";

        PreparedStatement st = conn.prepareStatement(sql);
        st.setInt(1, idPlaylist);

        return st.executeQuery();
    }

}