package greedy;
import java.util.Scanner;
public class _11034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            int max = Math.max((B - A - 1), (C - B - 1));

            System.out.println(max);
        }
        sc.close();
    }
}