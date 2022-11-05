package math;
import java.util.Scanner;
public class _5554 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];
        int sum = 0;

        for(int i = 0; i < 4; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        sc.close();

        System.out.println(sum / 60);
        System.out.println(sum % 60);
    }
}