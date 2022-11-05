package hash;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;
public class _1822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet <Integer> set = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int A = Integer.parseInt(st.nextToken());
            set.add(A);
        }

        st = new StringTokenizer(br.readLine());
        for(int j = 0 ; j < M; j++){
            int B = Integer.parseInt(st.nextToken());
            if(set.contains(B)){
                set.remove(B);
            }
        }
        System.out.println(set.size());

        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        for(Integer result : list){
            System.out.print(result + " ");
        }
    }
}