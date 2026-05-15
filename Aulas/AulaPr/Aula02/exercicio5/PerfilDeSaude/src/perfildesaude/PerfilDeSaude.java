
package perfildesaude;

public class PerfilDeSaude {
    
    private String nome, sobrenome, sexo;
    private int dia, mes, ano;
    private float altura, peso;
    
    public PerfilDeSaude(String nome, String sobrenome, String sexo, int dia, int mes, int ano, float altura, float peso){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.altura = altura;
        this.peso = peso;
    }
    
    public float calculoIMC(){
        float imc = peso/(altura * altura);
        return imc;
    }
    
    @Override
    public String toString(){
        return "Nome=" + nome + "\nSobrenome=" + sobrenome + "\nSexo=" + sexo + "\nData de Nascimento="
                + dia + "/" + mes + "/" + ano + "\nAltura=" + altura + "\nPeso=" + peso +
                "\nIMC=" + calculoIMC();
    }
    
}
