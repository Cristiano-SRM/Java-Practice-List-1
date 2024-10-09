package javaEstruturaCondicional;
import java.util.Scanner;

public class EstruturaCondicional3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        int nota1, nota2, nota3;
        System.out.println("Informe a primeira nota no intervalo de [0,10]: ");
        nota1=input.nextInt();
        System.out.println("Informe a segunda nota no intervalo de [0,10]: ");
        nota2=input.nextInt();
        System.out.println("Informe a terceira nota no intervalo de [0,10]: ");
        nota3=input.nextInt();
        int media=(nota1+nota2+nota3)/3;
        
        if (media>=0 && media<3) {
        	System.out.println("Reprovado.");
        }
        if (media>=3 && media<7) {
        	System.out.println("Exame");
        }
        if (media>=7 && media<=10) {
        	System.out.println("Aprovado");
        }
    }
}
