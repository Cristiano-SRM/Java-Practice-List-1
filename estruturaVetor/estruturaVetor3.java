package estruturaVetor;
import java.util.Scanner;
public class estruturaVetor3 {    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numeros = new double[10];
        double menor, maior;

        System.out.println("Digite 10 números reais:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        menor = maior = numeros[0];
        for (int i = 1; i < 10; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("\nVetor: ");
        for (double num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println("\nMenor número: " + menor);
        System.out.println("Maior número: " + maior);
    }
}