package javaEstruturaSequencial;
import javax.swing.JOptionPane;

public class estruturaSequencial8PANEL {

	public static void main(String[] args) {
      String peso;
      peso=JOptionPane.showInputDialog("Informe seu peso: ");
      
      double pesoInt=Double.parseDouble(peso);
      double pesoG, pesoM;
      pesoG=pesoInt+((pesoInt*15)/100);
      pesoM=pesoInt-((pesoInt*20)/100);
      
      JOptionPane.showMessageDialog(null, "Seu peso caso engorde 15% é: "+pesoG);
      JOptionPane.showMessageDialog(null,  "Seu peso caso emagreça 20% é: "+pesoM);
	}

}