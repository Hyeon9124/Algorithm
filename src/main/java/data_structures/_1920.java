package data_structures;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
public class _1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        HashMap <Integer, Integer> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int A = Integer.parseInt(st.nextToken());
            map.put(A, 1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int j = 0 ; j < M; j++){
            int B = Integer.parseInt(st.nextToken());

            if(map.containsKey(B)){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
    }
}
// 이분탐색으로 안풀고 hash로 풀었음.