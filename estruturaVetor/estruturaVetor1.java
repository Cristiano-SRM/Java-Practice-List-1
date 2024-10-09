package estruturaVetor;
import java.util.Scanner;
public class estruturaVetor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[10];
        int somaPares = 0;

        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = input.nextInt();
            if (numeros[i] % 2 == 0) {
                somaPares += numeros[1];
            }
        }

        System.out.println("Vetor: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println("\nSoma dos números pares: " + somaPares);
    }
}