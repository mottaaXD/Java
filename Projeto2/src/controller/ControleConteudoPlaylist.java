package controller;

import dao.Conexao;
import dao.PlaylistDAO;
import view.TelaPrincipal;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class ControleConteudoPlaylist {

    private TelaPrincipal tp;

    public ControleConteudoPlaylist(TelaPrincipal tp) {
        this.tp = tp;
    }

    public void carregarConteudoPlaylist(int idPlaylist, String nomePlaylist) {
        System.out.println("ABRINDO PLAYLIST: ");

        try {
            Connection conn = new Conexao().getConnection();
            PlaylistDAO dao = new PlaylistDAO(conn);

            ResultSet rs = dao.listarItensDaPlaylist(idPlaylist);

            JPanel painel = tp.getListaConteudoPlaylist();
            painel.removeAll();
            painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));

            
            JPanel header = new JPanel(new BorderLayout());
            header.setMaximumSize(new Dimension(Integer.MAX_VALUE, 60));
            header.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

            
            JButton btVoltar = new JButton("Voltar");
            btVoltar.setFont(new Font("Arial", Font.BOLD, 20));
            btVoltar.addActionListener(e -> tp.getTrocarTela().trocarPlaylists());
            header.add(btVoltar, BorderLayout.WEST);

            
            JPanel centerPanel = new JPanel(new GridBagLayout());
            centerPanel.setOpaque(false);

            JLabel titulo = new JLabel(nomePlaylist);
            titulo.setFont(new Font("Arial", Font.BOLD, 28));

            centerPanel.add(titulo);
            header.add(centerPanel, BorderLayout.NORTH);

            painel.add(header);
            painel.add(Box.createVerticalStrut(10));

            
            while (rs.next()) {

                String tipo = rs.getString("tipo");
                String nomeItem = rs.getString("nome_item");

                JPanel card = new JPanel();
                card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
                card.setAlignmentX(Component.CENTER_ALIGNMENT);
                card.setMaximumSize(new Dimension(250, 250));

                JLabel lblTipo = new JLabel(tipo.toUpperCase());
                lblTipo.setFont(new Font("Arial", Font.BOLD, 14));
                lblTipo.setAlignmentX(Component.CENTER_ALIGNMENT);

                JLabel lblNome = new JLabel(nomeItem);
                lblNome.setFont(new Font("Arial", Font.PLAIN, 18));
                lblNome.setAlignmentX(Component.CENTER_ALIGNMENT);

                JButton btRemover = new JButton("Remover");
                btRemover.setAlignmentX(Component.CENTER_ALIGNMENT);

                btRemover.addActionListener(e -> {
                    try {
                        Connection conn2 = new Conexao().getConnection();
                        PlaylistDAO dao2 = new PlaylistDAO(conn2);

                        dao2.removerItem(idPlaylist, nomeItem);

                        painel.remove(card);
                        painel.revalidate();
                        painel.repaint();

                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                });

                card.add(lblTipo);
                card.add(Box.createVerticalStrut(5));
                card.add(lblNome);
                card.add(Box.createVerticalStrut(5));
                card.add(btRemover);
                card.add(Box.createVerticalStrut(15));

                painel.add(card);
            }

            painel.revalidate();
            painel.repaint();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}