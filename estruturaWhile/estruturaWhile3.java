package estruturaWhile;
import java.util.*;
public class estruturaWhile3 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        Map<Integer, Integer> audiencia = new HashMap<>();
        int totalPessoas = 0;

        while(true) {
            System.out.println("Digite o numero do canal  (2, 4, 5, 7, 12) ou 0 para sair");
            int canal = teclado.nextInt();
            if(canal==0) {
                break;//Encerrar o processo se o canal for 0
            }
            if(audiencia.containsKey(canal) || canal==2 || canal==4 || canal==5 || canal==7 || canal==12) {
                System.out.println("Digite o numero de pessoas assistindo o canal");
                int numeroPessoas = teclado.nextInt();
                audiencia.put(canal, audiencia.getOrDefault(canal,0)+ numeroPessoas);
                totalPessoas += numeroPessoas;
            }
            else {
                System.out.println("O canal é invalido");
            }
        }

        System.out.println("\nPercentual de audiencia de cada canal");
        for (Map.Entry<Integer, Integer> entry : audiencia.entrySet()) {
            int canalKey = entry.getKey();
            int pessoas = entry.getValue();
            double percentual = (double) pessoas / totalPessoas * 100;
            System.out.printf("Canal %d: %.2f%% da audiencia\n", canalKey, percentual);
        }
        if (totalPessoas==0) {
            System.out.println("Nenhuma audiencia registrada");
        }
    }
}