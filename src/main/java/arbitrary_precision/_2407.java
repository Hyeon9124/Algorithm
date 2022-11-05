package arbitrary_precision;
import java.math.BigInteger;
import java.util.Scanner;
public class _2407 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        BigInteger sum1 = BigInteger.ONE;
        BigInteger sum2 = BigInteger.ONE;

        for(int i = 0; i < m; i++){
            sum1 = sum1.multiply(new BigInteger(String.valueOf(n - i)));
            sum2 = sum2.multiply(new BigInteger(String.valueOf(i + 1)));
        }
        sc.close();

        System.out.println(sum1.divide(sum2));
    }
}