package greedy;
import java.util.Scanner;
public class _1439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] arr = s.toCharArray();

        int zero = 0;
        int one = 0;

        if(arr[0] == '0'){
            zero++;
        }
        else {
            one++;
        }

        for(int i = 1; i < arr.length; i++){
            if(arr[i - 1] != arr[i]){
                if(arr[i] == '0'){
                    zero++;
                }
                else if(arr[i] == '1'){
                    one++;
                }
            }
        }
        sc.close();

        System.out.println(Math.min(zero, one));
    }
}