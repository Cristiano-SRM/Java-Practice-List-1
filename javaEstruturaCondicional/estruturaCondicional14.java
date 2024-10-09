package javaEstruturaCondicional;
import java.util.*;
public class estruturaCondicional14 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("informe o comando git (ex: git clone, git fetch, git pull)");
        String comando = teclado.nextInt();

        if(comando.equals("git clone")) {
            System.out.println("Descrição: clona um repositorio remoto para o seu sistema local");
            System.out.println("Exemplo: git clone https://github.com/usuario/repositorio.git , esse comando cria uma cópia local do repositorio remoto");
        }
        else if(comando.equals("git fetch")) {
            System.out.println("Descrição: obtem os dados mais recentes do repositorio remoto,mas não mistura com a copia local");
            System.out.println("Exemplo: git fetch origin , esse comando atualiza a sua referencia local sobre o que esta no repositorio remoto,mas não faz nenhuma mudança no seu código");
        }
        else if(comando.equals("git pull")) {
            System.out.println("Descrição: faz o dowload e mistura as alterações do repositorio remoto com o repositorio local");
            System.out.println("Exemplo: git pull origin main , esse comando faz o fetch dos dados mais recentes e faz o merge das mudanças automaticamente na sua cópia local");
        }
    }
}