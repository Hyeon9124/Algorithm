package floyd_warshall;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _1507 {
    static final int INF = 987654321;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[][] graph = new int[N + 1][N + 1]; // 주어진 배열
        int[][] arr = new int[N + 1][N + 1];    // 플로이드 워셜 알고리즘 수행전 배열
        boolean[][] check = new boolean[N + 1][N + 1];

        for(int i = 1; i <= N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= N; j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
                arr[i][j] = graph[i][j];
            }
        }
        for(int k = 1; k <= N; k++){
            for(int i = 1; i <= N; i++){
                for(int j = 1; j <= N; j++){
                    /*
                    i == k, k == j인 경우를 거르지 않으면 거쳐가지 않는 간선도 전부 없어질 수 있음.
                    예를들어 i = 1, k = 1, j = 2일 때 1에서 2로 가기 위해 거쳐가는 정점이 없는데
                    1 -> 2 간선을 없어질 수 있음.
                     */
                    if(i == k || k == j || j == i){
                        continue;
                    }
                    // graph는 플로이드 워셜 알고리즘을 이미 수행한 상태이므로 또 최단거리를 초기화 하면 모순이 생김
                    if(graph[i][j] > graph[i][k] + graph[k][j]){
                        System.out.println(-1);
                        return;
                    }
                    // 거쳐가는 지점을 통해 최단거리가 초기화된 부분이 있으면 i -> j 간선을 없앤다.
                    if(graph[i][j] == graph[i][k] + graph[k][j]){
                        arr[i][j] = INF;
                    }
                }
            }
        }
        int sum = 0;

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                if(arr[i][j] != INF && i != j && !check[i][j]){
                    sum += arr[i][j];
                    check[i][j] = check[j][i] = true;
                }
            }
        }
        System.out.println(sum);
    }
}