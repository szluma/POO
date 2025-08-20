import javax.swing.JOptionPane; // Pacote para uso da interface gráfica

public class Opr {           // Nome da classe

public static void main(String[] args) {   // método principal

float a;
float b;   // Declaração das variáveis

a = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor: "));   // Interface gráfica, cria uma caixa de diálogo
b = Float.parseFloat(JOptionPane.showInputDialog("Digite mais um valor: "));  // Interface gráfica, cria uma caixa de diálogo

JOptionPane.showMessageDialog(null, "O valor das suas equações são:\n Soma: " + (a + b)
+ "\n Subtração: " + (a - b) + "\n multiplicação: " + (a * b) + "\n Divisão: " + (a / b)); 

}   
}  // mostra o resultado das operações matemáticas {
    

