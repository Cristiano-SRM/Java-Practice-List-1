package javaEstruturaSequencial;
import javax.swing.JOptionPane;
public class estruturaSequencial3PANEL {

	public static void main(String[] args) {
		String dolarValor, dolarUser;
		dolarValor=JOptionPane.showInputDialog("Qual a cotação atual do dolar? ");
		dolarUser=JOptionPane.showInputDialog("Quantos dolares você tem? ");
		double valorDolar = Double.parseDouble(dolarValor.replace(",", "."));
		double quantidadeDolares = Double.parseDouble(dolarUser.replace(",", "."));

		double resultado = valorDolar * quantidadeDolares;
		JOptionPane.showMessageDialog(null, "Você tem, em reais: " + resultado);
		
	}
}