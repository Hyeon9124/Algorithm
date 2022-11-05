package hash;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
public class _2002 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            String car = br.readLine();
            map.put(car, i);
        }
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            String num = br.readLine();
            arr[i] = map.get(num);
        }
        for(int i = 0; i < N - 1; i++){
            for(int j = i + 1; j < N; j++){
                if(arr[i] > arr[j]){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}