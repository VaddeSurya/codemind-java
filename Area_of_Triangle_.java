import java.util.Scanner;
public class TriangleAreaExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        sc.close();
        String forma = String.format("%.2f", area);
        System.out.println(forma);
    }
}
