package buscaSequencialEBinaria;
import java.util.Scanner;
import java.text.Normalizer;

public class BuscaSequencialEBinaria1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];

        // Ler 10 números
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe um número: ");
            vetor[i] = input.nextInt();
        }

        // Consumir a nova linha restante
        input.nextLine();

        while (true) {
            // Perguntar ao usuário qual método de busca deseja usar
            System.out.print("Informe qual método de busca deseja utilizar? (Sequencial ou Sequencial com Sentinela), ou 'sair' para encerrar: ");
            String metodo = input.nextLine();
            String escolha = normalizarString(metodo);

            // Se o usuário quiser sair
            if (escolha.equals("sair")) {
                break;
            }

            // Ler o número a ser pesquisado
            System.out.print("Informe o número a ser pesquisado: ");
            int numeroBuscado = input.nextInt();
            input.nextLine(); // Consumir a nova linha restante

            // Realizar a busca
            if (escolha.equals("sequencial")) {
                int comparacoes = buscaSequencial(vetor, numeroBuscado);
                if (comparacoes != -1) {
                    System.out.println("Número encontrado após " + comparacoes + " comparações.");
                } else {
                    System.out.println("Número não encontrado. Comparações realizadas: " + comparacoes);
 }
                
                
            } else if (escolha.equals("sequencial_com_sentinela")) {
                int comparacoes = buscaSequencialComSentinela(vetor, numeroBuscado);
                if (comparacoes != -1) {
                    System.out.println("Número encontrado após " + comparacoes + " comparações.");
                } else {
                    System.out.println("Número não encontrado. Comparações realizadas: " + comparacoes);
                }
            } else {
                System.out.println("Método de busca inválido. Tente novamente.");
            }
        }

        input.close();
    }

    // Método de busca sequencial
    private static int buscaSequencial(int[] vetor, int numeroBuscado) {
        int comparacoes = 0;
        for (int i = 0; i < vetor.length; i++) {
            comparacoes++;
            if (vetor[i] == numeroBuscado) {
                return comparacoes; // Retorna o número de comparações se encontrado
            }
        }
        return -1; // Retorna -1 se não encontrado
    }

    // Método de busca sequencial com sentinela
    private static int buscaSequencialComSentinela(int[] vetor, int numeroBuscado) {
        int comparacoes = 0;
        int ultimo = vetor[vetor.length - 1];
        vetor[vetor.length - 1] = numeroBuscado; // Coloca o número buscado como sentinela

        int i = 0;
        while (vetor[i] != numeroBuscado) {
            comparacoes++;
            i++;
        }

        vetor[vetor.length - 1] = ultimo; // Restaura o último elemento

        if (i < vetor.length - 1 || vetor[vetor.length - 1] == numeroBuscado) {
            return comparacoes; // Retorna o número de comparações se encontrado
        }
        return -1; // Retorna -1 se não encontrado
    }

    // Método para normalizar a string
    private static String normalizarString(String input) {
        String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
        String withoutAccents = normalized.replaceAll("[^\\p{ASCII}]", "");
        return withoutAccents.toLowerCase();
    }
}