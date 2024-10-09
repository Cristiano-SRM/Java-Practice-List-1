package estruturaDoWhile;
import javax.swing.JOptionPane;
public class estruturaDoWhile1 {
	public static void main(String[] args) {
	  
	        String continuar = "";

	        do {
	            String entrada = JOptionPane.showInputDialog("Informe o número da conta corrente (3 dígitos): ");
	            int conta = Integer.parseInt(entrada);
	            if (entrada.length() != 3) {
	                JOptionPane.showMessageDialog(null, "A conta deve ter exatamente 3 dígitos.");
	                continue;
	            }

	            int centena = conta / 100;
	            int dezena = (conta / 10) % 10;
	            int unidade = conta % 10;
	            int contaInversa = (unidade * 100) + (dezena * 10) + centena;
	            int soma = conta + contaInversa;
	            int milhar = soma / 1000;
	            centena = (soma / 100) % 10;
	            dezena = (soma / 10) % 10;
	            unidade = soma % 10;
	            int resultado = (milhar * 0) + (centena * 1) + (dezena * 2) + (unidade * 3);
	            int digitoVerificador = resultado % 10;

	            JOptionPane.showMessageDialog(null, "O dígito verificador da conta " + conta + " é: " + digitoVerificador);

	            continuar = JOptionPane.showInputDialog("Deseja continuar? (S)im ou (N)ão");

	        } while (continuar.equalsIgnoreCase("s") || continuar.equalsIgnoreCase("sim"));

	        System.exit(0);
	    }
	}