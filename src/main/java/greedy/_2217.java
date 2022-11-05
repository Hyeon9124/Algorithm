package greedy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class _2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        long max = 0;

        for(int i = N - 1; i >= 0; i--) {
            arr[i] = arr[i] * (N - i);
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}