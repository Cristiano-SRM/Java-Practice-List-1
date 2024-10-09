package javaEstruturaCondicional;
import java.util.Scanner;

public class EstruturaCondicional5 {

	public static void main(String[] args) {
	   Scanner input=new Scanner(System.in);
	     double valor;
	     System.out.println("Informe um valor para incrementar a função: ");
	     valor=input.nextDouble();
        if(valor<-2) {
        valor=(2*valor)+2;
        System.out.println("A saída é: "+valor);
        }
        if(valor>=3) {
        valor=-valor;
        System.out.println("A saída é: "+valor);
        }
        if(valor>=-2 && valor<3) {
        valor=3;
        System.out.println("A saída é: "+valor);   
        }
	}

}