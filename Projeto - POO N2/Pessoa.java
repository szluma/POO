public class Pessoa {
    protected String nome;
    protected String cpf;
    protected String dtNascimento;

    public Pessoa(String nome, String cpf, String dtNascimento){
        this.nome = nome;
        this.cpf = cpf;
        this.dtNascimento = dtNascimento;
    }

    public String getNome(){
        return nome;
    }

    public void visualizarDados(){
        System.out.println("Nome" + nome + " | CPF: " + cpf + " | Nascimento: " + dtNascimento);
    }
}