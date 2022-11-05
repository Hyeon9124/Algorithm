package dp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _9711 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        long[] fibonacci = new long[10001];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        fibonacci[2] = 1;
        int cnt = 0;

        while (N --> 0){
            cnt++;
            st = new StringTokenizer(br.readLine());

            int P = Integer.parseInt(st.nextToken());
            int Q = Integer.parseInt(st.nextToken());

            if(P == 1 && Q == 1){
                sb.append("Case #" + cnt + ": " + 0 + "\n");
                continue;
            }
            for(int i = 2; i <= P; i++){
                fibonacci[i] = (fibonacci[i - 1] + (fibonacci[i - 2])) % Q;
            }
            sb.append("Case #" + cnt + ": " + fibonacci[P] + "\n");
        }
        System.out.println(sb);
    }
}