package hash;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
public class _9375 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testcase; i++){
            int T = Integer.parseInt(br.readLine());

            HashMap<String, Integer> map = new HashMap<>();
            for(int j = 0; j < T; j++){
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String s = st.nextToken();
                map.put(s , map.getOrDefault(s, 0) + 1);
            }
            int result = 1;
            for(int count : map.values()){
                result *= count + 1;
            }
            System.out.println(result - 1);
        }
    }
}