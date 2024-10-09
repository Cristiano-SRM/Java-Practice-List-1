package estruturaVetor;
import java.util.Scanner;
public class estruturaVetor5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetorSoma = new int[10];

        System.out.println("Digite 10 números inteiros para o primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            vetor1[i] = input.nextInt();
        }

        System.out.println("Digite 10 números inteiros para o segundo vetor:");
        for (int i = 0; i < 10; i++) {
            vetor2[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            vetorSoma[i] = vetor1[i] + vetor2[i];
        }

        System.out.println("\nVetor 1:");
        for (int num : vetor1) {
            System.out.print(num + " ");
        }

        System.out.println("\nVetor 2:");
        for (int num : vetor2) {
            System.out.print(num + " ");
        }

        System.out.println("\nVetor Soma:");
        for (int num : vetorSoma) {
            System.out.print(num + " ");
        }
    }
}