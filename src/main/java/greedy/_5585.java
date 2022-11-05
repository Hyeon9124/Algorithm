package greedy;
import java.util.Scanner;
public class _5585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int result = 0;
        int sum = 0;
        sum = 1000 - N;
        int[] arr = {500, 100, 50, 10, 5, 1};

        for(int i = 0; i < arr.length; i++){
            result += sum / arr[i];
            sum %= arr[i];
        }
        sc.close();

        System.out.println(result);
    }
}