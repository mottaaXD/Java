
package exercicio4;

public class TesteExercicio4 {
    
    
    public static void main(String[] args) {
        Disciplina disciplina1 = new Disciplina("123", "Matematica",
            new Aluno("Borboleto", "00001", "CC"),
            new Professor("Bruno", "Matematica"));
    
    
         System.out.println(disciplina1);
         
         
         disciplina1.getProfessor().setNome("Bruno2");
         System.out.println("\n\n" + disciplina1);
    }
}

