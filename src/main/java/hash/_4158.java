package hash;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
public class _4158 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            if(N == 0 && M == 0){
                break;
            }
            int count = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < N; i++){
                int num1 = Integer.parseInt(br.readLine());
                map.put(num1, 1);
            }
            for(int j = 0; j < M; j++){
                int num2 = Integer.parseInt(br.readLine());
                if(map.containsKey(num2)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}