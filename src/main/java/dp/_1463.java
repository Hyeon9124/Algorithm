package dp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[1000001];
        dp[0] = dp[1] = 0;

        for(int i = 2; i <= N; i++){
            dp[i] = dp[i - 1] + 1; // 1를 먼저 빼준다.

            if(i % 2 == 0){
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
                // 1을 뺀 값과 2로 나눈 값 중 최소값을 dp[i]에 저장한다.
            }
            if(i % 3 == 0){
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
                // 1을 뺀 값과 2로 나눈 값 중 최소값인 dp[i]와 3으로 나눈 값 중 최소값을 dp[i]에 저장한다.
            }
        }
        System.out.println(dp[N]);
    }
}