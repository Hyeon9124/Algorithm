package dfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _4963 {
    static int w, h;
    static int[][] graph;
    static boolean[][] visited;

    static int[] dx = {0, 0, 1, -1, -1, 1, -1, 1};
    static int[] dy = {1, -1, 0, 0, -1, 1, 1, -1};

    public static void dfs(int x, int y) {
        visited[x][y] = true;	// 방문 체크

        for(int i = 0; i < 8; i++) {
            int x1 = x + dx[i];
            int y1 = y + dy[i];
            // 섬이 있고, 경로가 없으면 dfs탐색
            if(x1 >= 0 && y1 >= 0 && x1 < h && y1 < w) {
                if(graph[x][y] == 1 && !visited[x1][y1]) {
                    dfs(x1, y1);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true) {
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());	// 너비
            h = Integer.parseInt(st.nextToken());	// 높이

            if(w == 0 && h == 0) {
                break;
            } // 너비와 높이가 0이면 입력 종료
            visited = new boolean[h][w];
            graph = new int[h][w];

            for(int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < w; j++) {
                    graph[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int cnt = 0;
            // 섬이 있으면 dfs탐색 시작하고 cnt++
            for(int x = 0; x < h; x++) {
                for(int y = 0; y < w; y++) {
                    // 섬이 있고 경로가 없으면 dfs탐색하고 구역 수 1증가
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