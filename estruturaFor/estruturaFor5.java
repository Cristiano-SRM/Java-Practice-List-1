package estruturaFor;
import java.util.Scanner;

public class EstruturaFor5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer maior = null;
        Integer menor = null;
        for (;;) {
            System.out.print("Digite um número inteiro (ou 'sair' para encerrar): ");
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }
            try {
                int numero = Integer.parseInt(entrada);
                if (maior == null || numero > maior) {
                    maior = numero;
                }
                if (menor == null || numero < menor) {
                    menor = numero;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro ou 'sair'.");
            }
        }
        if (maior != null && menor != null) {
            System.out.println("O maior número informado foi: " + maior);
            System.out.println("O menor número informado foi: " + menor);
        } else {
            System.out.println("Nenhum número válido foi informado.");
        }
        
        scanner.close();
    }
}