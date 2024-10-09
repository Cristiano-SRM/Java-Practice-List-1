package estruturaFor;
import java.util.*;
public class estruturaFor5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer intma = null;
        Integer intmen = null;

        while (true) {
            System.out.print("Digite um número inteiro:");
            String input = scanner.nextLine();
            try {
                int num = Integer.parseInt(input);
                if (intma == null || num > intma) {
                    intma = num;
                }
                if (intmen == null || num < intmen) {
                    intmen = num;
                }

            } catch (NumberFormatException e) {
                System.out.println("Este número não é inteiro.");
            }
        }
        if (intma != null && intmen != null) {
            System.out.println("O maior número inteiro é: " + intma);
            System.out.println("O menor número inteiro é: " + intmen);
        } else {
            System.out.println("Nenhum número inteiro informado.");
        }

        scanner.close();
    }
}