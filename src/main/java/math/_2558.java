package math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _2558 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int sum = 0;

        sum = A + B;

        System.out.println(sum);

    }
}