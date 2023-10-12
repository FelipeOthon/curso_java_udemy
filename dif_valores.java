import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

        int a, b, c, d, dif;


        System.out.println("Digite o primeiro valor");
        a = scanner.nextInt();
        System.out.println("Digite o segundo valor");
        b = scanner.nextInt();
        System.out.println("Digite o terceiro valor");
        c = scanner.nextInt();
        System.out.println("Digite o quarto valor");
        d = scanner.nextInt();

        dif = ((a * b) - (c * d));

        System.out.println("A diferença entre os valores é = " + dif);

        scanner.close();

    }
}