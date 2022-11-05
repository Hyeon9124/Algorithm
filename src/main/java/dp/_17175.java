package dp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _17175 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long[] dp = new long[N + 2];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i <= N; i++){
            dp[i] = (dp[i - 1] + dp[i - 2] + 1) % 1000000007;
        }
        System.out.println(dp[N]);
    }
}