package floyd_warshall;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _1613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[][] graph = new boolean[N + 1][N + 1];

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph[x][y] = true;
        }
        for(int k = 1; k <= N; k++){
            for(int i = 1; i <= N; i++){
                for(int j = 1; j <= N; j++){
                    if(graph[i][k] && graph[k][j]){
                        graph[i][j] = true;
                    }
                }
            }
        }
        int s = Integer.parseInt(br.readLine());

        for(int i = 0; i < s; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a < 1 || b < 1 || a > N || b > N){ // 범위를 벗어난 경우
                continue;
            }
            else{
                if(graph[a][b]){ // 사건이 먼저 일어났을 때
                    sb.append(-1 + "\n");
                }
                else {
                    if(graph[b][a]){ // 사건이 나중에 일어났을 때
                        sb.append(1 + "\n");
                    }
                    else{ // 노드가 a -> b, b -> a로 갈 수 없을 때
                        sb.append(0 + "\n");
                    }
                }
            }
        }
        System.out.println(sb);
    }
}