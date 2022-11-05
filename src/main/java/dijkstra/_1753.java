package dijkstra;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
class Node2 implements Comparable<Node2>{
    int end;
    int weight;

    public Node2(int end, int weight) {
        this.end = end;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node2 o) {
        return this.weight - o.weight;
    }
}
public class _1753 {
    static int V, K;
    static int[] arr;
    static boolean[] visited;
    static final int INF = 987654321;
    static ArrayList<ArrayList<Node2>> list = new ArrayList<>();

    public static void dijkstra(int start){
        PriorityQueue<Node2> q = new PriorityQueue<>();
        q.offer(new Node2(start, 0));
        arr[start] = 0;

        while (!q.isEmpty()){
            Node2 currNode = q.poll();
            int curr = currNode.end;

            if(visited[curr]){
                continue;
            }
            for(Node2 node : list.get(curr)){
                if(!visited[node.end] && arr[node.end] > arr[curr] + node.weight){
                    arr[node.end] = arr[curr] + node.weight;
                    q.offer(new Node2(node.end, arr[node.end]));
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(br.readLine());

        arr = new int[V + 1];
        visited = new boolean[V + 1];

        for(int i = 0; i <= V; i++){
            list.add(new ArrayList<>());
        }
        Arrays.fill(arr, INF);

        for(int i = 0; i < E; i++){
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            list.get(start).add(new Node2(end, weight));
        }
        dijkstra(K);

        for(int i = 1; i <= V; i++) {
            if(arr[i] == INF){
                sb.append("INF" + "\n");
                continue;
            }
            sb.append(arr[i] + "\n");
        }
        System.out.println(sb);
    }
}