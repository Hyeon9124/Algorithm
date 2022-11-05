package math;
import java.util.Scanner;
public class _1284 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            String N = sc.nextLine();
            int length = 1;
            //N이 0이면 반복분을 끝낸다.
            if(N.equals("0")) {
                break;
            }
            for(int i = 0; i < N.length(); i++) {
                if(N.charAt(i) == '1') {
                    length += 3;
                }else if(N.charAt(i) == '0') {
                    length += 5;
                }else {
                    length += 4;
                }
            }
            System.out.println(length);
        }
        sc.close();
    }
}