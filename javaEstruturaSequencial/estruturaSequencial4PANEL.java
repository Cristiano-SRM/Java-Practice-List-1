package javaEstruturaSequencial;
import javax.swing.JOptionPane;

public class estruturaSequencial4PANEL {

	public static void main(String[] args) {
		String salario;
		salario=JOptionPane.showInputDialog("Qual o seu salario? ");
		int salarioInt=Integer.parseInt(salario);
		int salarionovo=salarioInt+(salarioInt/4);
		JOptionPane.showInternalMessageDialog(null,"Seu novo salario com aumento de 25% é: " + salarionovo);

	}

}