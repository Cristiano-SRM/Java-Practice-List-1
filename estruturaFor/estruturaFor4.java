package estruturaFor;
import java.util.*;
public class estruturaFor4 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int somaIdades = 0;
        int totalIdades = 0;

        System.out.println("Digite as idades");

        for(;;) {
            int idade = teclado.nextInt();
            if(idade>=0){
                somaIdades += idade;
                totalIdades++;
            }
            else {
                System.out.println("A media das idades é :" + somaIdades/totalIdades);
                System.out.println("Finalizar");
            }    
        }
         scanner.close();
    }
}