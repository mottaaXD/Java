/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv;

/**
 *
 * @author uniflualves
 */
public class Funcionario extends Pessoa{
    public String cargo;
    public double salario;

    public Funcionario(String cargo, double salario, String cpf, String nome) {
        super(cpf, nome);
        this.cargo = cargo;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
    
    
    public  void ganharAumento(){
        this.salario += this.salario * 0.1;
    }
    
}
