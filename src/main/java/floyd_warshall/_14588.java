package floyd_warshall;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _14588 {
    static final int INF = 987654321;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[][] graph = new int[N + 1][N + 1];
        int[] a = new int[N + 1];
        int[] b = new int[N + 1];

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                if(i == j){
                    graph[i][j] = 0;
                }
                graph[i][j] = graph[j][i] = INF;
            }
        }
        for(int i = 1; i <= N; i++){
            st = new StringTokenizer(br.readLine());
            a[i] = Integer.parseInt(st.nextToken());
            b[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i < N; i++) {
            for (int j = i + 1; j <= N; j++) {
                if (a[j] <= b[i] && a[i] <= b[j]) {
                    graph[i][j] = graph[j][i] = 1;
                }
            }
        }
        for(int k = 1; k <= N; k++){
            for(int i = 1; i <= N; i++){
                for(int j = 1; j <= N; j++){
                    if(graph[i][j] > graph[i][k] + graph[k][j]){
                        graph[i][j] = graph[i][k] + graph[k][j];
                    }
                }
            }
        }
        int M = Integer.parseInt(br.readLine());
        int result = INF;

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if(graph[x][y] == result){
                sb.append(-1 + "\n");
            }
            else{
                sb.append(graph[x][y] + "\n");
            }
        }
        System.out.println(sb);
    }
}