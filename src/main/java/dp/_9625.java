package dp;
import java.util.Scanner;
public class _9625 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int A = 0, B = 1, sum = 0;

        for(int i = 1; i < K; i++) {
            sum = A + B;
            A = B;
            B = sum;
        }
        sc.close();

        System.out.println(A + " " + B);
    }
}