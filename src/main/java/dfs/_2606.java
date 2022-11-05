package dfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;
public class _2606 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static Stack<Integer> stack = new Stack<>();

    static int N, M, cnt = 1, count = -1;
    static int[] visited;

    public static void dfs(int startNode) {
        stack.push(startNode);

        while(!stack.isEmpty()) {
            int node = stack.pop();

            if(visited[node] == 0) {
                visited[node] = cnt++;
                count++;
                stack.addAll(graph.get(node));
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        visited = new int[N + 1];

        for(int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        for(int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        for(int i = 0; i <= N; i++) {
            Collections.sort(graph.get(i), Collections.reverseOrder());
        }
        dfs(1);

        System.out.println(count);
    }
}