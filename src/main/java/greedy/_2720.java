package greedy;
import java.util.Scanner;
public class _2720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            int M = sc.nextInt();
            int A = 0, B = 0, C = 0, D = 0;

            A += M / 25;
            M %= 25;
            B += M / 10;
            M %= 10;
            C += M / 5;
            M %= 5;
            D += M / 1;
            M %= 1;

            System.out.println(A + " " + B + " " + C + " " + D);
        }
        sc.close();
    }
}