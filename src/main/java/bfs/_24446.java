package bfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class _24446 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static Queue<Integer> q = new LinkedList<>();

    static int N, M, R, cnt = 0;
    static boolean[] visited;
    static int[] check;

    public static void bfs(int startNode) {
        visited = new boolean[N + 1];
        check = new int[N + 1];

        q.offer(startNode);
        visited[startNode] = true;

        for(int i = 1; i <= N; i++) {
            check[i] = -1;
        }
        while(!q.isEmpty()) {
            int size = q.size();

            while(size --> 0) {
                int n = q.poll();
                check[n] = cnt;

                for(int node : graph.get(n)) {
                    if(!visited[node]) {
                        visited[node] = true;
                        q.offer(node);
                    }
                }
            }
            cnt++;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());

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
        bfs(R);

        for(int i = 1; i <= N; i++) {
            System.out.println(check[i]);
        }
    }
}