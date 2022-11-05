package math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _11050 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int sum1 = 1;
        int sum2 = 1;
        int sum3 = 1;

        for(int i = 1; i <= N; i++){
            sum1 *= i;
        }
        for(int i = 1; i <= K; i++){
            sum2 *= i;
        }
        for(int i = 1; i <= N - K; i++){
            sum3 *= i;
        }
        System.out.println(sum1 / (sum2 * sum3));
    }
}