package greedy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class _10775 {
    public static int[] removeDuplicates(int[] arr){
        Arrays.sort(arr);
        int k = 0;
        for(int i = 0; i <arr.length; i++){
            if(i == 0 || arr[i] != arr[i - 1]){
                arr[k++] = arr[i];
            }
        }
        return Arrays.copyOf(arr, k);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int G = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());
        int arr[] = new int[P];

        for(int i = 0; i < P; i++){
            if(arr[i] <= G){
                arr[i] = Integer.parseInt(br.readLine());
            }
            else{
                break;
            }
        }
        int[] result = removeDuplicates(arr);
        System.out.println(result.length);

    }
}