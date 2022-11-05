package dijkstra;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
class Node implements Comparable<Node>{ // 도착지점과, 도착지점으로 가는 비용을 의미하는 클래스를 정의한다.
    int end;
    int weight;

    public Node(int end, int weight) {
        this.end = end;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node o) {
        return this.weight - o.weight;
    }
}
public class _1916 {
    static ArrayList<ArrayList<Node>> list; // 인접 리스트
    static int[] arr; // 시작점에서 각 정점으로 가는 최단거리
    static boolean[] visited; // 방문 check
    static final int INF = 987654321;
    public static int dijkstra(int start, int end){ // 다익스트라 알고리즘
        PriorityQueue<Node> q = new PriorityQueue<>();
        q.offer(new Node(start, 0));
        arr[start] = 0;

        while(!q.isEmpty()){
            Node curNode = q.poll();
            int curr = curNode.end;

            if(!visited[curr]) {
                visited[curr] = true;

                for (Node node : list.get(curr)) {
                    if (!visited[node.end] && arr[node.end] > arr[curr] + node.weight) {
                        arr[node.end] = arr[curr] + node.weight;
                        q.add(new Node(node.end, arr[node.end]));
                    }
                }
            }
        }
        return arr[end];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        list = new ArrayList<>();
        arr = new int[N + 1];
        visited = new boolean[N + 1];

        Arrays.fill(arr, INF);

        for(int  i = 0; i <= N; i++){
            list.add(new ArrayList<>());
        }
        for(int i = 0; i < M; i++){ // 단방향 인접 리스트 구현
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            list.get(start).add(new Node(end, weight)); // start에서 end로 가는 weight(가중치)
        }
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(dijkstra(a, b));
    }
}