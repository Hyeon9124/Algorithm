package floyd_warshall;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _2458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[][] graph = new boolean[N][N];
        int[] arr = new int[N];
        int cnt = 0;

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;

            graph[a][b] = true;
        }
        for(int k = 0; k < N; k++){
            for(int i = 0; i < N; i++){
                for(int j = 0; j < N; j++){
                    if(graph[i][k] && graph[k][j]){
                        graph[i][j] = true;
                    }
                }
            }
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){ // 자기 자신을 제외하고 비교하면서 count++
                if(graph[i][j] || graph[j][i]){ // i, j 정방향, j, i 역방향
                    arr[i]++;
                }
            }
        }
        for(int result : arr){
            if(result == N - 1){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}