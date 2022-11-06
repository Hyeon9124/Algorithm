package dp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[301];
        int[] dp = new int[301];

        for(int i = 1; i <= N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        dp[1] = arr[1];
        dp[2] = arr[1] + arr[2];
        dp[3] = Math.max(arr[1] + arr[3], arr[2] + arr[3]);

        // n-3을 밟고 n-1계단 밟는 경우 : 1번
        // n-2를 밟고 가는 경우 : 2번
        for(int i = 3; i <= N; i++){
            dp[i] = Math.max(dp[i - 2], arr[i - 1] + dp[i - 3]) + arr[i];
            // 1번과 2번 중 큰 값 + 현제 계단의 값(마지막 칸의 계단을 무조건 밟아야 하므로)
        }
        System.out.println(dp[N]);
    }
}