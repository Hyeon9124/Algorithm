package hash;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
public class _10816 {
    public static void main(String[] args) throws IOException{
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(hm.get(arr[i]) == null){
                hm.put(arr[i], 1);
            }
            else{
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        int[] ans = new int[M];
        StringTokenizer str = new StringTokenizer(br.readLine());
        for(int j = 0; j < M; j++){
            ans[j] = Integer.parseInt(str.nextToken());

            if(hm.get(ans[j]) == null){
                sb.append(0).append(" ");
            }
            else{
                sb.append(hm.get(ans[j])).append(" ");
            }
        }
        System.out.println(sb);
    }
}