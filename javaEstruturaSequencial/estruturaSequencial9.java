package javaEstruturaSequencial;
import java.util.Scanner;
public class estruturaSequencial9 {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		int Cat1, Cat2;
		System.out.println("Informe um cateto do triangulo retangulo: ");
		Cat1=input.nextInt();
		System.out.println("Informe um segundo cateto do triangulo retangulo: ");
		Cat2=input.nextInt();
		double hipotenusa=Math.sqrt((Cat1*Cat1)+(Cat2*Cat2));
		System.out.println("A hipotenusa é: "+hipotenusa);

	}

}