package geometry;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _3053 {
    static double sum1 = 0, sum2 = 01;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int R = Integer.parseInt(br.readLine());

        sum1 = Math.pow(R, 2) * Math.PI;
        sum2 = 2 * Math.pow(R, 2); // 기하학에서 D = |x| + |y|가 나오므로 다음과 같음

        System.out.println(String.format("%.6f", sum1));
        System.out.println(String.format("%.6f", sum2));
    }
}