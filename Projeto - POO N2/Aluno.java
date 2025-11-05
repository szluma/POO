public class Aluno {
    private long matricula;
    private String nome;
    private String cpf;
    private String dt_nascimento;

    public Aluno(long matricula, String nome, String cpf, String dt_nascimento) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.dt_nascimento = dt_nascimento;
    }

    public void cadastrar() {
        System.out.println("Aluno cadastrado: " + nome);
    }

    public void visualizarDados() {
        System.out.println("Nome: " + nome + " | Matrícula: " + matricula + " | Nascimento: " + dt_nascimento + " | CPF: " + cpf);
    }

    public String getNome() { return nome; }
}