package estruturaFor;
import java.util.*;
public class estruturaFor9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro:");
        int numero = scanner.nextInt();
        System.out.println("Números ímpares de 1 até " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}