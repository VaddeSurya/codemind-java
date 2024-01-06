import java.util.Scanner;

public class CircleAreaExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double area = 3.14 * Math.pow(radius, 2);
        
        sc.close();
        String forma = String.format("%.2f", area);
        System.out.println(forma);
    }
}
