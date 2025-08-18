import java.util.Scanner;
public class OprBas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite dois números");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int soma = (num1 + num2);
        System.out.println("O resultado da soma é " + soma);
        int sub = (num1 - num2);
        System.out.println("O resultado da subtração é " + sub);
        int multi = (num1 * num2);
        System.out.println("O resultado da multiplicação é " + multi);
        int div = (num1 / num2);
        System.out.println("O resultado da divisão é " + div);
    }
}