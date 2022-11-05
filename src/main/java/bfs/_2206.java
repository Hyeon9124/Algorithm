package bfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class _2206 {
    static class node{
        int x, y, move, change;

        public node(int y, int x, int move, int change){
            this.y = y;
            this.x = x;
            this.move = move;	// 이동 거리
            this.change = change;	// 벽 부수고 이동
        }
    }
    static Queue<node> q = new LinkedList<>();

    static int[][] graph;
    static int[][] visited;
    static int N, M, result;

    static int[] dx = {1, 0, 0, -1};
    static int[] dy = {0, 1, -1, 0};

    public static void bfs(int x, int y) {
        q.offer(new node(y, x, 1, 0));
        visited[y][x] = 0;

        while(!q.isEmpty()) {
            node n = q.poll();

            if(n.y == N - 1 && n.x == M - 1) {
                result = n.move;
                break;
            }

            for(int i = 0; i < 4; i++) {
                int cy = n.y + dy[i];
                int cx = n.x + dx[i];

                if(cy < 0 || cx < 0 || cy >= N || cx >= M) {
                    continue;
                }
                if(visited[cy][cx] <= n.change) { // 벽을 안부셨을 때
                    continue;
                }

                if(graph[cy][cx] == 0) {	// 벽이 아닐 때
                    visited[cy][cx] = n.change;
                    q.offer(new node(cy, cx, n.move + 1, n.change));
                }
                else {
                    if(n.change == 0) {	// 벽일 때
                        visited[cy][cx] = n.change + 1;
                        q.offer(new node(cy, cx, n.move + 1, n.change + 1));
                    }
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        graph = new int[N][M];
        visited = new int[N][M];

        for(int i = 0; i < N; i++) {
            String s = br.readLine();
            for(int j = 0; j < M; j++) {
                graph[i][j] = s.charAt(j) - '0';
                visited[i][j] = Integer.MAX_VALUE; // 무한대로 초기화
            }
        }
        result = Integer.MAX_VALUE;

        bfs(0, 0);

        if(result == Integer.MAX_VALUE) {
            System.out.println(-1);
        }
        else {
            System.out.println(result);
        }
    }
}