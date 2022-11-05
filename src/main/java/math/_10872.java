package math;
import java.util.Scanner;
public class _10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum = 1;

        for(int i = 0; i < N; i++) {
            sum *= (N - i);
        }
        sc.close();

        System.out.println(sum);
    }
}