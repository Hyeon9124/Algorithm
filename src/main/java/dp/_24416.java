package dp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _24416 {
    public static int fibonacci(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        else{
            return (fibonacci(n - 1) + fibonacci(n - 2));
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(fibonacci(N) + " " + (N - 2));
    }
}