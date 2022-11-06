package dp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[1001];
        dp[1] = 1;
        dp[2] = 2;

        for(int i = 3;  i <= N; i++){
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }
        br.close();

        System.out.println(dp[N]);
    }
}