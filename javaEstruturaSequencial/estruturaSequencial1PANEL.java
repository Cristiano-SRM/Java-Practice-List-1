package javaEstruturaSequencial;
import javax.swing.JOptionPane;
public class estruturaSequencial1PANEL {

	public static void main(String[] args) {
		String num1, num2, num3;
		
		num1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
		num2 = JOptionPane.showInputDialog("Digite o segundo numero: ");
		num3 = JOptionPane.showInputDialog("Digite o terceiro numero: ");
	
		int numero=Integer.parseInt(num1);
		int numero2=Integer.parseInt(num2);
		int numero3=Integer.parseInt(num3);
		int media= (numero+numero2+numero3)/3;
		JOptionPane.showMessageDialog(null, "Media aritmetica: " + media);
}

}