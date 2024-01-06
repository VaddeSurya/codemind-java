import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        scanner.close();
        String forma = String.format("%.2f", fahrenheit);
        System.out.println(forma);
        
    }
}
