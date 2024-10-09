package javaEstruturaCondicional;
import java.util.Scanner;

public class EstruturaCondicional6 {

	public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       double lado1, lado2, lado3;
       System.out.println("Informe o primeiro lado do triangulo: ");
       lado1=input.nextDouble();
       System.out.println("Informe o segundo lado do triangulo: ");
       lado2=input.nextDouble();
       System.out.println("Informe o terceiro e ultimo lado do triangulo: ");
       lado3=input.nextDouble();
       
       if(Math.abs(lado2-lado3)<lado1 && lado1<(lado2+lado3)) {
    	 if(Math.abs(lado1-lado3)<lado2 && lado2<(lado1+lado3)) 
    		 if(Math.abs(lado1-lado2)<lado3 && lado3<(lado1+lado2)) 
    	    	 System.out.println("Triangulo verdadeiro.");  
    		 } else {
    	    	   System.out.println("Triangulo Falso.");
    	       }
	}
}       
   
