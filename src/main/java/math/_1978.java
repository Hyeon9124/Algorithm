package math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _1978 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int count = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < T; i++) {
            boolean isPrime = true;

            int N = Integer.parseInt(st.nextToken());

            if(N == 1){
                continue;
            }
            for(int j = 2; j <= Math.sqrt(N); j++ ) {
                if(N % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                count++;
            }
        }
        System.out.println(count);
    }
}