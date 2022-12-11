package TestCode;
import java.io.*;
import java.util.*;
public class DFS_BFS_Search {
    static StringBuilder sb = new StringBuilder();
    static boolean[] visited;
    static int[][] arr;
    static int node, N, M, V;

    static Queue<Integer> q = new LinkedList<>();

    public static void recursive (int V) {
        visited[V] = true;
        sb.append(V + " "); // 첫번째 값이 들어갔으므로 sb에 저장

        for(int i = 1; i <= N; i++){
            if(arr[V][i] == 1 && !visited[i]){  // 탐색하지 않은 수들 확인
                recursive(i);
            }
        }
    }
    public static void dfs(int V) {
        Stack<Integer> stack = new Stack<>();
        visited = new boolean[N + 1];

        stack.push(V);

        while (!stack.isEmpty()){
            int tmp = stack.pop();

            if(visited[tmp]){
                continue;
            }
            visited[tmp] = true;
            sb.append(tmp + " ");

            for(int i = 1; i <= N; i++){
                if(!visited[i] && arr[tmp][i] == 1){
                    stack.push(i);
                }
            }
        }
    }
    public static void bfs(int V) {
        visited = new boolean[N + 1];
        q.offer(V);
        visited[V] = true;

        while(!q.isEmpty()){
            V = q.poll();   // Queue의 맨 앞의 값을 빼주고
            sb.append(V + " ");  // sb에 저장함

            for(int i = 1; i <= N; i++){
                if(arr[V][i] == 1 && !visited[i]){  // 탐색하지 않은 수들 확인
                    q.offer(i);         // Queue 성질 이용 없으면 넣고 방문처리 해준다.
                    visited[i] = true;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());   // 정점 개수
        M = Integer.parseInt(st.nextToken());   // 간선 개수
        V = Integer.parseInt(st.nextToken());   // 시작할 정점 번호

        arr = new int[N + 1][N + 1];
        visited = new boolean[N + 1];   // 탐색한 내용을 다시 탐색하지 않도록 설정

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] = 1;  // 양방향
        }
        sb.append("dfs 재귀함수 : ");
        recursive(V);
        sb.append('\n');

        sb.append("dfs stack : ");
        dfs(V);
        sb.append('\n');

        sb.append("bfs : ");
        bfs(V);

        System.out.println(sb);
    }
}