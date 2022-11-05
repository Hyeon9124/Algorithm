package bfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class _7576 {
    static Queue<int []> q = new LinkedList<>();

    static int[][] graph;
    static int N, M, result;

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void bfs() {
        while(!q.isEmpty()) {
            int[] xy = q.poll();
            int x = xy[0];
            int y = xy[1];

            for(int i = 0; i < 4; i++) {
                int cx = x + dx[i];
                int cy = y + dy[i];

                if(cx >= 0 && cy >= 0 && cx < N && cy < M) { // 범위 안에 있을 때
                    if(graph[cx][cy] == 0) {	// 익지 않은 토마토가 있다면
                        // 위의 2가지 조건을 만족 X 이면 다음 칸 갱신 후 Queue에 다음 칸 인덱스 추가
                        graph[cx][cy] = graph[x][y] + 1;
                        q.offer(new int[] {cx, cy});
                    }
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        graph = new int[N][M];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i < N; i++) {	// 토마토 box 이동하다가 1이면 q.offer
            for(int j = 0; j < M; j++) {
                if(graph[i][j] == 1) {
                    q.offer(new int[] {i, j});
                }
            }
        }
        bfs();

        for(int i = 0; i < N; i++) {	// check가 끝난 토마토 box를 돌면서 0이 있는지 확인
            for(int j = 0; j < M; j++) {
                if(graph[i][j] == 0) {	// 없으면 result는 몇인지 check
                    System.out.println(-1);
                    System.exit(0);
                }
                result = Math.max(result, graph[i][j]);
            }
        }
        System.out.println(result - 1);
    }
}