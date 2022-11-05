package dfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
public class _24480_1 {

    /* 재귀를 이용한 문제 풀이*/

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    static int N, M, R, cnt = 1;
    static int[] visited;

    public static void dfs(int node) {
        // 연결된 노드들을 호출하면서 순회
        for(int i = 0; i < graph.get(node).size(); i++) {
            // 연결된 노드들중 가장 큰 노드부터 방문
            int n = graph.get(node).get(i);
            if(visited[n] == 0) {
                visited[n] = cnt++;
                dfs(n);
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

        visited = new int[N + 1];

        for(int i = 0; i < N + 1; i++) {	// 0을 처음에 포함 시켜줘야 하므로
            graph.add(new ArrayList<>()); // 2차원 배열을 리스트를 생성하기 위해서
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        for(int i = 1; i < N + 1; i++) {
            Collections.sort(graph.get(i),Collections.reverseOrder());
        }
        visited[R] = cnt;
        cnt++;
        dfs(R);


        for(int i = 1; i < N + 1; i++) {
            System.out.println(visited[i]);
        }

    }
}