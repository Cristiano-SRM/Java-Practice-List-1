package estruturaFor;
import java.util.*;
public class estruturaFor8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro:");
        int base = scanner.nextInt();
        System.out.print("Digite o expoente");
        int expoente = scanner.nextInt();
        int resultado = 1;
        if (expoente == 0) {
            resultado = 1;
        } else if (expoente > 0) {
            for (int i = 1; i <= expoente; i++) {
                resultado *= base;
            }
        } else {
            System.out.println("Deve ser um expoente positivo.");
            scanner.close();
            return;
        }
        System.out.println("O resultado de " + base + " elevado a " + expoente + " é: " + resultado);
        scanner.close();
    }
}