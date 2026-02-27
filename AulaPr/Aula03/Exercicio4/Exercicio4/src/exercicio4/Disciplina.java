
package exercicio4;


public class Disciplina {
    protected String codigo, nome;
    
    protected Aluno aluno;
    protected Professor professor;
    
    public Disciplina(String codigo, String nome, Aluno aluno, Professor professor){
        this.codigo = codigo;
        this.nome = nome;
        this.aluno = aluno;
        this.professor = professor;
    }
    
    public Aluno getAluno(){
        return aluno;
    }
    
    public Professor getProfessor(){
        return professor;
    }
    
    
    
    @Override
    public String toString(){
        return "CodigoDisciplina=" + codigo + "\nNomeDisciplina=" + nome +
                aluno + professor;
    }
    
}
