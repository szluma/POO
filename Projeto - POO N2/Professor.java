public class Professor extends Pessoa {
    private int id;
    private String area;

    public Professor(int id, String nome, String cpf, String dtNascimento, String area){
        super(nome, cpf, dtNascimento);
        this.id = id;
        this.area = area;
    }

    public void cadastrar(){
        System.out.println("Professor cadastrado: " + nome);
    }

    @Override
    public void visualizarDados(){
        System.out.println("Professor: " + nome + " | ID: " + id + "| CPF: " + cpf + "| Área: " + area);
    }
}