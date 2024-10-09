package javaEstruturaSequencial;
import javax.swing.JOptionPane;
public class estruturaSequencial2PANEL {

	public static void main(String[] args) {
        String anoNasc, anoAtual;
        anoNasc=JOptionPane.showInputDialog("Em que ano você nasceu? ");
        anoAtual=JOptionPane.showInputDialog("Qual o ano atual? ");
       int anonasci=Integer.parseInt(anoNasc);
       int anoatual=Integer.parseInt(anoAtual);
       JOptionPane.showMessageDialog(null, "Sua idade atual: " + (anoatual-anonasci));
       JOptionPane.showMessageDialog(null, "Sua idade em 2050: " + (2050-anonasci));
	}

}