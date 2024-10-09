package estruturaDoWhile;
import javax.swing.JOptionPane;
public class estruturaDoWhile2 {

	public static void main(String[] args) {
        double nota = -1;
        double salario = -1;
        String sexo = "";
        int idade = -1;

        do {
            String entradaNota = JOptionPane.showInputDialog("Informe a nota (entre 0 e 10): ");
            nota = Double.parseDouble(entradaNota);

            if (nota < 0 || nota > 10) {
                JOptionPane.showMessageDialog(null, "Nota inválida! Informe uma nota entre 0 e 10.");
            }
        } while (nota < 0 || nota > 10);

        do {
            String entradaSalario = JOptionPane.showInputDialog("Informe o salário (maior que 0): ");
            salario = Double.parseDouble(entradaSalario);

            if (salario <= 0) {
                JOptionPane.showMessageDialog(null, "Salário inválido! Informe um valor maior que 0.");
            }
        } while (salario <= 0);

        do {
            sexo = JOptionPane.showInputDialog("Informe o sexo (m ou f): ").toLowerCase();

            if (!sexo.equals("m") && !sexo.equals("f")) {
                JOptionPane.showMessageDialog(null, "Sexo inválido! Informe 'm' para masculino ou 'f' para feminino.");
            }
        } while (!sexo.equals("m") && !sexo.equals("f"));

        do {
            String entradaIdade = JOptionPane.showInputDialog("Informe a idade (entre 0 e 120): ");
            idade = Integer.parseInt(entradaIdade);

            if (idade < 0 || idade > 120) {
                JOptionPane.showMessageDialog(null, "Idade inválida! Informe uma idade entre 0 e 120.");
            }
        } while (idade < 0 || idade > 120);

        JOptionPane.showMessageDialog(null, "Todos os dados foram informados corretamente!\n"
                + "Nota: " + nota + "\n"
                + "Salário: " + salario + "\n"
                + "Sexo: " + (sexo.equals("m") ? "Masculino" : "Feminino") + "\n"
                + "Idade: " + idade);
    }
}