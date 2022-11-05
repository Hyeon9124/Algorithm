package back_tracking;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class _15666 {
    static int N, M;
    static int[] arr;
    static int[] bt;
    static StringBuilder sb = new StringBuilder();

    public static void dfs(int startNode, int backTracking){
        if(backTracking == M){
            for(int val : arr){
                sb.append(val + " ");
            }
            sb.append("\n");
            return;
        }
        int check = 0;
        for(int i = startNode; i <= N; i++){
            if(check != bt[i]){
                arr[backTracking] = bt[i];
                check = bt[i];
                dfs(i, backTracking + 1);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        bt = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            bt[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(bt);

        dfs(1, 0);

        System.out.println(sb);
    }
}