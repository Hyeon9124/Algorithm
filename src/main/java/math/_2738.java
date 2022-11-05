package math;
import java.util.Scanner;
public class _2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Byte N = sc.nextByte();
        Byte M = sc.nextByte();

        int [][] A = new int[N][M];
        int [][] B = new int[N][M];

        for(int i = 0 ; i < N ; i++) {
            for (int j = 0 ; j < M ; j++) {
                A[i][j] = sc.nextByte();
            }
        }

        for(int i = 0 ; i < N ; i++) {
            for (int j = 0; j < M; j++) {
                B[i][j] = sc.nextByte();
            }
        }

        for(int i = 0 ; i < N ; i++) {
            for (int j = 0 ; j < M ; j++) {
                System.out.print(A[i][j] + B[i][j] + " ");
                if(j == M - 1)
                    System.out.println();
            }
        }
        sc.close();
    }
}