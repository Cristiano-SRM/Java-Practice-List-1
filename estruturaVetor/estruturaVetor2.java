package estruturaVetor;
import java.util.Scanner;
public class estruturaVetor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Digite 10 números reais:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = input.nextInt();
        }

        System.out.println("\nVetor: ");
        for (double num : numeros) {
            System.out.print(num + " ");
        }

        System.out.println("\nPosições dos números negativos:");
        for (int i = 0; i < 10; i++) {
            if (numeros[i] < 0) {
                System.out.println("Posição " + i + ": " + numeros[i]);
            }
        }
    }
}