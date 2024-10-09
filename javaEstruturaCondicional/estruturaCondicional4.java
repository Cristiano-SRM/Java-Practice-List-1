package javaEstruturaCondicional;
import java.util.Scanner;

public class EstruturaCondicional4 {

	public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      double peso, altura;
      System.out.println("Informe seu peso: ");
      peso=input.nextDouble();
      System.out.println("Informe sua altura: ");
      altura=input.nextDouble();
      
      double imc=peso/(Math.pow(altura, 2));
      
      if (imc<20) {
    	 System.out.println("Abaixo do peso");
      }
      if (imc>=20 && imc<=25) {
    	 System.out.println("Normal");
      }
      if (imc>=25 && imc<=30) {
    	 System.out.println("Sobrepeso");
      }
      if (imc>=30 && imc<=40) {
    	 System.out.println("Obesidade");
      }
	}
}