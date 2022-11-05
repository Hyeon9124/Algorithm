package string;
import java.util.Scanner;
public class _11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= N; i++) {
            String s = sc.nextLine();

            for( i = 0; i < s.length(); i++) {
                sum += (s.charAt(i) - '0');
            }
        }
        sc.close();

        System.out.println(sum);
    }
}