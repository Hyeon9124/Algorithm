package greedy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
public class _1448 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Integer[] arr = new Integer[N];

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int max = 0;
        Arrays.sort(arr, Collections.reverseOrder());

        for(int i = 0; i < N - 2; i++){
            if(arr[i] < arr[i + 1] + arr[i + 2]){
                max = Math.max(max, arr[i] + arr[i + 1] + arr[i + 2]);
            }
        }
        if(max == 0){
            max = -1;
        }
        System.out.println(max);
    }
}