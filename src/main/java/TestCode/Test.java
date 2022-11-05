package TestCode;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "of the people, by the people, for the people";
        StringTokenizer st = new StringTokenizer(s, " ,");

        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}