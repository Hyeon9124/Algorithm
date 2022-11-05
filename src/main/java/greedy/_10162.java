package greedy;
import java.util.Scanner;
public class _10162 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();   // 5분, 1분, 10초
        int A = 0;
        int B = 0;
        int C = 0;

        A += T / 300;
        T %= 300;
        B += T / 60;
        T %= 60;
        C += T / 10;
        T %= 10;

        if(T == 0){
            System.out.println(A + " " + B + " " + C);
        }
        else{
            System.out.println("-1");
        }

        sc.close();
    }
}