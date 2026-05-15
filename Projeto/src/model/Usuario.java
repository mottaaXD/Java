/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author uniflualves
 */
public class Usuario {
    private String usuarioNome, nome, senha;

    public Usuario(String usuarioNome, String nome, String senha) {
        this.usuarioNome = usuarioNome;
        this.nome = nome;
        this.senha = senha;
    }
    
    public String getUsuarioNome(){
        return usuarioNome;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }
    
    public void setUsuarioNome(String usuarioNome){
        this.usuarioNome = usuarioNome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
