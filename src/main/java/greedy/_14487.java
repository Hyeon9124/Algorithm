package greedy;
import java.util.Scanner;
public class _14487 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // 마을의 수
        int[] v = new int[n];
        int max = 0;
        int sum = 0;

        for(int i = 0; i < n; i++){
            v[i] = sc.nextInt();   // 마을 이동 비용
            sum += v[i];
            if(v[i] > max){
                max = v[i];
            }
        }
        sc.close();

        System.out.println(sum - max);
    }
}