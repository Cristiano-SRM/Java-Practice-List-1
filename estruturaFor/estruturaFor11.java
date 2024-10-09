package estruturaFor;
import java.util.*;
public class estruturaFor11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorHomens = 0;
        int contadorMulheres = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i + ":");
            System.out.print("Digite o sexo (M para masculino, F para feminino): ");
            char sexo = scanner.next().toUpperCase().charAt(0);
            System.out.print("Digite o peso (em kg): ");
            double peso = scanner.nextDouble();
            if (sexo == 'M' && peso >= 60 && peso <= 80) {
                contadorHomens++;
            }
            if (sexo == 'F' && peso >= 50 && peso <= 70) {
                contadorMulheres++;
            }
        }
        System.out.println("Número de homens com peso entre 60 e 80 kg: " + contadorHomens);
        System.out.println("Número de mulheres com peso entre 50 e 70 kg: " + contadorMulheres);
        scanner.close();
    }
}