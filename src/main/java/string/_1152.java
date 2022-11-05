package string;
import java.util.Scanner;
import java.util.StringTokenizer;
public class _1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        sc.close();

        StringTokenizer st = new StringTokenizer(s, " ");

        System.out.println(st.countTokens());
    }
}