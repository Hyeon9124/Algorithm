package dp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N + 1];
        int[] arr = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[1] = 1;
        int result = 1;

        for(int i = 2; i <= N; i++){
            dp[i] = 1;
            for(int j = 1; j < i; j++){
                if(arr[i] > arr[j] && dp[i] <= dp[j]){
                    dp[i] = dp[j] + 1;
                }
            }
            result = Math.max(result, dp[i]);
        }
        System.out.println(result);
    }
}