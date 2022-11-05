package bfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class _24447 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static Queue<Integer> q = new LinkedList<>();

    static int N, M, R, cnt = 0, count = 0;
    static boolean[] visited;
    static long[] d;
    static long[] t;

    public static void bfs(int startNode) {
        q.offer(startNode);

        visited = new boolean[N + 1];
        visited[startNode] = true;

        for(int i = 1; i <= N; i++) {
            d[i] = -1;
        }
        while(!q.isEmpty()) {
            int size = q.size();
            while(size --> 0) {
                int n = q.poll();
                count++;
                t[n] = count;
                d[n] = cnt;

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

        d = new long[N + 1];
        t = new long[N + 1];

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
        for(int i = 1; i <= N; i++) {
            Collections.sort(graph.get(i));
        }
        bfs(R);

        long sum = 0;
        for(int i = 1; i <= N; i++) {
            sum += (t[i] * d[i]);
        }
        System.out.println(sum);
    }
}