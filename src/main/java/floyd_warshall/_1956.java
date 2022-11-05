package floyd_warshall;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _1956 {
    static final int INF = 987654321;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] graph = new int[N + 1][N + 1];

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                graph[i][j] = INF;

                if(i == j){
                    graph[i][j] = 0;
                }
            }
        }

         for(int i = 0; i < M; i++){
             st = new StringTokenizer(br.readLine());
             int a = Integer.parseInt(st.nextToken());
             int b = Integer.parseInt(st.nextToken());
             int c = Integer.parseInt(st.nextToken());

             graph[a][b] = c;
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
         int min = INF;

         for(int i = 1; i <= N; i++){
             for(int j = 1; j <= N; j++){
                 if(i == j){
                     continue;
                 }
                 if(graph[i][j] != INF && graph[j][i] != INF){
                     min = Math.min(min, graph[i][j] + graph[j][i]);
                 }
             }
         }
        System.out.println(min >= INF ? -1 : min);
    }
}