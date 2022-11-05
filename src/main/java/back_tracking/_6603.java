package back_tracking;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class _6603 {
    static int N;
    static int[] arr;
    static int[] bt;
    static StringBuilder sb = new StringBuilder();

    public static void dfs(int startNode, int backTracking){
        if(backTracking == 6){
            for(int val : arr){
                sb.append(val + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i = startNode; i <= N; i++){
            arr[backTracking] = bt[i];
            dfs(i + 1, backTracking + 1);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true){
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());

            if(N == 0){
                break;
            }
            arr = new int[6];
            bt = new int[N + 1];

            for(int i = 1; i <= N; i++){
                bt[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(bt);

            dfs(1, 0);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}