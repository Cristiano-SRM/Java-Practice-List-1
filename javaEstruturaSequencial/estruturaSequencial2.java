package javaEstruturaSequencial;
import java.util.Scanner;
public class estruturaSequencial2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        int anoNasc, anoAtual;
        System.out.println("informe seu ano de nascimento: ");
        anoNasc=input.nextInt();
        System.out.println("informe o ano atual: ");
        anoAtual=input.nextInt();
        System.out.println("a sua idade é: " + (anoAtual - anoNasc));
        System.out.println("a sua idade em 2050 sera: " + (2050-anoNasc));
	}

}