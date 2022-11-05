package implementation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _2444 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++) {
            for(int j = N - i; j > 0; j--) {
                System.out.print(" ");
            }
            for(int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i < N; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = 2 * (N - i) - 1; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}