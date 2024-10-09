package javaEstruturaSequencial;
import java.util.Scanner;

public class estruturaSequencial11 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
        int num;
        System.out.println("Informe um numero: ");
        num=input.nextInt();
        System.out.println("A tabuada é:");
        System.out.println(num+"x0: "+num*0);
        System.out.println(num+"x1: "+num*1);
        System.out.println(num+"x2: "+num*2);
        System.out.println(num+"x3: "+num*3);
        System.out.println(num+"x4: "+num*4);
        System.out.println(num+"x5: "+num*5);
        System.out.println(num+"x6: "+num*6);
        System.out.println(num+"x7: "+num*7);
        System.out.println(num+"x8: "+num*8);
        System.out.println(num+"x9: "+num*9);
        System.out.println(num+"x10: "+num*10);
	}

}