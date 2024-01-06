import java.util.Scanner;
public class HeronsFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        scanner.close();
        String forma = String.format("%.2f", area);
        System.out.println(forma);

    }
}
