package estruturaWhile;
import java.util.*;
public class estruturaWhile4 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        double somaSalarios = 0;
        double somaFilhos = 0;
        int totalHabitantes = 0;
        
        while(true) {
            System.out.println("digite o salario (ou salario negativo para sair)");
            double salario = teclado.nextDouble();
            if(salario<0) {
                break;//Termina o loop se o salario for negativo
            }    
                System.out.println("digite o numero de filhos");
                int numerofilhos = teclado.nextInt();
                
                somaSalarios += salario;
                somaFilhos += numerofilhos;
                totalHabitantes++;

            if(totalHabitantes>0) {
                System.out.println("A media salarial é :" + somaSalarios/totalHabitantes);
                System.out.println("A media de filhos é :" + somaFilhos/totalHabitantes);
            }
            else {
                System.out.println("Nenhum dado foi resgistrado");
            }
        }
    }     
}