package implementation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _10797 { // 시험기간때 제출용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] day = new int[5];
        int cnt = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 5; i++){
            day[i] = Integer.parseInt(st.nextToken());

            if(day[i] == N){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}