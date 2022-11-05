package bfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class _2583 {
    static Queue<int []> q = new LinkedList<>();
    static int N, M;
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = new int[]{1, 0, 0, -1};
    static int[] dy = new int[]{0, 1, -1, 0};

    public static int bfs(int x, int y){
        q.offer(new int[]{x, y});
        visited[x][y] = true;
        int cnt = 1;

        while(!q.isEmpty()){
            int[] xy = q.poll();

            for(int i = 0; i < 4; i++){
                int cx = xy[0] + dx[i];
                int cy = xy[1] + dy[i];

                if(cx >= 0 && cy >= 0 && cx < N && cy < M){
                    if(!visited[cx][cy] && graph[cx][cy] == 0){
                        visited[cx][cy] = true;
                        graph[cx][cy] = graph[x][y] + 1;
                        q.offer(new int[] {cx, cy});
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        graph = new int[N + 1][M + 1];
        visited = new boolean[N + 1][M + 1];

        for(int i = 0; i < K; i++){ // 좌표 안에 있는 곳들을 전부 1로 바꿈
            st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            for(int j = y1; j < y2; j++){
                for(int k = x1; k < x2; k++){
                    graph[j][k] = 1;
                }
            }
        }
        int count = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(!visited[i][j] && graph[i][j] == 0){
                    int result = bfs(i, j);
                    list.add(result);
                    count++;
                }
            }
        }
        System.out.println(count);

        Collections.sort(list);

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}