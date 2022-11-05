package floyd_warshall;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _2660 {
    static final int INF = 987654321;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[][] graph = new int[N + 1][N + 1];

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                if(i != j){
                    graph[i][j] = INF;
                }
            }
        }
        while(true){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if(x == -1 && y == -1){
                break;
            }
            graph[x][y] = graph[y][x] = 1;
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
        int result = INF;
        int[] arr = new int[N + 1];

        for(int i = 1; i <= N; i++){
            int num = 0;
            for(int j = 1; j <= N; j++){
                if(graph[i][j] != INF){
                    num = Math.max(num, graph[i][j]);
                }
            }
            arr[i] = num;
            result = Math.min(result, num);
        }
        int count = 0;

        for(int i = 1; i <= N; i++){
            if(result == arr[i]){
                count++;
                sb.append(i + " ");
            }
        }
        System.out.println(result + " " + count);
        System.out.println(sb);
    }
}