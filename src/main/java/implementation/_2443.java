package implementation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _2443 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = N; i >= 1; i--) {
            for(int k = N - i; k > 0; k--) {
                System.out.print(" ");
            }
            for(int j = 2 * i - 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}