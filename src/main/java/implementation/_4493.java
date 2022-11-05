package implementation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _4493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int count = 0;
            for(int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String S1 = st.nextToken();
                String S2 = st.nextToken();

                if(S1.equals("R") && S2.equals("P")) {
                    count++;
                }else if(S1.equals("R") && S2.equals("S")) {
                    count--;
                }else if(S1.equals("P") && S2.equals("R")) {
                    count--;
                }else if(S1.equals("P") && S2.equals("S")) {
                    count++;
                }else if(S1.equals("S") && S2.equals("R")) {
                    count++;
                }else if(S1.equals("S") && S2.equals("P")) {
                    count--;
                }
            }

            if(count < 0) {
                System.out.println("Player 1");
            }else if(count > 0) {
                System.out.println("Player 2");
            }else {
                System.out.println("TIE");
            }
        }
    }
}