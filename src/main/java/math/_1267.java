package math;
import java.util.Scanner;
public class _1267 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int ysum = 0;
        int msum = 0;

        for(int i = 0; i < N; i++){
            int time = sc.nextInt();
            int y, m;

            y = time / 30 + 1;
            ysum += y * 10;

            m = time / 60 + 1;
            msum += m * 15;
        }
        if(ysum == msum){
            System.out.println("Y M " + ysum);
        }
        else if(ysum > msum){
            System.out.println("M " + msum);
        }
        else{
            System.out.println("Y " + ysum);
        }
        sc.close();
    }
}