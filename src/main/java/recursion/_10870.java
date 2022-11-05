package recursion;
import java.util.*;
public class _10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i = 2; i < N; i++) {
            arr[0] = 0;
            arr[1] = 1;
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        if(N > 2) {
            System.out.println(arr[N - 1] + arr[N - 2]);
        }
        else if(N == 0) {
            System.out.println(0);
        }
        else if(N == 1) {
            System.out.println(1);
        }
        else if(N == 2) {
            System.out.println(1);
        }
        sc.close();
    }
}