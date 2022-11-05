package math;
import java.util.*;
public class _8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum = ((n + 1)* n) / 2;
        }
        sc.close();
        System.out.println(sum);
    }
}