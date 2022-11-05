package back_tracking;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class _15663 {
    static int N, M;
    static int[] arr;
    static int[] bt;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void dfs(int backTracking) {
        if(backTracking == M) {
            for(int val : arr) {
                sb.append(val + " ");
            }
            sb.append("\n");
            return;
        }
        int check = 0; // 이전에 뽑은 값을 저장 --> 이전에 뽑은 값을 비교 안하면 중복된 수가 출력됨
        for(int i = 1; i <= N; i++) {
            if(visited[i] || check == bt[i]) { // 방문했거나 뽑았던 값일때
                continue;
            }
            visited[i] = true;
            arr[backTracking] = bt[i];
            check = arr[backTracking];
            dfs(backTracking + 1);
            visited[i] = false;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        bt = new int[N + 1];
        visited = new boolean[N + 1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++) {
            bt[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(bt);

        dfs(0);

        System.out.println(sb);
    }
}