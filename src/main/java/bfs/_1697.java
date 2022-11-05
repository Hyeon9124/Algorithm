package bfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class _1697 {
    static Queue<Integer> q = new LinkedList<Integer>();

    static int[] graph;
    static boolean[] visited;
    static int N, K;

    public static void bfs(int startNode) { // startNode = N
        q.offer(startNode);
        graph[startNode] = 1;
        visited[startNode] = true;

        while(!q.isEmpty()) {
            int node = q.poll();

            for(int i = 0; i < 3; i++) {
                int find = 0;

                if(i == 0) {
                    find = node + 1;
                }
                else if(i == 1) {
                    find = node - 1;
                }
                else {
                    find = 2 * node;
                }

                if(find >= 0 && find < 100001 && !visited[find]) {
                    q.offer(find);
                    visited[find] = true;
                    graph[find] = graph[node] + 1;
                }
                if(find == K) {
                    System.out.println(graph[node]);
                    return;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        graph = new int[100001];
        visited = new boolean[100001];

        if(N == K) {
            System.out.println(0);
        }
        else {
            bfs(N);
        }
    }
}