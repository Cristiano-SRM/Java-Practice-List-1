package javaEstruturaSequencial;
import java.util.Scanner;
public class estruturaSequencial4 {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		int salario, salarionovo;
		System.out.println("Informe seu salario: ");
		salario=input.nextInt();
		salarionovo=salario+(salario/4);
		System.out.println("Seu novo salario com aumento de 25% é: " + salarionovo);
	}

}