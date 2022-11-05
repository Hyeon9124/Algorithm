package hash;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;
public class _1764 {
    public static void main(String[] args) throws IOException{
        HashSet<String> hash = new HashSet<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i = 0; i < N; i++){
            hash.add(br.readLine());
        }
        ArrayList<String> result = new ArrayList<>();

        for(int i = 0; i < M; i++){
            String str = br.readLine();
            if(hash.contains(str)){ // hash.contains Set안에 객체가 존재하는지 체크
                result.add(str);
            }
        }
        Collections.sort(result);

        System.out.println(result.size());
        for(String s : result){
            System.out.println(s);
        }
    }
}