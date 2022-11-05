package implementation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _10992 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        if(N == 1){
            sb.append("*");
        }
        else {
            for(int i = 1; i <= N; i++){
                for(int j = i; j < N; j++){
                    sb.append(" ");
                }
                sb.append("*");
                if(i == N){
                    sb.append("*".repeat(2 * N - 2));
                    break;
                }
                if(i >= 2){
                    for(int k = 1; k < 2 * i - 2; k++){
                        sb.append(" ");
                    }
                    sb.append("*");
                }
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
// 문자열.repeat(Integer) : 문자열을 간단하게 반복