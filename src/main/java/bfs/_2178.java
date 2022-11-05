package bfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class _2178 {
    static Queue<int[]> q = new LinkedList<int[]>();

    static int[][] graph;
    static boolean[][] visited;
    static int N, M;

    static int[] dx = {1, 0, 0, -1};
    static int[] dy = {0, 1, -1, 0};

    public static void bfs(int x, int y) {
        q.offer(new int[] {x, y});	// (x, y)쌍의 int형 배열을 저장
        visited[x][y] = true;

        while(!q.isEmpty()) {
            int[] xy = q.poll();

            for(int i = 0; i < 4; i++) {
                int cx = xy[0] + dx[i];
                int cy = xy[1] + dy[i];

                if(cx >= 0 && cy >= 0 && cx < M && cy < N) {
                    if(graph[cx][cy] == 1 && !visited[cx][cy]) {
                        q.offer(new int[] {cx, cy});
                        // 다음 탐색 지점을 Queue에 추가
                        graph[cx][cy] = graph[xy[0]][xy[1]] + 1;
                        // 다음 탐색 지점의 비용을 현재 좌표 +1 로 변경
                        visited[cx][cy] = true;
                        // 다음 탐색 지점 탐색거리 방문 체크
                    }
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());	// 가로
        M = Integer.parseInt(st.nextToken());	// 세로

        graph = new int[M][N];
        visited = new boolean[M][N];

        for(int i = 0; i < N; i++) {
            String s = br.readLine();
            for(int j = 0; j < s.length(); j++) {
                graph[j][i] = s.charAt(j) - '0';
            }
        }
        bfs(0, 0);

        System.out.println(graph[M - 1][N - 1]);
    }
}