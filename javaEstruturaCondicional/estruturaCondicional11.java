package javaEstruturaCondicional;
import java.util.*;
public class estruturaCondicional11 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe o numero de diarias");
        double diaria = teclado.nextDouble();

        if(diaria<15) {
            System.out.println("O valor a ser pago é R$ :" + 15*diaria+500);
        }
        else if(diaria=15) {
            System.out.println("O valor a ser pago é R$ :" + 10*diaria+500);
        }
        else if(diaria>15) {
            System.out.println("O valor a ser pago é R$ :" + 5*diaria+500);
        }
        else {
            System.out.println("Error");
        }
    }
}