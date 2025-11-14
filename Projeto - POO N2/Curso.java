import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int codigo;
    private String nome;
    private String cargaHoraria;
    private List<Turma> turmas = new ArrayList<>();

    public Curso(int codigo, String nome, String cargaHoraria){
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public void vincularAluno(Aluno aluno, Turma turma){
        turma.adicionarAluno(aluno);
    }

    public void removerAluno(Aluno aluno, Turma turma){
        turma.removerAluno(aluno);
    }

    public String getNome(){
        return nome;
    }

}