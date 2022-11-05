package hash;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
public class _2822 {
    public static void main(String[] args) throws IOException {
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer[] arr = new Integer[8];
        int sum = 0;

        for(int i = 0; i < 8; i++){
            arr[i] = Integer.parseInt(br.readLine());
            ht.put(arr[i], i + 1);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        Integer[] ans = new Integer[5];

        for(int i = 0; i < 5; i++){
            sum += arr[i];
            ans[i] = ht.get(arr[i]);
        }
        System.out.println(sum);
        Arrays.sort(ans);
        for(int i = 0; i < 5; i++){
            System.out.print(ans[i] + " ");
        }
    }
}