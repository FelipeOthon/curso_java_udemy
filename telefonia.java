import java.util.Locale;
import java.util.Scanner;

public class telefonia {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int minutos;
        double conta = 50.00;

        System.out.println("Digite o valor de minutos: ");
        minutos = sc.nextInt();

        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;

        }
        System.out.printf("A conta é: R$ %.2f%n", conta);
        sc.close();
    }

}
