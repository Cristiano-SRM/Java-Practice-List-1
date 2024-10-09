package buscaSequencialEBinaria;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class BuscaSequencialEBinaria3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> vetorA = new ArrayList<>();
        ArrayList<Integer> vetorB = new ArrayList<>();
        ArrayList<Integer> vetorC = new ArrayList<>();

        System.out.println("Digite números naturais para preencher o primeiro vetor (Digite -1 para sair ou parar de preencher): ");
        while (true) {
            int numero1 = input.nextInt();
            if (numero1 == -1) {
                break;
            }
            if (numero1 < 0) {
                System.out.println("Número inválido, digite um número natural.");
            } else {
                vetorA.add(numero1);
            }
        }

        System.out.println("Agora digite números naturais para preencher o segundo vetor (Digite -1 para sair ou parar de preencher): ");
        while (true) {
            int numero2 = input.nextInt();
            if (numero2 == -1) {
                break;
            }
            if (numero2 < 0) {
                System.out.println("Número inválido, digite um número natural.");
            } else {
                vetorB.add(numero2);
            }
            if (verificaDuplicatas(vetorA) || verificaDuplicatas(vetorB)) {
                System.out.println("Conjuntos A ou B contêm duplicatas. O conjunto não é válido.");
                return;
            }
        }

        vetorC.addAll(vetorA);

        for (int num : vetorB) {
        /* if (!vetorC.contains(num)) - Evitaria duplicatas, dispondo a necessidade da busca binaria ou da busca por duplicatas no conjunto C*/
                vetorC.add(num);
            
        }

        boolean temDuplicatas = verificaDuplicatas(vetorC);

        System.out.println("Conjunto A: " + vetorA);
        System.out.println("Conjunto B: " + vetorB);
        System.out.println("Conjunto C (união de A e B): " + vetorC);

        if (temDuplicatas) {
            System.out.println("Conjunto C contém elementos duplicados.");
        } else {
            System.out.println("Conjunto C não contém elementos duplicados.");
        }
    }

    public static boolean verificaDuplicatas(ArrayList<Integer> vetor) {
        Collections.sort(vetor);
        for (int i = 1; i < vetor.size(); i++) {
            int target = vetor.get(i);
        
            if (buscaBinaria(vetor, target, 0, i - 1)) {
                return true; 
            }
        }
        return false;
    }

    public static boolean buscaBinaria(ArrayList<Integer> vetor, int valorBuscado, int inicio, int fim) {
        while (inicio <= fim) {
            int mid = inicio + (fim - inicio) / 2;
            if (vetor.get(mid).equals(valorBuscado)) {
                return true; 
            } else if (vetor.get(mid) < valorBuscado) {
                inicio = mid + 1;
            } else {
                fim = mid - 1;
            }
        }
        return false; 
    }
}