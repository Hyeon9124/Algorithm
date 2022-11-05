package hash;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;
public class _1269 {
    public static void main(String[] args) throws IOException{
        HashSet<Integer> hash = new HashSet<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        StringTokenizer str = new StringTokenizer(br.readLine());
        for(int i = 0; i < A; i++){
            hash.add(Integer.parseInt(str.nextToken()));
        }

        ArrayList<Integer> result = new ArrayList<>();
        StringTokenizer tr = new StringTokenizer(br.readLine());
        for(int i = 0; i < B; i++){
            int ch = Integer.parseInt(tr.nextToken());
            if(hash.contains(ch)){ // hash.contains Set안에 객체가 존재하는지 체크
                result.add(ch);
            }
        }
        System.out.println(A + B - result.size() * 2);
    }
}