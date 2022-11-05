package bruteforce;
import java.util.Scanner;
public class _2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int result = 0;

        for(int i = 0; i < N; i++) {
            int number = i;
            int sum = 0;

            while(number != 0) {
                sum += number % 10;
                number /= 10;
            }
            if(sum + i == N) {
                result = i;
                break;
            }
        }
        sc.close();

        System.out.println(result);
    }
}