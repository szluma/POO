import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int codigo;
    private int anoEntrada;
    private String nome;
    private List<Aluno> alunos = new ArrayList<>();
    private List<Professor> professores = new ArrayList<>(); // declarada corretamente

    public Turma(int codigo, int anoEntrada, String nome) {
        this.codigo = codigo;
        this.anoEntrada = anoEntrada;
        this.nome = nome;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno " + aluno.getNome() + " adicionado à turma " + nome);
    }

    public void adicionarProfessor(Professor p) {
        professores.add(p);
        System.out.println("Professor " + p.getNome() + " vinculado à turma " + nome);
    }

    public void listarPessoas() {
        System.out.println("\n--- ALUNOS ---");
        if (alunos.isEmpty()) System.out.println("Nenhum aluno.");
        else alunos.forEach(x -> System.out.println(x.getNome()));

        System.out.println("\n--- PROFESSORES ---");
        if (professores.isEmpty()) System.out.println("Nenhum professor.");
        else professores.forEach(x -> System.out.println(x.getNome()));
    }

    public String getNome() { return nome; }

    public List<Aluno> getAlunos() { return alunos; }
    public List<Professor> getProfessores() { return professores; }
}