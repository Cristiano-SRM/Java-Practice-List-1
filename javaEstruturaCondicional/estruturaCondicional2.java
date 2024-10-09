package javaEstruturaCondicional;
import java.util.Scanner;

public class EstruturaCondicional2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        int lado1, lado2, lado3;
        System.out.println("Informe o primeiro lado do triangulo: ");
        lado1=input.nextInt();
        System.out.println("Informe o segundo lado triangulo: ");
        lado2=input.nextInt();
        System.out.println("Informe o terceiro e ultimo lado do triangulo: ");
        lado3=input.nextInt();
        
        if (lado1==lado2 || lado1==lado3 || lado2==lado3) {
        	if (lado1==lado2 && lado2==lado3 && lado1==lado3) {
            	System.out.println("O triangulo é equilatero.");
        	} else {
            	System.out.println("O triangulo é isosceles.");
        	}        	
        } if (lado1!=lado2 && lado1!=lado3 && lado2!=lado3) {
        	System.out.println("O triangulo é escaleno");
        }
	}

}