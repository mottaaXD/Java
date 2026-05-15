package controller;

import view.TelaPrincipal;
import dao.Conexao;
import dao.CurtidasDAO;

import java.sql.Connection;
import java.sql.ResultSet;
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

            JPanel painel = tp.getListaFilmesCurtidos(); 
            painel.removeAll();

            painel.setLayout(new javax.swing.BoxLayout(painel, javax.swing.BoxLayout.Y_AXIS));

            
            JPanel header = new JPanel(new java.awt.BorderLayout());
            header.setMaximumSize(new java.awt.Dimension(Integer.MAX_VALUE, 60));
            header.setPreferredSize(new java.awt.Dimension(0, 60));
            header.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 10, 5, 10));

            JLabel titulo = new JLabel("Filmes Curtidos");
            titulo.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 28));
            titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

            JButton btVoltarMenu = new JButton("Voltar");
            btVoltarMenu.addActionListener(e -> tp.getTrocarTela().trocarMenu());

            header.add(btVoltarMenu, java.awt.BorderLayout.EAST);
            header.add(titulo, java.awt.BorderLayout.CENTER);

            painel.add(header);
            painel.add(javax.swing.Box.createVerticalStrut(10));

            
            while (rs.next()) {

                String nomeFilme = rs.getString("nome");
                String imagem = rs.getString("imagem");

                final String nomeFilmeFinal = nomeFilme;
                final String imagemFinal = imagem;

                JPanel card = new JPanel();
                card.setLayout(new javax.swing.BoxLayout(card, javax.swing.BoxLayout.Y_AXIS));

                
                card.setMaximumSize(new java.awt.Dimension(250, 260));
                card.setPreferredSize(new java.awt.Dimension(250, 260));
                card.setAlignmentX(java.awt.Component.CENTER_ALIGNMENT);

                
                JLabel lblImagem = new JLabel();

                try {
                    java.net.URL url = getClass().getResource(imagemFinal);
                    javax.swing.ImageIcon icon = new javax.swing.ImageIcon(url);

                    java.awt.Image img = icon.getImage().getScaledInstance(
                            180, 180, java.awt.Image.SCALE_SMOOTH
                    );

                    lblImagem.setIcon(new javax.swing.ImageIcon(img));

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
                card.add(javax.swing.Box.createVerticalStrut(5));
                card.add(lblNome);
                card.add(javax.swing.Box.createVerticalStrut(5));
                card.add(btDescurtir);

                painel.add(card);
            }

            painel.revalidate();
            painel.repaint();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}