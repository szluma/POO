public class Professor extends Pessoa {
    private long rg;
    private String area;

    public Professor(long rg, String nome, String cpf, String dtNascimento, String area) {
        super(nome, cpf, dtNascimento); 
        this.rg = rg;
        this.area = area;
    }

    public void cadastrar() {
        System.out.println("Professor cadastrado: " + nome);
    }

    @Override
    public void visualizarDados() {
        System.out.println("Professor: " + nome + " | ID: " + rg + " | CPF: " + cpf + " | Área: " + area);
    }
}