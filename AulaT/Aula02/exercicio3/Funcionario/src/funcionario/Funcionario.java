
package funcionario;


public class Funcionario {
    
    private String nome;
    private String sobreNome;
    private double salario;
    
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setSobreNome(String sobreNome){
        this.sobreNome = sobreNome;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public void salarioMensal(){
        if(this.salario < 0)this.salario = 0;
    }
    
    public void salarioAnual(){
        this.salario = this.salario * 12;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getSobreNome(){
        return this.sobreNome;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
   
     public void setAumento(){
        this.salario += this.salario * 0.1;
    }
   
    
    
}
