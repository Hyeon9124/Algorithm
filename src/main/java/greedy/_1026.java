package greedy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class _1026 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int[] A = new int[T];
        int[] B = new int[T];

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer stk = new StringTokenizer(br.readLine());

        for(int i = 0; i < T; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(stk.nextToken());
        }

        Arrays.sort(A);
        Arrays.sort(B);

        int sum = 0;

        for(int i = 0; i < T; i++) {
            sum += A[i] * B[T - 1 - i];
        }
        System.out.println(sum);
    }
}