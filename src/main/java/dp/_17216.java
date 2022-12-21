package dp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _17216 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N + 1];
        int[] dp = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = arr[i];
        }
        int max = 0;

        for(int i = 1; i <= N; i++){
            for(int j = 1; j < i; j++){
                if(arr[i] < arr[j]) dp[i] = Math.max(dp[i], dp[j] + arr[i]);
            }
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}