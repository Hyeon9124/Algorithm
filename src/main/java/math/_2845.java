package math;
import java.util.Scanner;
public class _2845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int P = sc.nextInt();
        int[] arr = new int[5];
        int sum = 0;
        for(int i = 0; i < 5; i++){
            int human = sc.nextInt();
            sum = human - P * L;
            arr[i] = sum;
        }
        for(int i = 0; i < 5; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}