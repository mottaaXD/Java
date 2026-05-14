package controller;

import view.TelaPrincipal;
import dao.Conexao;
import dao.CurtidasDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ControleFilmesCurtidos {

    private TelaPrincipal tp;

    public ControleFilmesCurtidos(TelaPrincipal tp) {
        this.tp = tp;
    }

    public void carregarFilmesCurtidos() {

        try {
            Conexao conexao = new Conexao();
            Connection conn = conexao.getConnection();

            CurtidasDAO dao = new CurtidasDAO(conn);

            String usuario = tp.getUsuarioLogado().getUsuarioNome();

            ResultSet rs = dao.listarFilmesCurtidos(usuario);

            JPanel painel = tp.getPainelFilmesCurtidos();
            painel.removeAll();

            painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));

            JLabel titulo = new JLabel("Filmes Curtidos");
            titulo.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 28));
            titulo.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);

            painel.add(titulo);
            painel.add(Box.createVerticalStrut(20));


            while (rs.next()) {

                String nomeFilme = rs.getString("nome");
                String imagem = rs.getString("imagem");

                final String nomeFilmeFinal = nomeFilme;
                final String imagemFinal = imagem;

                JPanel card = new JPanel();
                card.setLayout(new BoxLayout(card, BoxLayout.Y_AXIS));
                card.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);


                JLabel lblImagem = new JLabel();

                try {
                    java.net.URL url = getClass().getResource(imagemFinal);
                    ImageIcon icon = new ImageIcon(url);

                    java.awt.Image img = icon.getImage().getScaledInstance(
                            180, 180, java.awt.Image.SCALE_SMOOTH
                    );

                    lblImagem.setIcon(new ImageIcon(img));

                } catch (Exception e) {
                    lblImagem.setText("Sem imagem");
                }

                lblImagem.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);

                JLabel lblNome = new JLabel(nomeFilmeFinal);
                lblNome.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 18));
                lblNome.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);


                JButton btDescurtir = new JButton("Descurtir");
                btDescurtir.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);

                btDescurtir.addActionListener(e -> {
                    try {
                        Connection conn2 = new Conexao().getConnection();
                        CurtidasDAO dao2 = new CurtidasDAO(conn2);

                        dao2.descurtirFilme(usuario, nomeFilmeFinal);

                        painel.remove(card);
                        painel.revalidate();
                        painel.repaint();

                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                });


                card.add(lblImagem);
                card.add(Box.createVerticalStrut(5));
                card.add(lblNome);
                card.add(Box.createVerticalStrut(5));
                card.add(btDescurtir);
                card.add(Box.createVerticalStrut(20));

                painel.add(card);
            }

            painel.revalidate();
            painel.repaint();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}