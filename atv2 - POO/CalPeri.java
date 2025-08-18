import java.util.Scanner;
public class CalPeri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de cada lado para calcular o perímetro de determinado espaço");
        float lado1 = scanner.nextFloat();
        float lado2 = scanner.nextFloat();
        float lado3 = scanner.nextFloat();
        float lado4 = scanner.nextFloat();
        
        float perimetro = (lado1 + lado2 + lado3 + lado4);
        System.out.println("O perímetro é " + perimetro);
    }
}
