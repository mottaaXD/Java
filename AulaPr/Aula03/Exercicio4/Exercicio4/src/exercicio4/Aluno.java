
package exercicio4;


public class Aluno {
    protected String nome, ra, curso;
    
    
    public Aluno(String nome, String ra, String curso){
        this.nome = nome;
        this.ra = ra;
        this.curso = curso;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }
    
    @Override
    public String toString(){
        return "\nNomeAluno=" + nome + "\nRA=" + ra + "\nCurso=" + curso;
    }
}
