package dijkstra;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Node5 implements Comparable<Node5>{
    int end;
    int weight;

    public Node5(int end, int weight) {
        this.end = end;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node5 o) {
        return this.weight - o.weight;
    }
}
public class _11779 {
    static int[] arr;
    static int[] path;
    static boolean[] visited;
    static final int INF = 987654321;
    static ArrayList<ArrayList<Node5>> list = new ArrayList<>();
    public static void dijkstra(int start){
        PriorityQueue<Node5> q = new PriorityQueue<>();
        q.offer(new Node5(start, 0));
        arr[start] = 0;
        path[start] = 0;

        while (!q.isEmpty()){
            Node5 currNode = q.poll();
            int curr = currNode.end;

            if(!visited[currNode.end]){
                visited[currNode.end] = true;
            }
            else{
                continue;
            }
            for(Node5 node : list.get(curr)){
                if( arr[node.end] > arr[curr] + node.weight){
                    arr[node.end] = arr[curr] + node.weight;
                    path[node.end] = curr;
                    q.offer(new Node5(node.end, arr[node.end]));
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        arr = new int[N + 1];
        path = new int[N + 1];
        visited = new boolean[N + 1];

        for(int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }
        Arrays.fill(arr, INF);

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            list.get(start).add(new Node5(end, weight));
        }
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        dijkstra(a);
        sb.append(arr[b] + "\n");

        ArrayList<Integer> al = new ArrayList<>();
        int tmp = b;

        while(tmp != 0){
            al.add(tmp);
            tmp = path[tmp];
        }
        sb.append(al.size() + "\n");
        for(int i = al.size() - 1; i >= 0; i--){
            sb.append(al.get(i) + " ");
        }
        System.out.println(sb);
    }
}