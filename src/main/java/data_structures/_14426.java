package data_structures;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _14426 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count = 0;

        String[] s = new String[N];
        for(int i = 0; i < N; i++){
            s[i] = br.readLine();
        }
        for(int i = 0; i < M; i++){
            String str = br.readLine();
            for(int j = 0; j < N; j++){
                if(str.equals(s[j].substring(0, str.length()))){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}