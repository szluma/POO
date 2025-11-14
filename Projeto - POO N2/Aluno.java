public class Aluno extends Pessoa {
    private long matricula;
    
    public Aluno(long matricula, String nome, String cpf, String dtNascimento){
        super(nome, cpf, dtNascimento);
        this.matricula = matricula;
    }

    public void cadastrar() {
        System.out.println("Aluno cadastrado: " + nome);
}

    @Override
    public void visualizarDados() {
        System.out.println("Aluno: " + nome + " | Matrícula " + matricula + " | CPF: " + cpf + " | Nasc:" + dtNascimento);
   }
}
