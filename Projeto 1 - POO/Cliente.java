public class Cliente {
    private String nome;
    private String CPF;

    public Cliente (String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public void comprar() {
        System.out.println(this.nome + " está fazendo a feira!");
    }

    public void exibirInfo() {
        System.out.println("Nome: " + this.nome + ", CPF: " + this.CPF + ".");
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }
}
