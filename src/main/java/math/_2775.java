package math;
import java.util.Scanner;
public class _2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] APT = new int[15][15];

        for(int i = 0; i < 15; i++) {
            APT[i][1] = 1;	// i층 1호
            APT[0][i] = i;	// 0층 i호
        }
        for(int i = 1; i < 15; i ++) {
            for(int j = 2; j < 15; j++) {
                APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
            }
        }
        int testcase = sc.nextInt();

        for(int i = 0; i < testcase; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();

            System.out.println(APT[k][n]);
        }
        sc.close();
    }
}