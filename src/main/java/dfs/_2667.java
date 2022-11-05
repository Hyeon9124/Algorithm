package dfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class _2667 {
    static int[][] graph;
    static boolean[][] visited;
    static int[] arr;
    static int N, cnt = 0;

    static int[] dx = {1, 0, 0, -1};
    static int[] dy = {0, 1, -1, 0};

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        arr[cnt]++;

        for(int i = 0; i < 4; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];

            if(cx >= 0 && cy >= 0 && cx < N && cy < N) {
                if(graph[cx][cy] == 1 && !visited[cx][cy]) {
                    visited[cx][cy] = true;
                    graph[x][y] = graph[cx][cy] + 1;
                    dfs(cx, cy);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        arr = new int[N * N];
        graph = new int[N][N];
        visited = new boolean[N][N];

        for(int i = 0; i < N; i++) {
            String s = br.readLine();
            for(int j = 0; j < s.length(); j++) {
                graph[i][j] = s.charAt(j) - '0';
            }
        }
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(graph[i][j] == 1 && !visited[i][j]) {
                    cnt++;
                    visited[i][j] = true;
                    dfs(i, j);
                }
            }
        }
        Arrays.sort(arr);
        System.out.println(cnt);

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}