package dp;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _11051 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] dp = new int[1001][1001];

        for(int i = 0; i <= N; i++){
            for(int j = 0; j <= i; j++){
                if(i == j || j == 0){
                    dp[i][j] = 1;
                }
                else{
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % 10007;
                }
            }
        }
        System.out.println(dp[N][K]);
    }
}