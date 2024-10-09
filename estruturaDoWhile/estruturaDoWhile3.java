package estruturaDoWhile;
import javax.swing.JOptionPane;
public class estruturaDoWhile3 {

    public static void main(String[] args) {
        String continuar;

        do {

            String entradaSalarioMinimo = JOptionPane.showInputDialog("Informe o valor do salário mínimo: ");
            double salarioMinimo = Double.parseDouble(entradaSalarioMinimo);

            String entradaSalarioFuncionario = JOptionPane.showInputDialog("Informe o valor do salário do funcionário: ");
            double salarioFuncionario = Double.parseDouble(entradaSalarioFuncionario);

            double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;

            JOptionPane.showMessageDialog(null, "O funcionário recebe " + quantidadeSalariosMinimos + " salários mínimos.");

            continuar = JOptionPane.showInputDialog("Deseja calcular para outro funcionário? (S)im ou (N)ão");

        } while (continuar.equalsIgnoreCase("s") || continuar.equalsIgnoreCase("sim"));

        System.exit(0);
    }
}