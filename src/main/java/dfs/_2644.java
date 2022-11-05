package dfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class _2644 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    static boolean[] visited;
    static int N, M, x, y, cnt = -1;

    public static void dfs(int startNode, int find, int n) {
        visited[startNode] = true;

        for(int node : graph.get(startNode)) {
            if(!visited[node]) {
                if(node == find) {
                    cnt = n + 1;
                    return;
                }
                dfs(node, find, n + 1);
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        x = Integer.parseInt(st.nextToken());
        y = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(br.readLine());

        visited = new boolean[N + 1];

        for(int i = 0; i < N + 1; i++) {
            graph.add(new ArrayList<>());
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        dfs(x, y, 0);

        System.out.println(cnt);
    }
}