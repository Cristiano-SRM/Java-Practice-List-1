package javaEstruturaCondicional;
import java.util.Scanner;
public class EstruturaCondicional1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        int nota1, nota2;
        System.out.println("Informe sua primeira nota: ");
        nota1=input.nextInt();
        System.out.println("Informe sua segunda nota: ");
        nota2=input.nextInt();
        
        int media=(nota1+nota2)/2;
        if (media>=7) {
        	System.out.println("Aprovado");
        } else {
        	System.out.println("Reprovado");
        }
	}

}