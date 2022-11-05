package dfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _1012 {
    static int N, M, K;
    static int[][] graph;
    static boolean[][] visited;

    static int[] dx = {0, -1, 0, 1}; 	// 상하좌우
    static int[] dy = {1, 0, -1, 0};	// 상하좌우

    public static void dfs(int x, int y) {
        visited[x][y] = true; // 방문 체크
        // 4방면 탐색
        for(int i = 0; i < 4; i++) {
            int x1 = x + dx[i];
            int y1 = y + dy[i];
            // 배추가 있고, 탐색하지 않았으면 dfs탐색
            if(x1 >= 0 && y1 >= 0 && x1 < N && y1 < M) {
                if(graph[x][y] == 1 && !visited[x1][y1]) {
                    dfs(x1, y1);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            N = Integer.parseInt(st.nextToken());	// 가로 길이
            M = Integer.parseInt(st.nextToken());	// 세로 길이
            K = Integer.parseInt(st.nextToken());	// 배추 개수

            visited = new boolean[N][M];
            graph = new int[N][M];

            for(int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                graph[a][b] = 1;
            }
            int cnt = 0;
            // 배추가 있으면 dfs탐색 시작하고, 구역 수 증가
            for(int x = 0; x < N; x++) {
                for(int y = 0; y < M; y++) {
                    // 배추가 있고 방문하지 않았으면 dfs탐색하고 구역 수 1증가.
                    if(graph[x][y] == 1 && !visited[x][y]) {
                        dfs(x, y);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}