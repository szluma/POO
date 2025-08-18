import java.util.Scanner;
public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura");
        float alt = scanner.nextFloat();

        System.out.println("Digite seu peso");
        float massa = scanner.nextFloat();

        float imc = massa/(alt*alt);
        System.out.println("O resultado do seu IMC é " + imc);
        
    }
}
