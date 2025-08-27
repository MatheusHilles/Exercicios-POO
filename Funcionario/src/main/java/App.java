import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario[] funcionarios = new Funcionario[1];

        for (int i = 0; i < funcionarios.length; i++) {
            System.out.print("Digite o nome do funcionário " + (i + 1) + ": ");
            String nome = scanner.next();

            System.out.print("Digite o salário do funcionário " + (i + 1) + ": ");
            double salario = scanner.nextDouble();

            funcionarios[i] = new Funcionario(nome, salario);
        }

        System.out.println("\n--- RELATÓRIO DE FUNCIONÁRIOS ---");
        for (Funcionario f : funcionarios) {
            System.out.printf("Nome: %s | Salário: R$ %.2f | IRPF: R$ %.2f\n",
                    f.getNome(), f.getSalario(), f.calcularIrpf());
        }
    }
}
