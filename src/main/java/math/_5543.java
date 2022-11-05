package math;
import java.util.Scanner;
public class _5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr1 = new int[3];
        int[] arr2 = new int[2];
        int min1 = 2001;
        int min2 = 2001;

        for(int i = 0; i < 3; i++){
            arr1[i] = sc.nextInt();
            if(arr1[i] < min1){
                min1 = arr1[i];
            }
        }
        for(int i = 0; i < 2; i++){
            arr2[i] = sc.nextInt();
            if(arr2[i] < min2){
                min2 = arr2[i];
            }
        }
        sc.close();

        System.out.println(min1 + min2 - 50);
    }
}