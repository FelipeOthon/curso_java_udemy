import java.util.Locale;

public class Main {
    public static void main(String[] args) {
//calculando uma área
        double b, B, h, area;

        b = 6.0;
        h = 5.0;
        B = 8.0;
        area = ((b + B) * h) / 2.0;
        Locale.setDefault(Locale.US);

        System.out.printf("Á area do exemplo é equivale a %.2f: ", area);
    }
}