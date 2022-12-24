package dfs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class _21937 {
    static int cnt = 0;
    static ArrayList<ArrayList<Integer>> list;
    static boolean[] visited;
    public static void dfs(int end){
        visited[end] = true;

        for(int i = 0; i < list.get(end).size(); i++){
            int tmp = list.get(end).get(i);

            if(!visited[tmp]){
                cnt++;
                dfs(tmp);
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 노드의 개수
        int M = Integer.parseInt(st.nextToken()); // 간선의 개수

        list = new ArrayList<>();
        visited = new boolean[N + 1];

        for(int i = 0; i <= N; i++){
            list.add(new ArrayList<>());
        }
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list.get(b).add(a);
        }
        int end = Integer.parseInt(br.readLine());

        dfs(end);
        System.out.println(cnt);
    }
}