/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import dao.Conexao;
import dao.PlaylistDAO;
import view.TelaPrincipal;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;


/**
 *
 * @author Usuario
 */
public class ControleSeletorPlaylist {

    private TelaPrincipal tp;

    public ControleSeletorPlaylist(TelaPrincipal tp) {
        this.tp = tp;
    }

    public void abrirSeletor(String tipo, String nomeItem) {

        try {
            Connection conn = new Conexao().getConnection();
            PlaylistDAO dao = new PlaylistDAO(conn);

            String usuario = tp.getUsuarioLogado().getUsuarioNome();

            ResultSet rs = dao.listarPlaylists(usuario);

            JPanel painel = new JPanel();
            painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));

            while (rs.next()) {

                int id = rs.getInt("id");
                String nome = rs.getString("nomeplaylist");

                JButton bt = new JButton(nome);

                bt.addActionListener(e -> {
                    try {
                        Connection conn2 = new Conexao().getConnection();
                        PlaylistDAO dao2 = new PlaylistDAO(conn2);

                        dao2.adicionarItem(id, tipo, nomeItem);

                        JOptionPane.showMessageDialog(null, "Adicionado na playlist!");

                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                });

                painel.add(bt);
            }

            JOptionPane.showMessageDialog(null, painel, "Escolha a Playlist", JOptionPane.PLAIN_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
