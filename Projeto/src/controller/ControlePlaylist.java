/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;


import dao.Conexao;
import dao.PlaylistDAO;
import model.Usuario;
import view.TelaPrincipal;

import java.sql.Connection;

/**
 *
 * @author Usuario
 */
public class ControlePlaylist {

    private TelaPrincipal tp;

    public ControlePlaylist(TelaPrincipal tp) {
        this.tp = tp;
    }

    public void criarPlaylist(String nomePlaylist) {

        try {
            Connection conn = new Conexao().getConnection();
            PlaylistDAO dao = new PlaylistDAO(conn);

            String usuario = tp.getUsuarioLogado().getUsuarioNome();

            dao.criarPlaylist(usuario, nomePlaylist);

            System.out.println("Playlist criada!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
