package hash;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
public class _17219 {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            String address = st.nextToken();
            String pass = st.nextToken();
            map.put(address, pass);
        }

        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < M; j++){
            String address = br.readLine();
            sb.append(map.get(address) + "\n");
        }
        System.out.println(sb);
    }
}