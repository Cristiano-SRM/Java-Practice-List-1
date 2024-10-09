package javaEstruturaCondicional;
import java.util.*;
public class estruturaCondicional8 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe o preço do sapato");
        double sapato = teclado.nextDouble();
        System.out.println("informe o preço da bolsa");
        double bolsa = teclado.nextDouble();
        System.out.println("informe o preço da camisa");
        double camisa = teclado.nextDouble();
        System.out.println("informe o preço da calça");
        double calça = teclado.nextDouble();
        System.out.println("informe o preço da blusa");
        double blusa = teclado.nextDouble();
        System.out.println("informe o codigo do produto");
        double codigo = teclado.nextDouble();

        if(codigo==1) {
            System.out.println("Produto:Sapato,preço:R$ " + sapato);
        }
        else if(codigo==2) {
            System.out.println("Produto:Bolsa,preço:R$ " + bolsa);
        }
        else if(codigo==3) {
            System.out.println("Produto:Camisa,preço:R$ " + camisa);
        }
        else if(codigo==4) {
            System.out.println("Produto:Calça,preço:R$ " + calça);
        }
        else if(codigo=5) {
            System.out.println("Produto:Blusa,preço:R$ " + blusa);
        }
        else {
            System.out.println("Invalido");
        }
    }
}