package dfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;
public class _24479 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static Stack<Integer> stack = new Stack<>();

    static int[] visited;
    static int N, M, R, cnt = 1;

    public static void dfs(int startNode) {
        stack.push(startNode);

        while(!stack.isEmpty()) {
            int node = stack.pop();

            if(visited[node] == 0) {
                visited[node] = cnt++;
                stack.addAll(graph.get(node));
            }
        }

    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        // 이차원 연결 리스트이 형태로 그래프를 생성
        // 내부에는 0 ~ N 까지 인덱스 = N+1

        visited = new int[N + 1];

        for(int i = 0; i <= N; i++) {	// 0을 처음에 포함 시켜줘야 하므로
            graph.add(new ArrayList<Integer>());  // 2차원 배열을 리스트를 생성하기 위해서
        }
        // 그래프에 요소들을 추가
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        // 그래프의 요소들을 정렬
        for(int i = 0; i <= N; i++) {
            Collections.sort(graph.get(i),Collections.reverseOrder());
        }

        dfs(R);
        // 방문순서를 출력
        for(int i = 1; i <= N; i++) {
            System.out.println(visited[i]);
        }

    }
}