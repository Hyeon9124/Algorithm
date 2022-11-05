package math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _18917 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int M = Integer.parseInt(br.readLine());

        long plus = 0;
        long result = 0;

        while(M --> 0){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());

            switch (N){
                case 1 :
                    int num1 = Integer.parseInt(st.nextToken());
                    plus += num1;
                    result ^= num1;
                    break;
                case 2:
                    int num2 = Integer.parseInt(st.nextToken());
                    plus -= num2;
                    result ^= num2; // x를 한번 더 xor 연산을 하여 기존의 x를 없애준다.
                    break;
                case 3:
                    sb.append(plus + "\n");
                    break;

                case 4:
                    sb.append(result + "\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}