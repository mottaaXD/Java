/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invoice;

import java.util.Random;

/**
 *
 * @author uniflualves
 */
public class Invoice {
    private String id, desc;
    private int quant;
    private double preco;
    
    
    public void setId(String id){
        this.id = id;
    }
    
    public void setDesc(String desc){
        this.desc = desc;
    }
    
    public void setQuant(int quant){
        if(quant < 0) quant = 0;
        this.quant = quant;
    }
    
    public void setPreco(double preco){
        if(preco < 0) preco = 0;    
        this.preco = preco;
    }
    
    public String getId(){
        return this.id;
    }
    
    public String getDesc(){
        return this.desc;
    }
    
    public int getQuant(){
        return this.quant;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    public double getInvoiceAmount(){
        double invoiceAmount = this.preco * this.quant;
        return invoiceAmount;
    }
    
    @Override
    public String toString(){
        return "ID=" + id + "\nDesc=" + desc + "\nQuantidade=" + quant +
                "\nPreco=" + preco + "\nTotal=" + getInvoiceAmount();
    }

    
    
    
}
