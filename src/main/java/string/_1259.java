package string;
import java.util.Scanner;
public class _1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            String s = sc.next();

            String str = "";
            for(int i = s.length() - 1; i >= 0; i--){
                str += s.charAt(i);
            }
            if(str.equals("0")){
                sc.close();
                break;
            }
            if(s.equals(str) == true){
                System.out.println("yes");
            }
            else if(s.equals(str) == false){
                System.out.println("no");
            }
        }
    }
}