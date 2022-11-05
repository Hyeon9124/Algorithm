package recursion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _11729 {
    static StringBuilder sb = new StringBuilder();
    public static void hanoi(int N, int one, int two, int three) {
        if(N == 1){
            sb.append(one + " " + three).append("\n");
            return;
        }
        hanoi(N - 1, one, three, two);
        sb.append(one + " " + three).append("\n");

        hanoi(N - 1, two, one, three);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        sb.append((int)(Math.pow(2, N) - 1)).append("\n");
        hanoi(N, 1, 2, 3);

        System.out.println(sb);
    }
}