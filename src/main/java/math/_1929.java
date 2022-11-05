package math;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class _1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] prime = new boolean[N + 1];

        for(int i = 2; i <= N; i++) {
            if(prime[i]){
                continue;
            }
            if(i >= M) {
                sb.append(i).append('\n');
            }

            for(int j = i + i; j <= N; j += i) {
                prime[j] = true;
            }
        }
        System.out.println(sb);
    }
}