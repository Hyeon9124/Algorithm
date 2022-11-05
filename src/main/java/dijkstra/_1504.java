package dijkstra;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
class Node3 implements Comparable<Node3>{
    int end;
    int weight;

    public Node3(int end, int weight) {
        this.end = end;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node3 o) {
        return this.weight - o.weight;
    }
}
public class _1504 {
    static int N, E;
    static int[] dist;
    static boolean[] visited;
    static final int INF = 10000000;
    static ArrayList<ArrayList<Node3>> list = new ArrayList<>();

    public static int dijkstra(int start, int end){
        Arrays.fill(dist, INF);
        Arrays.fill(visited, false);
        boolean[] visited = new boolean[N + 1];

        PriorityQueue<Node3> q = new PriorityQueue<>();
        q.offer(new Node3(start, 0));
        dist[start] = 0;

        while (!q.isEmpty()){
            Node3 currNode = q.poll();
            int curr = currNode.end;

            if(!visited[curr]) {
                visited[curr] = true;

                for (Node3 node : list.get(curr)) {
                    if (!visited[node.end] && dist[node.end] > dist[curr] + node.weight) {
                        dist[node.end] = dist[curr] + node.weight;
                        q.offer(new Node3(node.end, dist[node.end]));
                    }
                }
            }
        }
        return dist[end];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        dist = new int[N + 1];
        visited = new boolean[N + 1];

        for(int i = 0; i <= N; i++){
            list.add(new ArrayList<>());
        }
        Arrays.fill(dist, INF);

        for(int i = 0; i < E; i++){
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            list.get(start).add(new Node3(end, weight));
            list.get(end).add(new Node3(start, weight));
        }
        st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int result1 = 0;
        result1 += dijkstra(1, a);
        result1 += dijkstra(a, b);
        result1 += dijkstra(b, N);

        int result2 = 0;
        result2 += dijkstra(1, b);
        result2 += dijkstra(b, a);
        result2 += dijkstra(a, N);

        System.out.println(result1 >= INF && result2 >= INF ? -1 : Math.min(result1, result2));
    }
}