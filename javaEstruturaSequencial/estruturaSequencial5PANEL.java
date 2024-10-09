package javaEstruturaSequencial;
import javax.swing.JOptionPane;

public class estruturaSequencial5PANEL {

	public static void main(String[] args) {
       String Diag_maior, Diag_menor;
       Diag_maior=JOptionPane.showInputDialog("Informe a Diagonal Maior: ");
       Diag_menor=JOptionPane.showInputDialog("Informe a Diagonal Menor: ");
       int DiagMa=Integer.parseInt(Diag_maior);
       int DiagMe=Integer.parseInt(Diag_menor);
       int Area=(DiagMa*DiagMe)/2;
       JOptionPane.showMessageDialog(null,"A area deste losango é: " + Area);
	}

}