package javaEstruturaSequencial;
import javax.swing.JOptionPane;

public class estruturaSequencial6PANEL {

	public static void main(String[] args) {
      String tempC;
      tempC=JOptionPane.showInputDialog("Informe a temperatura em Celsius: ");
      double Celsius=Double.parseDouble(tempC.replace(",", "."));
      
      double Fahrenheit=(Celsius*1.8)+32;
      JOptionPane.showMessageDialog(null,"Esta temperatura em Fahrenheit é: " + Fahrenheit);
	}

}