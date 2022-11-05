package hash;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.StringTokenizer;
public class _10815 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            ht.put(arr[i], 1);
        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer str = new StringTokenizer(br.readLine());
        for(int j = 0; j < M; j++){
            int a = Integer.parseInt(str.nextToken());

            if(ht.get(a) != null){
                System.out.print("1 ");
            }
            else{
                System.out.print("0 ");
            }
        }
    }
}

// 해시 테이블은 저장된 값을 키를 통해 빠르게 사용할 수 있도록 한 자료구조
// {
//     6:1,
//     3:1,
//     2:1,
//     10:1,
//     -10:1
// }
// 넣기 = ht.put(키,값)
// 조회 = ht.get(키) -> 존재할 경우 값 반환, 존재하지 않을경우 null 반환
// 조회할 때 키는 있는지 없는지 확인하고 싶은 값을 의미한다.
// 넣을 때 키는 유일하게 식별하고 싶은 값을 의미한다.