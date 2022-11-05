package dfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _10026 {
    static int N;
    static char[][] graph;;
    static boolean[][][] visited;

    static int[] dx = {1, 0, 0, -1};
    static int[] dy = {0, 1, -1, 0};

    public static void dfs(int y, int x, boolean[][] visited, char c) {
        visited[y][x] = true;

        for(int i = 0; i < 4; i++) {
            int cy = y + dy[i];
            int cx = x + dx[i];

            if (cx < 0 || cy < 0 || cx >= N || cy >= N) {
                continue;
            }
            if(visited[cy][cx] || graph[cy][cx] != c) {
                continue;
            }
            dfs(cy, cx, visited, c);
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        int[] arr = {0, 0};
        graph = new char[N][N];
        visited = new boolean[2][N][N];

        for(int i = 0; i < N; i++) {
            String s = br.readLine();
            for(int j = 0; j < s.length(); j++) {
                graph[i][j] = s.charAt(j);
            }
        }
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < N; j++) {
                for(int k = 0; k < N; k++) {
                    if(!visited[i][j][k]) {
                        dfs(j, k, visited[i], graph[j][k]);
                        arr[i]++;
                    }
                    if(graph[j][k] == 'G') {
                        graph[j][k] = 'R';
                    }
                }
            }
        }
        System.out.println(arr[0] + " " + arr[1]);
    }
}