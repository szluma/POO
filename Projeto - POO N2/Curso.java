import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int id;
    private String nome;
    private String cargaHoraria;
    private List<Turma> turmas = new ArrayList<>();

    public Curso(int id, String nome, String cargaHoraria) {
        this.id = id;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public void vincularAluno(Aluno aluno, Turma turma) {
        turma.adicionarAluno(aluno);
    }

    public String getNome() { return nome; }

    public List<Turma> getTurmas() {
    return turmas;
}

    public void adicionarTurma(Turma turma) {
    turmas.add(turma);
}
}