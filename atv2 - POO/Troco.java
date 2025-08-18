import java.util.Scanner;
public class Troco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas notas de cinco vão ser precisas para pagar a conta?");
        int notas = scanner.nextInt();
        int valor = (notas * 5);

        System.out.println("Digite número de pedidos");
        int produtos = scanner.nextInt();
        int valorpro = (produtos * 7);

        if (valorpro > valor) {
            System.out.println("Você não tem dinheiro suficiente!");
        }
        else {
            int total = (valor - valorpro);
            System.out.println("O valor que você tem é " + valor + ", o valor do seu produto é " + valorpro + " e seu troco vai ser " + total);
        }
        
    }
}
