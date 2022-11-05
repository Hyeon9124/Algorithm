package math;
import java.util.Scanner;
public class _11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T;
        int Sum = 0;
        T = sc.nextInt();

        int[] A = new int[T];
        int[] B = new int[T];

        for(int i = 0; i < T; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        for(int i = 0; i < T; i++) {
            Sum = A[i] + B[i];
            System.out.println("Case #" + (i+1) + ": " + Sum);
        }
        sc.close();
    }
}