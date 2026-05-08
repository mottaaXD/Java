/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.Conexao;
import dao.SerieDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import view.TelaPrincipal;
import model.Serie;



/**
 *
 * @author uniflualves
 */
public class ControlePesquisar {
    private TelaPrincipal tp;

    public ControlePesquisar(TelaPrincipal tp) {
        this.tp = tp;
    }
    
    public void Pesquisar(){
        Serie serie;
        
        
        Conexao conexao = new Conexao();
        
        try{
            Connection conn = conexao.getConnection();
            SerieDAO dao = new SerieDAO(conn);
            ResultSet res = dao.buscarSerie(String.valueOf(tp.getTxt_pesquisa().getText()));
            while(res.next()){
                System.out.println(res.getString("nome"));
                
            }
        } catch(SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(tp, "Erro de conexão", "Erro", 
                                                JOptionPane.ERROR_MESSAGE);
        }
    }
}
