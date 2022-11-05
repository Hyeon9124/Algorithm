package back_tracking;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _10974 {
    static int N;
    static int[] arr;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void dfs(int backTracking){
        if(backTracking == N){
            for(int val : arr){
                sb.append(val + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i = 1; i <= N; i++){
            if(visited[i]){
                continue;
            }
            arr[backTracking] = i;
            visited[i] = true;
            dfs(backTracking + 1);
            visited[i] = false;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        arr = new int[N];
        visited = new boolean[N + 1];

        dfs(0);

        System.out.println(sb);
    }
}