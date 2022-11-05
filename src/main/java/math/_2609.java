package math;
import java.util.Scanner;
public class _2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int min = (a < b) ? a : b;
        int gcd = 0;

        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0)
                gcd = i;
        }
        sc.close();

        System.out.println(gcd);
        System.out.println( a * b / gcd);
    }
}