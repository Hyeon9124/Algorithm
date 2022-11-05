package dp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
public class _10826 {
    static BigInteger[] dp;
    public static BigInteger fibonacci(int n){
        dp[0] = BigInteger.ZERO;
        dp[1] = BigInteger.ONE;

        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1].add(dp[i - 2]);
        }
        return dp[n];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        dp = new BigInteger[N + 2];

        System.out.println(fibonacci(N));
    }
}