package recursion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _2447 {
    static int N;
    static StringBuilder sb = new StringBuilder();
    public static void star(int x, int y){
       if(x < 3 && y < 3){
           if(x % 3 == 1 && y % 3 == 1){
               sb.append(" ");
           }
           else{
               sb.append("*");
           }
       }
       else{
           if(x % 3 == 1 && y % 3 == 1){
               sb.append(" ");
           }
           else{
               star(x / 3, y / 3);
           }
       }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++){
                star(i, j);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}