package javaEstruturaSequencial;
import java.util.Scanner;

public class estruturaSequencial7 {

	public static void main(String[] args) {
		double salario_min, salario_func;
       Scanner input= new Scanner (System.in);
       System.out.println("Informe o salario minimo atual: ");
       salario_min=input.nextInt();
       System.out.println("informe o salario do funcionario: ");
       salario_func=input.nextInt();
       salario_func=salario_func/salario_min;
       System.out.printf("O salario desse funcionrio é %.2f vezes o salario minimo ", salario_func);
	}

}