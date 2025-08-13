import java.util.Scanner;
public class Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os minutos");
        int minutos = scanner.nextInt();
        int segundos = minutos * 60;
        System.out.println(" O valor em minutos é " + minutos + " e transformado para segundos é " + segundos );
    }
    
}
