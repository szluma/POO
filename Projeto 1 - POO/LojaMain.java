public class LojaMain {
    public static void main(String[] args) {

    Funcionaria FuncionariaLoja = new Funcionaria ("Deb", 103107);
    
    System.out.println("--- Informações de Deb ---");
    FuncionariaLoja.exibirInfo();
    FuncionariaLoja.Vender();
    System.out.println("O nome da Funcionaria é: " + FuncionariaLoja.getNome());
    
    System.out.println("\n----------------------------\n");
    
    Cliente Cliente_Loja = new Cliente ("Lundy", "10349233060");
    
    System.out.println("--- Informações de Lundy ---");
    Cliente_Loja.exibirInfo();
    Cliente_Loja.comprar();
    System.out.println("O CPF do Lundy é: " + Cliente_Loja.getCPF());

        }    
} 
