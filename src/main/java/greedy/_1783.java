package greedy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _1783 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int max = 0;

        if(N == 1){
            max = 1;
        }
        else if(N == 2){
            max = Math.min(4, (M + 1) / 2);
        }
        else{
            if(M < 7){
                max = Math.min(4, M);
            }
            else{
                max = M - 2;
            }
        }
        System.out.println(max);
    }
}