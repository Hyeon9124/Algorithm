package math;
import java.util.Scanner;
public class _4344 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr;
        int testcase = in.nextInt();

        for(int i = 0; i < testcase; i++) {
            int N = in.nextInt();
            arr = new int[N];

            double sum = 0;

            for(int j = 0; j < N; j++) {
                int val = in.nextInt();
                arr[j] = val;
                sum += val;
            }
            double total = sum / N;
            double count = 0;

            for(int j = 0; j < N; j++) {
                if(arr[j] > total) {
                    count++;
                }
            }
            System.out.printf("%.3f", (count / N) * 100);
            System.out.println("%");
        }
        in.close();
    }
}