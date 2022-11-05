package string;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _10808 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        int[] arr = new int[26];

        for(int i = 0; i < word.length(); i++){
            arr[word.charAt(i) - 97]++;
        }
        for(int i = 0; i < 26; i++){
            System.out.print(arr[i] + " ");
        }
    }
}