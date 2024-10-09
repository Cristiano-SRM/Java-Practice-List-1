package estruturaVetor;
import java.util.Scanner;
public class estruturaVetor4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numeros = new double[10];

        System.out.println("Digite 10 números reais:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = input.nextInt();
        }

        System.out.println("Elementos nas posições pares:");
        for (int i = 0; i < 10; i += 2) {
            System.out.println("Posição " + i + ": " + numeros[i]);
        }
    }
}