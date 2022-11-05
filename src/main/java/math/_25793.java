package math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _25793 { // A번 - 초콜릿 피라미드
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            st = new StringTokenizer(br.readLine());

            int R = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            int a = Math.min(R, C);
            int b = Math.max(R, C);
            int sum = ((a * (a + 1) * (2 * a + 1)) / 6) * 2 - a * a;


                if(a == b){
                    sb.append(sum + " ");
                    sb.append(sum - a + "\n");
                }
                else{
                    sb.append(sum + (a * a) * (b - a) + " ");
                    sb.append(sum - a + (a * a) * (b - a) + "\n");
                }

        }
        System.out.println(sb);
    }
}