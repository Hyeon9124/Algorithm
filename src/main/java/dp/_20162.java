package dp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _20162 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[1001];
        int[] dp = new int[1001];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
            dp[i] = arr[i];
        }
        int max = 0;

        for(int i = 0; i < N; i++){
            for(int j = 0; j < i; j++){
                if(arr[i] > arr[j] && dp[j] + arr[i] > dp[i])
                    dp[i] = dp[j] + arr[i];
            }
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}