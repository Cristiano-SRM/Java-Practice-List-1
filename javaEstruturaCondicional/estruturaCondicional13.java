package javaEstruturaCondicional;
import java.util.*;
public class estruturaCondicional13 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe o tipo de apartamento");
        int apto = teclado.nextInt();
        System.out.println("informe a quantidade de dias hospedados");
        int dias = teclado.nextInt();

        if(apto==simples && dias<10) {
            System.out.println("Cobra 100 reais");
        }
        else if(apto==simples && dias<15) {
            System.out.println("Cobra 90 reais");
        }
        else if(apto==simples && dias>15) {
            System.out.println("Cobra 80 reais");
        }
        if(apto==duplo && dias<10) {
            System.out.println("Cobra 140 reais");
        }
        else if(apto==duplo && dias<15) {
            System.out.println("Cobra 120 reais");
        }
        else if(apto==duplo && dias>15) {
            System.out.println("Cobra 100 reais");
        }
        else {
            System.out.println("Error");
        }
    }
}