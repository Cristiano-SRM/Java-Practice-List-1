package estruturaMatriz;
import java.util.Scanner;
public class estruturaMatriz1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matriz informada:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Elementos com índice da linha par e coluna ímpar:");
        for (int i = 0; i < 5; i += 2) {
            for (int j = 1; j < 5; j += 2) { 
                System.out.println("Elemento [" + i + "][" + j + "]: " + matriz[i][j]);
            }
        }
    }
}