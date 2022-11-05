package bfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class _18352 {
    static Queue<Integer> q = new LinkedList<>();
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    static int[] arr;
    static boolean check;
    static int N, M, K, X;

    public static void bfs(int startNode) {
        arr[startNode] = 0;
        q.offer(startNode);

        while(!q.isEmpty()) {
            int n = q.poll();

            for(int node : graph.get(n)) {
                if(arr[node] == - 1) {
                    arr[node] = arr[n] + 1;
                    q.offer(node);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());	// 도시 개수
        M = Integer.parseInt(st.nextToken());	// 도로 개수
        K = Integer.parseInt(st.nextToken());	// 거리 정보
        X = Integer.parseInt(st.nextToken());	// 출발 도시 번호

        arr = new int[N + 1];

        for(int i = 0; i < N + 1; i++) {
            graph.add(new ArrayList<>());
            arr[i] = -1;
        }
        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
        }
        bfs(X);

        check = false;

        for(int i = 0; i <= N; i++) {
            if(arr[i] == K) {
                System.out.println(i);
                check = true;
            }
        }
        if(!check) {
            System.out.println(-1);
        }
    }
}