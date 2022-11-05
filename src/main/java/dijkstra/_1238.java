package dijkstra;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class Node1 implements Comparable<Node1>{
    int end;
    int weight;

    public Node1(int end, int weight) {
        this.end = end;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node1 o) {
        return this.weight - o.weight;
    }
}
public class _1238 {
    /*
       시작지점에서 도착지점에 가는 최단 경로와 도착지점에서 시작지점으로 돌아가는 최단 경로를 더하여
       각 노드들의 이동거리의 최대값을 구하는 문제임.
    */
    static int N, X;
    static int[] arr;
    static boolean[] visited;
    static ArrayList<ArrayList<Node1>> list = new ArrayList<>();
    static ArrayList<ArrayList<Node1>> backlist = new ArrayList<>();
    static final int INF = 987654321;

    public static int[] dijkstra(List<ArrayList<Node1>> list){
        PriorityQueue<Node1> q = new PriorityQueue<>();
        // 시작지점과 도착지점을 가기 위해 2개의 list를 사용하기 때문에 배열, 방문체크를 이 메소드에서 초기화 해야함.
        arr = new int[N + 1];
        visited = new boolean[N + 1];
        Arrays.fill(arr, INF);

        q.offer(new Node1(X, 0));
        arr[X] = 0;

        while (!q.isEmpty()){
            Node1 currNode = q.poll();
            int curr = currNode.end;

            if(visited[curr]) {
                continue;
            }
            for(Node1 node : list.get(curr)){
                if(!visited[node.end] && arr[node.end] > arr[curr] + node.weight){
                    arr[node.end] = arr[curr] + node.weight;
                    q.offer(new Node1(node.end, arr[node.end]));
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        for(int i = 0; i <= N; i++){
            list.add(new ArrayList<>());
            backlist.add(new ArrayList<>());
        }
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());

            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            list.get(start).add(new Node1(end, weight));
            backlist.get(end).add(new Node1(start, weight));
        }
        int max = Integer.MIN_VALUE;

        int[] go = dijkstra(list);
        int[] back = dijkstra(backlist);

        for(int i = 1; i <= N; i++){
            max = Math.max(max, go[i] + back[i]);
        }
        System.out.println(max);
    }
}