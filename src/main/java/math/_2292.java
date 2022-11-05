package math;
import java.util.Scanner;
public class _2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 1;
        int num = 2;

        if (N == 1) {
            System.out.print(1);
        }

        else {
            while (num <= N) {
                num +=(6 * count);
                count++;
            }
            sc.close();
            System.out.print(count);
        }
    }
}