package javaEstruturaSequencial;
import java.util.Scanner;

public class estruturaSequencial10 {

	public static void main(String[] args) {
		double raio;
		Scanner input = new Scanner (System.in);
        System.out.println("Informe o raio: ");
        raio=input.nextDouble();
        
        double comprimento=(2*Math.PI*raio);
        double area=(Math.PI*Math.pow(raio, 2));
        double volume=(0.75*Math.PI*Math.pow(raio, 3));
        
        System.out.printf("O comprimento é: %.2f %n",comprimento);
        System.out.printf("A area é: %.2f %n",area);
        System.out.printf("O volume é: %.2f %n",volume);
	}

}