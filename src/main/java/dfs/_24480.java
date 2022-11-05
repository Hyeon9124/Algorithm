package dfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;
public class _24480 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static Stack<Integer> stack = new Stack<>();

    static int N, M, R, cnt = 1;
    static int[] visited;

    public static void dfs(ArrayList<ArrayList<Integer>> graph, int[] visited, int startNode) {
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
            Collections.sort(graph.get(i));
        }
        dfs(graph, visited, R);

        for(int i = 1; i < N + 1; i++) {
            System.out.println(visited[i]);
        }

    }
}