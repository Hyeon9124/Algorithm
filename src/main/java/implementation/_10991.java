package implementation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _10991 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        if(N == 1){
            sb.append("*");
        }
        else {
            for(int i = 1; i <= N; i++){
                for(int j = 0; j < N - i; j++){
                    sb.append(" ");
                }
                for(int k = 0; k < i; k++){
                    sb.append("* ");
                }
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}