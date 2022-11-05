package dfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
public class _24481 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    static int N, M, R;
    static int[] visited;

    public static void dfs(int n, int startNode) {
        visited[n] = startNode;

        for(int node : graph.get(n)) {
            if(visited[node] == 0 && node != R) {
                dfs(node, startNode + 1);
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

        for(int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
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
        dfs(R, 0);

        for(int i = 1; i <= N; i++) {
            if(i != R && visited[i] == 0) {
                System.out.println(-1);
            }
            else {
                System.out.println(visited[i]);
            }
        }
    }
}