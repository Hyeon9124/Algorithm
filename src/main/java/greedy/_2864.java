package greedy;
import java.util.Scanner;
public class _2864 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        sc.close();

        StringBuilder minA = new StringBuilder();
        StringBuilder maxA = new StringBuilder();
        StringBuilder minB = new StringBuilder();
        StringBuilder maxB = new StringBuilder();

        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == '5'){
                maxA.append("6");
            }
            else{
                maxA.append(a.charAt(i));
            }
            if(a.charAt(i) == '6'){
                minA.append("5");
            }
            else{
                minA.append(a.charAt(i));
            }
        }
        for(int i = 0; i < b.length(); i++){
            if(b.charAt(i) == '5'){
                maxB.append("6");
            }
            else{
                maxB.append(b.charAt(i));
            }
            if(b.charAt(i) == '6'){
                minB.append("5");
            }
            else{
                minB.append(b.charAt(i));
            }
        }
        int min = Integer.parseInt(minA.toString()) + Integer.parseInt(minB.toString());
        int max = Integer.parseInt(maxA.toString()) + Integer.parseInt(maxB.toString());

        System.out.println(min + " " + max);
    }
}