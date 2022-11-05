package hash;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
public class _2015 {
    public static void main(String[] args) throws IOException {
        HashMap<Integer, Integer> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N + 1];
        int[] ans = new int[N + 1];
        long result = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            ans[0] = 0;
            arr[i] = Integer.parseInt(st.nextToken());
            ans[i] = ans[i - 1] + arr[i];
        }
        map.put(0, 1);
        for(int i = 1; i <= N; i++){
            result += map.getOrDefault(ans[i] - K, 0);
            map.put(ans[i], map.getOrDefault(ans[i], 0) + 1);
        }
        System.out.println(result);
    }
}