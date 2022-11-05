package bfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class _11725 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static Queue<Integer> q = new LinkedList<>();

    static int N;
    static boolean[] visited;
    static int[] parentsNode;

    public static void bfs(int startNode) {
        startNode = 1;	// 트리 루트를 1이라고 문제에서 주어짐
        q.offer(startNode);
        visited[startNode] = true;

        while(!q.isEmpty()) {
            int n = q.poll();
            for(int node : graph.get(n)) {
                if(!visited[node]) {
                    visited[node] = true;
                    q.offer(node);
                    parentsNode[node] = n;	// 방문하지 않았으면 부모 노드 추가
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        visited = new boolean[N + 1];
        parentsNode = new int[N + 1];

        for(int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        for(int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        bfs(N);

        for(int i = 2; i < graph.size(); i++) {	// 배열의 사이즈만큼 부모 노드 출력
            System.out.println(parentsNode[i]);
        }
    }
}