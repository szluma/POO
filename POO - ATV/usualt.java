import java.util.Scanner;
public class usualt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Sua altura é" + altura + " m e seu peso é" + peso + "kg");
    }
}
