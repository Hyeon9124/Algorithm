package math;
import java.util.Scanner;
public class _5596 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[2];

        for(int i = 0; i < 2; i++){
            int info = sc.nextInt();
            int math = sc.nextInt();
            int sci = sc.nextInt();
            int eng = sc.nextInt();

            arr[i] = info + math + sci + eng;
        }

        if(arr[0] > arr[1]){
            System.out.println(arr[0]);
        }
        else{
            System.out.println(arr[1]);
        }
        sc.close();
    }
}