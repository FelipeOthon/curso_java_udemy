import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        String x;
        int y;
        double z;


        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("O nome informado foi: " + x);
        System.out.println("A idade informada foi: " + y);
        System.out.printf("A altura informada foi: %.2f ", z);




        sc.close();
    }
}