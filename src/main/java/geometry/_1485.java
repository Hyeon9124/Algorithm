package geometry;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class _1485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        int[][] arr = new int[4][2];
        double[] length = new double[4];

        for(int i = 0; i < T; i++) {
            for (int j = 0; j < 4; j++) {
                st = new StringTokenizer(br.readLine());
                arr[j][0] = Integer.parseInt(st.nextToken());
                arr[j][1] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr, (e1, e2) ->{ // 좌표 정렬
                if(e1[0] == e2[0]){
                    return e1[1] - e2[1];
                }
                else{
                    return e1[0] - e2[0];
                }
            });

            length[0] = Math.sqrt(Math.pow(arr[0][0] - arr[1][0], 2) + Math.pow(arr[0][1] - arr[1][1], 2));
            length[1] = Math.sqrt(Math.pow(arr[0][0] - arr[2][0], 2) + Math.pow(arr[0][1] - arr[2][1], 2));
            length[2] = Math.sqrt(Math.pow(arr[3][0] - arr[1][0], 2) + Math.pow(arr[3][1] - arr[1][1], 2));
            length[3] = Math.sqrt(Math.pow(arr[3][0] - arr[2][0], 2) + Math.pow(arr[3][1] - arr[2][1], 2));

            if(length[0] == length[1] && length[0] == length[2] && length[0] == length[3] &&
                    length[1] == length[2] && length[1] == length[3] && length[2] == length[3]){
                if((Math.sqrt(Math.pow(arr[0][0] - arr[3][0], 2) + Math.pow(arr[0][1] - arr[3][1], 2))) ==
                        (Math.sqrt(Math.pow(arr[1][0] - arr[2][0], 2) + Math.pow(arr[1][1] - arr[2][1], 2)))){
                    sb.append(1 + "\n");
                }
                else{
                    sb.append(0 + "\n");
                }
            }
            else{
                sb.append(0 + "\n");
            }
        }
        System.out.println(sb);
    }
}