package javaEstruturaSequencial;
import java.util.Scanner;

public class estruturaSequencial8 {
	public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
    double peso, pesoM, pesoE;
    System.out.println("Informe seu peso: ");
    peso=input.nextInt();
    pesoM=peso-((peso*20)/100);
    pesoE=peso+((peso*15)/100);
    System.out.println("Seu peso caso emagreça 20%: "+pesoM);
    System.out.println("Seu peso caso engorde 15%: "+pesoE);
    }
}