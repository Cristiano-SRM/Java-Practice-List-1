package estruturaDoWhile;
import javax.swing.JOptionPane;
public class estruturaDoWhile4 {

	public static void main(String[] args) {

	        String continuar;

	        do {
	            String entradaX = JOptionPane.showInputDialog("Informe o valor de X (primeiro lado): ");
	            double x = Double.parseDouble(entradaX);

	            String entradaY = JOptionPane.showInputDialog("Informe o valor de Y (segundo lado): ");
	            double y = Double.parseDouble(entradaY);

	            String entradaZ = JOptionPane.showInputDialog("Informe o valor de Z (terceiro lado): ");
	            double z = Double.parseDouble(entradaZ);
	            if ((x < y + z && x > Math.abs(y - z)) &&
	                (y < x + z && y > Math.abs(x - z)) &&
	                (z < x + y && z > Math.abs(x - y))) {
	                
	                JOptionPane.showMessageDialog(null, "Os valores informados podem formar um triângulo.");
	            } else {
	                JOptionPane.showMessageDialog(null, "Os valores informados NÃO podem formar um triângulo.");
	            }

	            continuar = JOptionPane.showInputDialog("Deseja verificar outro conjunto de valores? (S)im ou (N)ão");

	        } while (continuar.equalsIgnoreCase("s") || continuar.equalsIgnoreCase("sim"));

	        System.exit(0);
	    }
	}