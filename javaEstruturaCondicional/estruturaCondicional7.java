package javaEstruturaCondicional;
import java.util.Scanner;

public class EstruturaCondicional7 {

	public static void main(String[] args) {
	     Scanner input=new Scanner(System.in);
         double a, b, c;
         System.out.println("Informe o primeiro valor (a) da equação de segundo grau: ");
         a=input.nextDouble();
         System.out.println("Informe o segundo valor (b) da equação de segundo grau: ");
         b=input.nextDouble();
         System.out.println("Informe o terceiro e ultimo valor (c) da equação de segundo grau: ");
         c=input.nextDouble();
         
         if(a==0 && b==0 && c==0) {
        	 System.out.println("Igualdade confirmada: 0=0");
         }
         if(a==0 && b==0 && c!=0) {
        	 System.out.println("Coeficientes informados incorretamente.");
         }
         if(a==0 && b!=0) {
        	 double result=-c/b;
        	 System.out.println("Esta é uma equação de primeiro grau, e seu resultado é: "+result);
         }
         if(a!=0) {
        	 System.out.println("Esta é uma equação de segundo grau.");
        	 double delta=(Math.pow(b, 2))-4*a*c;
        	 if(delta<0) {
        		 System.out.println("Esta equação não possui raízes reais. Valor de delta: "+delta);
        	 }
        	 if(delta==0) {
        		 double Result=-b/(2*a);
        		 System.out.println("Esta equação possui duas raizes reais: "+Result);
        	 }
        	 if(delta>0) {
        		 System.out.println("Esta equação possui duas raizes diferentes.");
        		 double resultado1=(Math.sqrt(delta)-b)/(2*a);
        		 double resultado2=(-(Math.sqrt(delta)+b)/(2*a));
        		 System.out.printf("O primeiro resultado é: %.2f\n",resultado1);
        		 System.out.printf("O segundo resultado é: %.2f",resultado2);

        	 }
         }
	}

}