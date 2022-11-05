package sorting;
import java.util.Arrays;
import java.util.Scanner;
public class _2752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];

        for(int i = 0; i < 3; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        sc.close();

        System.out.print(arr[0] + " " + arr[1] + " " + arr[2]);
    }
}