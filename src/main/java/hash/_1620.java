package hash;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.StringTokenizer;
public class _1620 {
    public static void main(String[] args) throws IOException{
        Hashtable<Integer, String> ht1 = new Hashtable<Integer, String>();
        Hashtable<String, Integer> ht2 = new Hashtable<String, Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 1; i <= N; i++){
            String s = br.readLine();
            ht1.put(i, s);
            ht2.put(s, i);
        }

        for(int i = 0; i < M; i++){
            String s = br.readLine();

            if(49 <= s.charAt(0) && s.charAt(0) <= 57){
                sb.append(ht1.get(Integer.parseInt(s))).append("\n");
            }
            else{
                sb.append(ht2.get(s)).append("\n");
            }
        }
        System.out.println(sb);
    }
}