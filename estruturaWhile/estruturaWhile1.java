package estruturaWhile;
import java.util.*;
public class estruturaWhile1 {
    public static void main(String args[]) {
        int alunosNota90OuMais = 0;
        int alunosReprovados = 0;
        int totalAlunos = 0;
        double somaNotas = 0;
        double maiorNota = Double.MIN_VALUE;
        double menorNota = Double.MAX_VALUE;
        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println("Digite a nota final (ou uma nota negativa para sair)");
            double nota = teclado.nextDouble();
            if (nota<0) {
                break;//Saia do processo se uma nota negativa for inserida
            }
            System.out.println("Digite a quantidade de faltas");
            int faltas = teclado.nextInt();

            somaNotas += nota;
            totalAlunos++;
            if (nota>=90) {
                alunosNota90OuMais++; 
            }
            else if(nota<70 || faltas>=20) {
                alunosReprovados++;
            }
            if(nota>maiorNota) {
                maiorNota = nota;
            }
            else if(nota<menorNota) {
                menorNota = nota;
            }
        }

        //Exibir os resultados após sair do processo
        if(totalAlunos>0) {
            System.out.println("A quantidade de alunos com nota 90 ou mais é :" + alunosNota90OuMais);
            System.out.println("A quantidade de alunos reprovados é :" + alunosReprovados);
            System.out.println("A maior nota foi :" + maiorNota);
            System.out.println("A menor nota foi :" + menorNota);
            System.out.println("A media de notas da turma é :" + somaNotas/totalAlunos);
        }
        else {
            System.out.println("Nenhum aluno foi cadastrado");
        }
    }
}