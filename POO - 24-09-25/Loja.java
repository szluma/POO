public class Loja{ // Nome da classe
    public static void main(String[] args) { // Método principal
       Cliente cliente1 = new Cliente(); // Criação do objeto "Cliente"

        // Atributos do objeto criado
        cliente1.setNome("Maria Silva");
        cliente1.setCpf("123.456.789-00");
        cliente1.setEmail("maria.silva@email.com");

        // Imprimindo os dados do obejto cliente
        System.out.println("--- Dados do Cliente Cadastrado ---");
        System.out.println("Nome: " + cliente1.getNome()); // Saída de dados 
        System.out.println("CPF: " + cliente1.getCpf()); // Saída de dados
        System.out.println("Email: " + cliente1.getEmail()); // Saída de dados
    }
}