package bfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class _24444 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static Queue<Integer> q = new LinkedList<>();

    static int N, M, R, cnt = 1;
    static int[] visited;

    public static void bfs(int startNode) {
        q.offer(startNode);

        while(!q.isEmpty()) {
            int node = q.poll();

            if(visited[node] == 0) {
                visited[node] = cnt++;
                q.addAll(graph.get(node));
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
        for(int i = 0; i <= N; i++) {
            Collections.sort(graph.get(i));
        }
        bfs(R);

        for(int i = 1; i <= N; i++) {
            System.out.println(visited[i]);
        }
    }
}