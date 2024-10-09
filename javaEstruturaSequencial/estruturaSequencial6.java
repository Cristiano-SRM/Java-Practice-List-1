package javaEstruturaSequencial;
import java.util.Scanner;

public class estruturaSequencial6 {
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		double tempC, tempF ;
		System.out.println("Informe a temperatura em Celsius: ");
		tempC=input.nextDouble();
		tempF=(tempC*1.8)+32;
		System.out.println("Essa temperatura em Fahrenheit é: " + tempF);

	}

}