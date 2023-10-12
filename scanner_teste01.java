import java.util.Scanner;

public class scanner_teste01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite um numero");
        int numero = scanner.nextInt();

        if (numero < 0)

            System.out.println("Numero Negativo");

        else

            System.out.println("Numero Positivo");


        scanner.close();
    }
}