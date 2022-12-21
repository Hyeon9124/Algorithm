package dijkstra;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
class farmstead implements Comparable<farmstead>{
    int end;
    int weight;

    public farmstead(int end, int weight) {
        this.end = end;
        this.weight = weight;
    }

    @Override
    public int compareTo(farmstead o) {
        return this.weight - o.weight;
    }
}
public class _5972 {
    static ArrayList<ArrayList<farmstead>> list;
    static int[] dist;
    static boolean[] visited;
    static final int INF = 987654321;
    public static int dijkstra(int start, int end){
        PriorityQueue<farmstead> q = new PriorityQueue<>();
        q.offer(new farmstead(start, 0));
        dist[start] = 0;

        while(!q.isEmpty()){
            farmstead curNode = q.poll();
            int curr = curNode.end;

            if(!visited[curr]) {
                visited[curr] = true;

                for (farmstead node : list.get(curr)) {
                    if (!visited[node.end] && dist[node.end] > dist[curr] + node.weight) {
                        dist[node.end] = dist[curr] + node.weight;
                        q.add(new farmstead(node.end, dist[node.end]));
                    }
                }
            }
        }
        return dist[end];
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        list = new ArrayList<>();
        dist = new int[N + 1];
        visited = new boolean[N + 1];

        Arrays.fill(dist, INF);

        for(int i = 0; i <= N; i++){
            list.add(new ArrayList<>());
        }
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            list.get(start).add(new farmstead(end, weight));
            list.get(end).add(new farmstead(start, weight));
        }
        System.out.println(dijkstra(1, N));
    }
}