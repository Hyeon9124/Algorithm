package geometry;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _2477 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int num = Integer.parseInt(br.readLine());

        int[] compass = new int[6];
        int[] length = new int[6];
        int[] max = new int[6];
        int[] mini = new int[6];
        int MAX = Integer.MIN_VALUE, sum = 0;

        for(int i = 0; i < 6; i++) {
            st = new StringTokenizer(br.readLine());

            compass[i] = Integer.parseInt(st.nextToken());
            length[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < 5; i++){
            if(i == 0){
                max[0] = length[0] * length[1];
                mini[0] = length[0] * length[1];
            }
            else {
                max[i] = length[i] * length[i + 1];
                mini[i] = length[i] * length[i + 1];
            }
        }
        max[5] = length[0] * length[5];
        mini[5] = length[0] * length[5];

        for(int i = 0; i < 6; i++){
            if(max[i] > MAX){
                MAX = max[i];
            }
        }
        for(int i = 0; i < 6; i++){
            sum += mini[i];
        }

        System.out.println(num * (MAX - (3 * MAX - sum)));
    }
}