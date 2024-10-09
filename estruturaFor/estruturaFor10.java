package estruturaFor;
import java.util.*;
public class estruturaFor10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numFeminino = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i + ":");
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();
            System.out.print("Digite o sexo (M para masculino, F para feminino): ");
            char sexo = scanner.next().toUpperCase().charAt(0);
            if (sexo == 'F' && idade >= 20 && idade <= 40) {
                numFeminino++;
            }
        }
        System.out.println("Número de pessoas do sexo feminino entre 20 e 40 anos: " + numFeminino);
        scanner.close();
    }
}