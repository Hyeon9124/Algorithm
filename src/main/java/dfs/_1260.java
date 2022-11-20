package dfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class _1260 {
    static StringBuilder sb = new StringBuilder();
    static boolean[] check;
    static int[][] arr;
    static int node, N, M, V;

    static Queue<Integer> q = new LinkedList<>();

    public static void dfs(int V) {
        check[V] = true;
        sb.append(V + " "); // 첫번째 값이 들어갔으므로 sb에 저장

        for(int i = 1; i <= N; i++){
            if(arr[V][i] == 1 && !check[i]){  // 탐색하지 않은 수들 확인
                dfs(i);
            }
        }
    }
    public static void bfs(int V) {
        q.offer(V);
        check[V] = true;

        while(!q.isEmpty()){
            V = q.poll();   // Queue의 맨 앞의 값을 빼주고
            sb.append(V + " ");  // sb에 저장함

            for(int i = 1; i <= N; i++){
                if(arr[V][i] == 1 && !check[i]){  // 탐색하지 않은 수들 확인
                    q.offer(i);         // Queue 성질 이용 없으면 넣고 check해준다
                    check[i] = true;
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
        check = new boolean[N + 1];   // 탐색한 내용을 다시 탐색하지 않도록 설정

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] = 1;  // a -> b && b -> 로 갈 수 있다는 코드
        }
        dfs(V);
        sb.append('\n');

        check = new boolean[N + 1]; // bfs에서 check해준 값을 가져옴
        bfs(V);

        System.out.println(sb);
    }
}
/*
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
 */