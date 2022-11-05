package bfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class _7562 {
    static Queue<int []> q = new LinkedList<>();
    static int[][] graph;
    static boolean[][] visited;
    static int N, x, y, xp, yp;
    static int[] dx = {1, -1, 2, -2, 1, -1, 2, -2};
    static int[] dy = {2, 2, 1, 1, -2, -2, -1, -1};

    public static void bfs(int x, int y){
        q.offer(new int[] {x, y});
        visited[x][y] = true;

        while(!q.isEmpty()){
            int[] xy = q.poll();

            for(int i = 0; i < 8; i++){
                int cx = xy[0] + dx[i];
                int cy = xy[1] + dy[i];

                if(cx >= 0 && cy >= 0 && cx < N && cy < N){
                    if(!visited[cx][cy]){
                        q.offer(new int[] {cx, cy});
                        graph[cx][cy] = graph[xy[0]][xy[1]] + 1;
                        visited[cx][cy] = true;
                    }
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++){
            N = Integer.parseInt(br.readLine());

            graph = new int[N][N];
            visited = new boolean[N][N];

            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            xp = Integer.parseInt(st.nextToken());
            yp = Integer.parseInt(st.nextToken());

            bfs(x, y);

            System.out.println(graph[xp][yp]);
        }
    }
}