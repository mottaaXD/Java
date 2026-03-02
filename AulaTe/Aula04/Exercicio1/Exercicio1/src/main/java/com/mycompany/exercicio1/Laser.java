
package com.mycompany.exercicio1;


public class Laser {
    protected String fabricante;
    protected int alcance, precisao;
    protected float medida;
    
    public Laser(String fabricante, int alcance, int precisao, float medida){
        this.fabricante = fabricante;
        this.alcance = alcance;
        this.precisao = precisao;
        this.medida = medida;
    }
    
    public Laser(float medida){
        this.medida = medida;
    }

    public float getMedida(){
        return this.medida;
    }
    
    
    @Override
    public String toString(){
        return "\nFabricante=" + this.fabricante + "\nAlcance=" + this.alcance
                + "\nPrecisao=" + this.precisao + "\nMedida=" + this.medida;
    }
}
