import java.util.Scanner;
public class SalarioMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float SlrMin = 788;
        System.out.println("Digite o valor do seu salário ");
        float salarioUsu = scanner.nextFloat();

        float quant = salarioUsu/SlrMin;

        System.out.println(" A quantidade de salarios é " + quant);
         

    }
}

