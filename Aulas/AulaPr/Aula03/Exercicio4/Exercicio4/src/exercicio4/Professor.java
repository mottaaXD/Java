package exercicio4;

public class Professor {
    protected String nome, departamento;
    
   public Professor(String nome, String departamento){
       this.nome = nome;
       this.departamento = departamento;
   }
   
   public void setDepartamento(String departamento){
       this.departamento = departamento;
   }
   
   public void setNome(String nome){
       this.nome = nome;
   }
    
   @Override
    public String toString(){
        return "\nNomeProfessor=" + nome + "\nDepartamento=" + departamento;
    }
}
