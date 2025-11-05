import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int codigo;
    private int anoEntrada;
    private String nome;
    private Professor professor;
    private List<Aluno> alunos = new ArrayList<>();

    public Turma(int codigo, int anoEntrada, String nome, Professor professor) {
        this.codigo = codigo;
        this.anoEntrada = anoEntrada;
        this.nome = nome;
        this.professor = professor;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno " + aluno.getNome() + " adicionado à turma " + nome);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
        System.out.println("Aluno " + aluno.getNome() + " removido da turma " + nome);
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado na turma " + nome);
            return;
        }
        System.out.println("Alunos da turma " + nome + ":");
        for (Aluno a : alunos) {
            System.out.println("- " + a.getNome());
        }
    }

    public String getNome() { return nome; }
}