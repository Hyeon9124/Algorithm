package dfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;
public class _9372 {
    static ArrayList<ArrayList<Integer>> graph;
    static Stack<Integer> stack = new Stack<>();

    static boolean[] visited;

    public static int dfs() {
        int cnt = 0;
        stack.push(1);
        visited[1] = true;

        while(!stack.isEmpty()) {
            int node = stack.pop();

            for(int n : graph.get(node)) {
                if(!visited[n]) {
                    stack.push(n);
                    visited[n] = true;
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            graph = new ArrayList<>();
            visited = new boolean[N + 1];

            for(int j = 0; j < N + 1; j++) {
                graph.add(new ArrayList<>());
            }
            for(int k = 0; k < M; k++) {
                st = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                graph.get(a).add(b);
                graph.get(b).add(a);
            }
            System.out.println(dfs());
        }
    }
}