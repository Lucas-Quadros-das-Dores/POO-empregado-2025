import javax.swing.JOptionPane;

public class SomaDoisNumeros {
    public static void main(String[] args) {
        double primeirovalor;
        double segundovalor;
        double resultado;
        String textoUsuario = JOptionPane.showInputDialog("Digite o primeiro valor: ");
        primeirovalor = Double.parseDouble(textoUsuario);
        segundovalor = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        resultado = primeirovalor + segundovalor;
        String operacao = primeirovalor + " + " + segundovalor + " = " + resultado;
        JOptionPane.showMessageDialog(null, "O resultado é: " + resultado + "\n" + operacao);

    }
}
