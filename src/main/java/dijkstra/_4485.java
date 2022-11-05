//package dijkstra;
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.PriorityQueue;
//import java.util.StringTokenizer;
//public class _4485 {
//    static int N;
//    static int[][] dist;
//    static int[][] arr;
//    static boolean[][] vistied;
//    static int[] dx = {1, 0 , 0, -1};
//    static int[] dy = {0, 1, -1, 0};
//
//    public static int dijkstra(int start, int end){
//        PriorityQueue<int []> q = new PriorityQueue<>();
//        q.offer(new int[]{start, end});
//        arr[start][end] = 0;
//
//        while (!q.isEmpty()){
//            int[] pq = q.poll();
//
//            for(int i = 0; i < 4; i++){
//                int cx = pq[0] + dx[i];
//                int cy = pq[1] + dy[i];
//
//
//            }
//        }
//    }
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st;
//
//        while(true){
//            N = Integer.parseInt(br.readLine());
//
//            if(N == 0){
//                break;
//            }
//            dist = new int[N + 1][N + 1];
//            arr = new int[N + 1][N + 1];
//            vistied = new boolean[N + 1][N + 1];
//
//            for(int i = 0; i < N; i++){
//                st = new StringTokenizer(br.readLine());
//                for(int j = 0; j < N; j++){
//                    dist[i][j] = Integer.parseInt(st.nextToken());
//                }
//            }
//            int cnt = 1;
//
//            sb.append("Problem " + cnt + ": " + dijkstra(N - 1, N - 1));
//            cnt++;
//        }
//
//    }
//}