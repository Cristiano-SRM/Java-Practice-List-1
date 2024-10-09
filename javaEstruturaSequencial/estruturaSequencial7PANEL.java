package javaEstruturaSequencial;
import javax.swing.JOptionPane;

public class estruturaSequencial7PANEL {
	public static void main(String[] args) {
     String salario_min, salario_func;
     salario_min=JOptionPane.showInputDialog("Informe o salario minimo atual: ");
     salario_func=JOptionPane.showInputDialog("Informe o salario do funcionario: ");
     
     double SalMin=Double.parseDouble(salario_min);
     double SalFunc=Double.parseDouble(salario_func);
     
     SalFunc=SalFunc/SalMin;
     String mensagem = String.format("O salario deste funcionario é %.2f vezes o salario minimo",SalFunc);
     JOptionPane.showMessageDialog(null, mensagem);
	}

}