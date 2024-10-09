package estruturaFor;
import java.util.*;
public class estruturaFor1 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int soma = 0;

        for(int i=7;i<=20;i++)
        soma = soma + i;

        System.out.println("A soma dos numeros de 7 a 20 é :" + soma);
        scanner.close();
    }
}