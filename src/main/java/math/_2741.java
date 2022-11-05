package math;
import java.util.*;
public class _2741 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] n = new int[N];

        for(int i = 1; i <= N; i++) {
            System.out.println(n[i - 1] = i);
        }
        sc.close();
    }
}