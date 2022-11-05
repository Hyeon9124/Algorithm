package bfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
class node {
    int x, y, z;

    node(int z, int y, int x){
        this.z = z;	// 높이
        this.y = y;	// 가로
        this.x = x;	// 세로
    }
}
public class _7569 {
    static Queue<node> q = new LinkedList<>();

    static int[][][] graph;
    static boolean[] visited;
    static int N, M, H;

    static int[] dx = {1, 0, 0, 0, 0, -1};
    static int[] dy = {0, 0, 0, 1, -1, 0};
    static int[] dz = {0, 1, -1, 0, 0, 0};

    public static void bfs() {
        while(!q.isEmpty()) {
            node n = q.poll();
            int x = n.x;
            int y = n.y;
            int z = n.z;

            for(int i = 0; i < 6; i++) {
                int cx = x + dx[i];
                int cy = y + dy[i];
                int cz = z + dz[i];

                if(cx >= 0 && cy >= 0 && cz >= 0 && cx < N && cy < M && cz < H) {
                    if(graph[cz][cy][cx] == 0) { // 토마토가 익지 않았다면
                        q.offer(new node (cz, cy, cx));	// 토마토 추가
                        graph[cz][cy][cx] = graph[z][y][x] + 1;
                        // 익을 날짜를 얻기 위해 그 전 값에서 1증가
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
        H = Integer.parseInt(st.nextToken());	// 높이

        graph = new int[H][M][N];

        for(int i = 0; i < H; i++) {
            for(int j = 0; j < M; j++) {
                st = new StringTokenizer(br.readLine());
                for(int k = 0; k < N; k++) {
                    graph[i][j][k] = Integer.parseInt(st.nextToken());

                    if(graph[i][j][k] == 1) {	// 토마토가 익으면 Queue에 offer
                        q.offer(new node (i, j, k));
                    }
                }
            }
        }
        bfs();

        int result = Integer.MIN_VALUE;	// 최대 날짜

        for(int i = 0; i < H; i++) {
            for(int j = 0; j < M; j++) {
                for(int k = 0; k < N; k++) {
                    if(graph[i][j][k] == 0) {	// 토마토가 익지 않았다면
                        System.out.println(-1);
                        System.exit(0);
                    }
                    result = Math.max(result, graph[i][j][k]);
                    // 날짜 최대값 구하는 식
                }
            }
        }
        System.out.println(result - 1);
    }
}