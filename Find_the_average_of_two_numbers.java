import java.util.Scanner;
public class InputExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        float c=((float)a+b)/2;
        sc.close();
        String formattedResult = String.format("%.4f", c);
        System.out.println(formattedResult);
    }
}
