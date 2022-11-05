package math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _11653 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 2; i <= N; i++) {
            while(N % i == 0) {
                N /= i;
                System.out.println(i);
            }
        }
    }
}