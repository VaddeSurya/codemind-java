import java.util.Scanner;
public class InputExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float hey=a*b;
        sc.close();
        String formattedResult = String.format("%.2f", hey);
        System.out.println(formattedResult);
    }
}
