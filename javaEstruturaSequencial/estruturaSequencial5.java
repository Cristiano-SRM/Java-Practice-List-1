package javaEstruturaSequencial;
import java.util.Scanner;
 public class estruturaSequencial5 {
	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		int diagonal_maior, diagonal_menor;
		System.out.println("Informe a diagonal maior: ");
		diagonal_maior=input.nextInt();
		System.out.println("Informe a diagonal menor: ");
		diagonal_menor=input.nextInt();
		
		System.out.println("A area deste losango e: " + ((diagonal_maior*diagonal_menor)/2));

		}
		
	}