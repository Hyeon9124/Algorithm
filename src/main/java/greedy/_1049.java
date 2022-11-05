package greedy;
import java.util.Scanner;
public class _1049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int first = 1000;
        int second = 1000;

        for(int i = 0; i < M; i++){
            first = Math.min(first, sc.nextInt());
            second = Math.min(second, sc.nextInt());
        }
        sc.close();

        int sum1 , sum2 , sum3;

        if(N % 6 == 0){
            sum1 = first * (N / 6);
        }
        else{
            sum1 = first * ((N / 6) + 1);
        }
        sum2 = (first * (N / 6) + (second * (N % 6)));
        sum3 = second * N;

        int result = Math.min(sum1, Math.min(sum2, sum3));

        System.out.println(result);
    }
}