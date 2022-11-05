package dijkstra;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
class Node4 implements Comparable<Node4>{
    int end;
    int weight;

    public Node4(int end, int weight) {
        this.end = end;
        this.weight = weight;
    }
    @Override
    public int compareTo(Node4 o) {
        return this.weight - o.weight;
    }
}
public class _10282 {
    static int n, d, c;
    static int a, b, s;
    static int[] dist;
    static boolean[] visited;
    static final int INF = 987654321;
    static ArrayList<Node4>[] list;

    public static void dijkstra(int start){
        PriorityQueue<Node4> q = new PriorityQueue<>();
        q.offer(new Node4(start, 0));
        dist[start] = 0;

        while(!q.isEmpty()){
            Node4 currNode = q.poll();
            int curr = currNode.end;

            if(!visited[curr]) {
                visited[curr] = true;

                for (Node4 node : list[curr]) {
                    if (dist[node.end] > dist[curr] + node.weight) {
                        dist[node.end] = dist[curr] + node.weight;
                        q.offer(new Node4(node.end, dist[node.end]));
                    }
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++){
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            d = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            dist = new int[n + 1];
            list = new ArrayList[n + 1];
            visited = new boolean[n + 1];
            Arrays.fill(dist, INF);

            for(int i = 1; i < n + 1; i++){
                list[i] = new ArrayList<>();
            }
            for(int i = 0; i < d; i++) {
                st = new StringTokenizer(br.readLine());
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
                s = Integer.parseInt(st.nextToken());

                list[b].add(new Node4(a, s));
            }
            dijkstra(c);

            int cnt = 0;
            int result = 0;

            for(int i = 1; i < n + 1; i++){
                if(dist[i] != INF){
                    cnt++;
                    result = Math.max(result, dist[i]);
                }
            }
            sb.append(cnt + " " + result + "\n");
        }
        System.out.println(sb);
    }
}