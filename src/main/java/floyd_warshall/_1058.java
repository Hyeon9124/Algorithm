package floyd_warshall;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _1058 {
    static final int INF = 987654321;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] graph = new int[N + 1][N + 1];

        for(int i = 1; i <= N; i++){
            String s = br.readLine();
            for(int j = 1; j <= s.length(); j++){
                if(s.charAt(j - 1) == 'Y'){
                    graph[i][j] = 1;
                }
                else if(i != j){
                    graph[i][j] = INF;
                }
            }
        }
        for(int k = 1; k <= N; k++){
            for(int i = 1; i <= N; i++){
                for(int j = 1; j <= N; j++){
                    if(i == j || j == k || i == k){
                        continue;
                    }
                    else if(graph[i][j] > graph[i][k] + graph[k][j]){
                        graph[i][j] = graph[i][k] + graph[k][j];
                    }
                }
            }
        }
        int result = 0;

        for(int i = 1; i <= N; i++){
            int cnt = 0;
            for(int j = 1; j <= N; j++){
                if(i == j){
                    continue;
                }
                else if(graph[i][j] <= 2){
                    cnt++;
                }
            }
            result = Math.max(result, cnt);
        }
        System.out.println(result);
    }
}