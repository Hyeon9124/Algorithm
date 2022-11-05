package hash;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
public class _1351 {
    static HashMap<Long, Long> map;
    static int P, Q;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken());
        P = Integer.parseInt(st.nextToken());
        Q = Integer.parseInt(st.nextToken());

        map = new HashMap<>();

        System.out.println(result(N));
    }
    static long result(long N){
        if(N == 0){
            return 1;
        }
        if(map.containsKey(N)){
            return map.get(N);
        }
        else{
            map.put(N, result(N / P) + result(N / Q));
        }

        return map.get(N);
    }
}