/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4;

/**
 *
 * @author uniflualves
 */
public class ContaCorrente {
    private double saldo;
    
    public ContaCorrente(double saldo){
        this.saldo = saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    /**
     * 
     * 
     * @return retorna o saldo  
     */
    public double getSaldo(double saldo){
        return this.saldo;
    }
    
    /**
     * 
     * @param valor  Valor usado para descontar do saldo
     */
    
    public void sacar(double valor){
        if(valor > 0) this.saldo -= valor;
    }
    
    /**
     * 
     * @param valor valor utilizado para somar no saldo
     */
    
    public void depositar(double valor){
        if(valor > 0) this.saldo += valor;
    }
    
    @Override
    public String toString(){
        return "\nSaldo= " + this.saldo;
    }
}
