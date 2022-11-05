package hash;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.StringTokenizer;
public class _14425 {
    public static void main(String[] args) throws IOException{
        Hashtable <String, Integer> ht = new Hashtable<String, Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] str = new String[N];
        for(int i = 0; i < N; i++){
            str[i] = br.readLine();
            ht.put(str[i], 1);
        }
        String[] s = new String[M];
        int count = 0;

        for(int j = 0; j < M; j++){
            s[j] = br.readLine();

            if(ht.get(s[j]) != null){
                count++;
            }
        }
        System.out.println(count);
    }
}