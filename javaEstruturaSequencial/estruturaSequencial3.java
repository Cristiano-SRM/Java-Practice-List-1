package javaEstruturaSequencial;
import java.util.Scanner;
public class estruturaSequencial3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double dolarValor, dolarUser, Result;
		System.out.println("Qual a cotação do Dólar em reais: ");
		dolarValor=input.nextDouble();
		System.out.println("Qual valor você possui em dolares: ");
		dolarUser=input.nextInt();
		Result=(dolarValor*dolarUser);
		System.out.println("Você possui este valor em reais: "+ Result);

	}

}