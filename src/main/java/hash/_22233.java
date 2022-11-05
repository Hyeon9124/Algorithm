package hash;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
public class _22233 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count = N;

        HashMap<String, Boolean> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            String memo = br.readLine();
            map.put(memo, true);
        }
        for(int j = 0; j < M; j++){
            st = new StringTokenizer(br.readLine(), ",");
            while(st.hasMoreTokens()){
                // st에 남은 토큰이 있으면 true 없으면 false를 반환, 확인만 함 헤드 이동 x
                String blog = st.nextToken();
                if(map.containsKey(blog)){
                    map.remove(blog);
                    count--;
                }
            }
            System.out.println(count);
        }
    }
}