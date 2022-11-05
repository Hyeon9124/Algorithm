package math;
import java.util.Scanner;
public class _2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        int Max = 0;
        int num = 0;
        for(int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();

            if(Max < arr[i]) {
                Max = arr[i];
                num = i + 1;
            }
        }
        sc.close();
        System.out.println(Max);
        System.out.println(num);
    }
}