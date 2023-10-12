import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double horasTrabalhadas, valorHoras;
        int numeroFuncionario;

        System.out.printf("Digite o numero do funcionario: ");
        numeroFuncionario = scanner.nextInt();

        System.out.printf("Digite o as horas trabalhadas: ");
        horasTrabalhadas = scanner.nextDouble();

        System.out.printf("Digite o valor das horas: ");
        valorHoras = scanner.nextDouble();

        double salario = horasTrabalhadas * valorHoras;

        System.out.println("Numero do funcionario: " + numeroFuncionario);
        System.out.printf("Seu salario é: %.2f", salario);


        scanner.close();
    }
}