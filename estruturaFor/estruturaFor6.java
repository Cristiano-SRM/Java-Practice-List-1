package estruturaFor;
import java.util.*;
public class estruturaFor6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaIdades = 0;
        int todasPessoas = 10;
        for (int i = 1; i <= todasPessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            somaIdades += idade;
        }
        double media = (double) somaIdades / todasPessoas;
        System.out.println("A média das idades é: " + media);
        scanner.close();
    }
}