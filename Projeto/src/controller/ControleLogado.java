/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.CardLayout;

import model.Usuario;
import view.TelaPrincipal;


/**
 *
 * @author Usuario
 */
public class ControleLogado {
    private TelaPrincipal tp;
    private Usuario usuarioLogado;
    public ControleLogado(TelaPrincipal tp, Usuario usuario) {
        this.tp = tp;
        this.usuarioLogado = usuario;
    }
    
    
}
