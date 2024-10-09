package estruturaWhile;
import java.util.*;
public class estruturaWhile2 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        while(true) {
            System.out.println("digite a matricula (ou uma matricula negativa para sair)");
            int matricula = teclado.nextInt();
            if(matricula<0){
                break;//Saia do processo se uma matricula negativa for inserida
            }
            System.out.println("digite a primeira nota");
            double Pnota = teclado.nextDouble();
            System.out.println("digite a segunda nota");
            double Snota = teclado.nextDouble();
            System.out.println("digite a terceira nota");
            double Tnota = teclado.nextDouble();
            double media = (Pnota+Snota+Tnota)/3;
            if(media>=70) {
                System.out.println("Aprovado");
            }
            else if(media>=60 && media<70) {
                System.out.println("Recuperação");
            }
            else if(media<60) {
                System.out.println("Reprovado");
            }
            else {
                System.out.println("Nenhuma matricula encontrada");
            }
        }    
    }
}