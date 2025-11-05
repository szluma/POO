import java.util.ArrayList;
import java.util.List;

public class Professor {
    private int id;
    private String nome;
    private String CPF;
    private String area;
    private List<Turma> turmas = new ArrayList<>();

    public Professor(int id, String nome, String CPF, String area) {
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
        this.area = area;
    }

    public void cadastrar() {
        System.out.println("Professor cadastrado: " + nome);
    }

    public void atribuirTurma(Turma turma) {
        turmas.add(turma);
        System.out.println("Turma atribuída ao professor " + nome + ": " + turma.getNome());
    }

    public String getNome() { return nome; }
}