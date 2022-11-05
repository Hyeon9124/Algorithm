package math;
import java.util.Scanner;
public class _1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        float[] Num = new float[N];
        float Max = 0;
        float avg = 0;

        for(int i = 0; i < Num.length; i++) {
            Num[i] = sc.nextInt();
            if(Num[i] > Max) {
                Max = Num[i];
            }
        }

        for(int i = 0; i < Num.length; i++) {
            avg += (Num[i] / Max * 100) / N;
        }
        sc.close();
        System.out.println(avg);
    }
}