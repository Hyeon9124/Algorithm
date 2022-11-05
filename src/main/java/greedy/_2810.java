package greedy;
import java.util.Scanner;
public class _2810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 1;
        String s = sc.next();

        for(int i = 0; i < N; i++){
            char c = s.charAt(i);

            if(c == 'S'){
                count++;
            }
            else if(c == 'L'){
                i++;
                count++;
            }
        }
        sc.close();

        if(count > N){
            System.out.println(N);
        }
        else
            System.out.println(count);
    }
}