/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.Conexao;
import dao.UsuarioDAO;
import java.awt.CardLayout;


import model.Usuario;
import view.TelaInicio;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;


public class ControleTelaInicio {
    private TelaInicio telaInicio;
    private Usuario usuario;
    private CardLayout cl;

    
    
    public ControleTelaInicio(TelaInicio telaInicio) {
        this.telaInicio = telaInicio;
        this.cl = (CardLayout) telaInicio.getPainelInicio().getLayout();
    }
    
    public void inicio(){
        cl.show(telaInicio.getPainelInicio(), "menu");
    }
    
    public void trocarCadastro(){
        cl.show(telaInicio.getPainelInicio(), "cadastro");
    }
}
