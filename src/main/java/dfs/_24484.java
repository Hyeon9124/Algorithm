package dfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
public class _24484 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    static int N, M, R, cnt = 1;
    static long[] visited;
    static long[] check;

    public static void dfs(int n, int startNode) {
        visited[n] = startNode;
        check[n] = cnt++;

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

        visited = new long[N + 1];
        check = new long[N + 1];

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
        for(int i = 0; i <= N; i++) {
            Collections.sort(graph.get(i), Collections.reverseOrder());
        }
        dfs(R, 0);

        long sum = 0;

        for(int i = 1; i <= N; i++) {
            if(R != i && visited[i] == 0) {
                visited[i] = -1;
            }
            sum += visited[i] * check[i];
        }
        System.out.println(sum);
    }
}