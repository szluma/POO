import javax.swing.JOptionPane;
    class InterGraf {
    public static void main(String[] args) {
        String nome;
        
        nome = JOptionPane.showInputDialog("Qual seu nome?");
        JOptionPane.showMessageDialog(null, "O seu nome é " + nome);
    }
}
