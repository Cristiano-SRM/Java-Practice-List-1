package javaEstruturaSequencial;
import java.util.Scanner;
public class estruturaSequencial1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num1, num2, num3, media;
		System.out.println("informe um numero: ");
		num1 = input.nextInt();
		System.out.println("informe um numero: ");
		num2 = input.nextInt();
		System.out.println("informe um numero: ");
		num3 = input.nextInt();
		media = (num1 + num2 + num3)/3;
		System.out.println("A media aritmetica dos numeros é: " + media);
}

}