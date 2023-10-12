import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int a, b, c, d, res1, res2, dif;

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nFazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto \n" +
                "de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).\n \n ");

        System.out.println("Digite o primeiro valor: ");
        a = scanner.nextInt();

        System.out.println("Digite o segundo valor: ");
        b = scanner.nextInt();

        System.out.println("Digite o terceiro valor: ");
        c = scanner.nextInt();

        System.out.println("Digite o quarto valor: ");
        d = scanner.nextInt();
        res1 = a + b;
        res2 = c + b;
        dif = res1 - res2;

        System.out.printf("A diferença %d e %d é igual a : %d", res1, res2, dif);

        scanner.close();
    }
}