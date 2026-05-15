
package exemplo1;


public class ContaComum {
    protected int numero;
    protected int senha;
    protected double saldo;
    
    public ContaComum(int numero, int senha,  double saldo){
    this.numero = numero;
    this.senha = senha;
    this.saldo = saldo;
    }
    
    @Override
    public String toString(){
        return "\nNumero=" + numero + "\nSenha=" + senha + "\nSaldo=" + saldo;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}
