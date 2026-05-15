/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import dao.Conexao;
import dao.PlaylistDAO;
import view.TelaPrincipal;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import controller.ControleConteudoPlaylist;
import java.awt.Font;


/**
 *
 * @author Usuario
 */
public class ControleListarPlaylist {
    private TelaPrincipal tp;

    public ControleListarPlaylist(TelaPrincipal tp) {
        this.tp = tp;
        
    }

    public void abrirTelaPlaylists() {

        try {
            Connection conn = new Conexao().getConnection();
            PlaylistDAO dao = new PlaylistDAO(conn);

            String usuario = tp.getUsuarioLogado().getUsuarioNome();

            ResultSet rs = dao.listarPlaylists(usuario);

            JPanel painel = tp.getListaPlaylists();
            painel.removeAll();
            painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
            
            JButton btVoltarMenu = new JButton("Voltar");
            btVoltarMenu.addActionListener(e -> tp.getTrocarTela().trocarPlaylists());
            btVoltarMenu.setFont(new Font("Arial", Font.BOLD, 24));
            painel.add(btVoltarMenu);
            painel.add(Box.createVerticalStrut(10));

            while (rs.next()) {

                int id = rs.getInt("id");
                String nome = rs.getString("nomeplaylist");

                JButton bt = new JButton(nome);

                bt.addActionListener(e -> {
                    System.out.println("CLICOU NO BOTÃO");
                    ControleConteudoPlaylist c = new ControleConteudoPlaylist(tp);
                    c.carregarConteudoPlaylist(id, nome);
                    tp.getTrocarTela().trocarConteudoPlay();
                });

                painel.add(bt);
            }

            painel.revalidate();
            painel.repaint();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void abrirConteudoPlaylist(int idPlaylist) {
        System.out.println("Abrir playlist: " + idPlaylist);
    }
}
