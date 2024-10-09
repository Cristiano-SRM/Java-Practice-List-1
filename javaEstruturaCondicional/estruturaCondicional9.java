package javaEstruturaCondicional;
import java.util.*;
public class estruturaCondicional9 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o planeta");
        int planeta = teclado.nextInt();
        double g;
        System.out.println("digite a velocidade inicial (v0) em m/s: ");
        double v0 = teclado.nextDouble();
        System.out.println("digite a instante de tempo (t) em segundos: ");
        double t = teclado.nextDouble();
        double velocidade = v0-g*t;
        double altura = v0*t-(g*t*t/2);

        if(planeta==mercurio) {
            g = 3.7;
            velocidade = v0-g*t;
            altura = v0*t-(g*t*t/2);
            System.out.println("A velocidade no instante t é :" + velocidade);
            System.out.println("A altura no instante t é :" + altura);
        }
        else if(planeta==venus) {
            g = 8.8;
            velocidade = v0-g*t;
            altura = v0*t-(g*t*t/2);
            System.out.println("A velocidade no instante t é :" + velocidade);
            System.out.println("A altura no instante t é :" + altura);
        }
        else if(planeta==terra) {
            g = 9.8;
            velocidade = v0-g*t;
            altura = v0*t-(g*t*t/2);
            System.out.println("A velocidade no instante t é :" + velocidade);
            System.out.println("A altura no instante t é :" + altura);
        }
        else if(planeta=marte) {
            g = 3.8;
            velocidade = v0-g*t;
            altura = v0*t-(g*t*t/2);
            System.out.println("A velocidade no instante t é :" + velocidade);
            System.out.println("A altura no instante t é :" + altura);
        }
        else if(planeta==jupter) {
            g = 26.4;
            velocidade = v0-g*t;
            altura = v0*t-(g*t*t/2);
            System.out.println("A velocidade no instante t é :" + velocidade);
            System.out.println("A altura no instante t é :" + altura);
        }
        else if(planeta==saturno)  {
            g = 11.5;
            velocidade = v0-g*t;
            altura = v0*t-(g*t*t/2);
            System.out.println("A velocidade no instante t é :" + velocidade);
            System.out.println("A altura no instante t é :" + altura);
        }
        else if(planeta==urano) {
            g = 9.3;
            velocidade = v0-g*t;
            altura = v0*t-(g*t*t/2);
            System.out.println("A velocidade no instante t é :" + velocidade);
            System.out.println("A altura no instante t é :" + altura);
        }
        else if(planeta==netuno) {
            g = 12.2;
            velocidade = v0-g*t;
            altura = v0*t-(g*t*t/2);
            System.out.println("A velocidade no instante t é :" + velocidade);
            System.out.println("A altura no instante t é :" + altura);
        }
        else if(planeta==plutao) {
            g = 0.6;
            velocidade = v0-g*t;
            altura = v0*t-(g*t*t/2);
            System.out.println("A velocidade no instante t é :" + velocidade);
            System.out.println("A altura no instante t é :" + altura);
        }
        else {
            System.out.println("Invalido");
        }
    }
}