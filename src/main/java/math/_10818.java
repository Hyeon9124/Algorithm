package math;
import java.util.Scanner;
public class _10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Max = -1000000;
        int Min = 1000000;
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();

            if(Max < arr[i]) {
                Max = arr[i];
            }
            if(Min > arr[i]) {
                Min = arr[i];
            }
        }
        sc.close();
        System.out.println(Min + " " + Max);
    }
}