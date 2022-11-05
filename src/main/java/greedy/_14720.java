package greedy;
import java.util.Scanner;
public class _14720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] N = new int[T];
        int count = 0;
        int next = 0;

        for(int i = 0; i < N.length; i++){
            N[i] = sc.nextInt();
        }
        for(int i = 0; i < N.length; i++){
            if(N[i] == next && next == 0){
                count ++;
                next = 1;
                continue;
            }
            else if(N[i] == next && next == 1){
                count ++;
                next = 2;
                continue;
            }
            else if(N[i] == next && next == 2){
                count++;
                next = 0;
                continue;
            }
        }
        sc.close();

        System.out.println(count);
    }
}