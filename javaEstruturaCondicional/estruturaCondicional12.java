package javaEstruturaCondicional;
import java.util.*;
public class estruturaCondicional12 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe o sexo");
        int sexo = teclado.nextInt();
        System.out.println("informe a idade");
        int idade = teclado.nextInt();

        if(sexo==homem && idade<=15) {
            System.out.println("Paga 60 reais");
        }
        else if(sexo==homem && idade<=18) {
            System.out.println("Paga 75 reais");
        }
        else if(sexo==homem && idade<=30) {
            System.out.println("Paga 90 reais");
        }
        else if(sexo=homem && idade<=40) {
            System.out.println("Paga 85 reais");
        }
        else if(sexo==homem && idade>40) {
            System.out.println("Paga 80 reais");
        }
        if(sexo==mulher && idade<=18) {
            System.out.println("Paga 60 reais");
        }
        else if(sexo==mulher && idade<=25) {
            System.out.println("Paga 90 reais");
        }
        else if(sexo==mulher && idade<=40) {
            System.out.println("Paga 85 reais");
        }
        else if(sexo==mulher && idade>40) {
            System.out.println("Paga 80 reais");
        }
        else {
            System.out.println("Error");
        }
    }
}