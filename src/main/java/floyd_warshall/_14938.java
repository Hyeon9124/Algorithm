package floyd_warshall;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _14938 {
    static final int INF = 987654321;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int[] t = new int[n + 1];
        int[][] graph = new int[n + 1][n + 1];

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == j){
                    continue;
                }
                graph[i][j] = INF;
            }
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++){
            t[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < r; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            graph[a][b] = graph[b][a] = c;
        }
        for(int k = 1; k <= n; k++){
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    if(graph[i][j] > graph[i][k] + graph[k][j]){
                        graph[i][j] = graph[i][k] + graph[k][j];
                    }
                }
            }
        }
        int result = 0;
        int sum;

        for(int i = 1; i <= n; i++){
            sum = 0;
            for(int j = 1; j <= n; j++){
                if(graph[i][j] <= m){
                    sum += t[j];
                }
            }
            result = Math.max(result, sum);
        }
        System.out.println(result);
    }
}