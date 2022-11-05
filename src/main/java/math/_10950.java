package math;
import java.util.Scanner;
public class _10950 {
    public static void main(String[] args) {
        int T;
        Scanner sc = new Scanner(System.in);

        T = sc.nextInt();

        int[] A = new int[T];
        int[] B = new int[T];


        for(int i = 0; i < T; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        for(int i = 0; i < T; i++) {
            System.out.println(A[i] + B[i]);
        }
        sc.close();
    }
}