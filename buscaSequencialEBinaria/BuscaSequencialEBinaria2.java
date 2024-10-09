package buscaSequencialEBinaria;
import java.text.Normalizer;
import java.util.Scanner;

public class BuscaSequencialEBinaria2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe um número para preencher o vetor (deve ser ordenado): ");
            vetor[i] = input.nextInt();
        }
        input.nextLine();
        while (true) {
        	System.out.println("Deseja realizar uma busca binaria? Digite ' Yes ' para começar ou ' No ' para sair.");
        	String metodo = input.nextLine();
            String escolha = normalizarString(metodo);
            
            if (escolha.equals("no")) {
                break;
            }
            System.out.print("Informe o número a ser pesquisado: ");
            int numeroBuscado = input.nextInt();
            input.nextLine();
            if (escolha.equals("yes")) {
            	int esquerda=0, direita=vetor.length-1;
            	int comparacoes=buscaBinaria(vetor, numeroBuscado, esquerda, direita);
            	 if (comparacoes != -1) {
                     System.out.println("Número encontrado após " + comparacoes + " comparações.");
                 } else {
                     System.out.println("Número não encontrado. Comparações realizadas: " + comparacoes);
            }
            }
        }
        input.close();
	}
	private static int buscaBinaria(int[] vetor, int numeroBuscado, int esquerda, int direita) {
       int comparacoes=0;
       while (esquerda<=direita) {
    	   int meio=(esquerda+direita)/2;
    	   comparacoes++;
    	   if (vetor[meio] == numeroBuscado)
    		   return comparacoes;
    	   if (vetor[meio] > numeroBuscado)
    		   direita=meio-1;
    	   else
    		   esquerda=meio+1;
       }
       return -1;
    }
	
    private static String normalizarString(String input) {
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        String withoutAccents = normalized.replaceAll("[^\\p{ASCII}]", "");
        return withoutAccents.toLowerCase();
    }
    
}