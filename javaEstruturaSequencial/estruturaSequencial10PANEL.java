package javaEstruturaSequencial;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
public class estruturaSequencial10PANEL {

	public static void main(String[] args) {
       String raio;
       raio=JOptionPane.showInputDialog("Informe o raio: ");
       double  Raio=Double.parseDouble(raio);
       
       double comprimento=(2*Math.PI*Raio);
       double area=(Math.PI*Math.pow(Raio, 2));
       double volume=(0.75*Math.PI*Math.pow(Raio, 3));
       
       DecimalFormat df = new DecimalFormat("#.##");
       String mensagem = "O comprimento é: " + df.format(comprimento) + "\n" + 
                         "A area é: " + df.format(area) + "\n" + 
    		             "O volume é: " + df.format(volume);
       
       JOptionPane.showMessageDialog(null, mensagem);
       
	}

}