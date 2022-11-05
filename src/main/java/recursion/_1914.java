package recursion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
public class _1914 {
    static StringBuilder sb = new StringBuilder();
    public static void hanoi(int N, int one, int two, int three) {
        if(N == 1){
            sb.append(one + " " + three).append('\n');
            return;
        }
        else if(N <= 20){
            hanoi(N - 1, one, three, two);

            sb.append(one + " " + three).append('\n');

            hanoi(N - 1, two, one, three);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        BigInteger num = BigInteger.TWO;
        BigInteger bi = BigInteger.ONE;
        sb.append(num.pow(N).subtract(bi)).append('\n');

        hanoi(N, 1, 2, 3);

        System.out.println(sb);
    }
}