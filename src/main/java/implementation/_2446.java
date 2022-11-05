package implementation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _2446 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++){
            for(int k = 0; k < i - 1; k++){
                sb.append(" ");
            }
            for(int j = 2 * (N - i + 1) - 1; j > 0; j--){
                sb.append("*");
            }
            sb.append("\n");
        }
        for(int i = 1; i < N; i++){
            for(int j = i; j < N - 1; j++){
                sb.append(" ");
            }
            for(int k = 0; k < 2 * i + 1; k++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}