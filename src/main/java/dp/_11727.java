package dp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _11727 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 3;
        dp[3] = 5;

        for(int i = 4; i <= N; i++){
            dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007;
        }
        System.out.println(dp[N]);
    }
}