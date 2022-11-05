package string;
import java.util.*;
public class _2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();

        for(int i = 1; i <= testcase; i++) {
            int R = sc.nextInt();
            String S = sc.next();

            for(int j = 0; j < S.length(); j++) {
                for(int k = 0; k < R; k++) {
                    System.out.print(S.charAt(j));
                }
            }
            sc.close();
            System.out.println();
        }
    }
}