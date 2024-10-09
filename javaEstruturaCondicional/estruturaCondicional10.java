package javaEstruturaCondicional;
import java.util.*;
public class estruturaCondicional10 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite dois numeros");
        double num1 = teclado.nextDouble();
        double num2 = teclado.nextDouble();
        System.out.println("informe qual opcao executar");
        double opcao = teclado.nextDouble();

        if(opcao==1) 
        System.out.println("A soma dos numeros é :" + (num1 + num2));
        else if(opcao==2)
        System.out.println("A multiplicacao é :" + (num1 * num2));
        else if(opcao==3 && num1>num2) {
            System.out.println("A subtracao é :" + (num1 - num2));
        }
        else if(opcao==4 && num1==num2) {
            System.out.println("0");
        }
        else if(opcao==4 && num1!=0 && num2!=0) {
            System.out.println("A divisao é :" + num1/num2);
        }
        else {
            System.out.println("Nao é possivel");
        }
    }
}