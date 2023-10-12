import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        //hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        //decimais

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int numero;
        double horasTrabalhadas, valorHoras, salario;



        System.out.printf("Digite o numero do funcionario: ");
        numero = scanner.nextInt();

        System.out.printf("Digite qual é o valor da hora trabalhada: ");
        valorHoras = scanner.nextDouble();

        System.out.printf("Digite o numero de horas trabalhadas: ");
        horasTrabalhadas = scanner.nextDouble();

        salario = horasTrabalhadas * valorHoras;

        System.out.printf("O funcionario do numero %d, trabalhou %.1f e seu salario será %.2f", numero, horasTrabalhadas, salario );



        scanner.close();

    }
}