package math;
import java.util.Scanner;
public class _2884{
    public static void main(String[] args) {
        int H, M, Min;
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        M = sc.nextInt();
        Min = 60 + M - 45;

        if((M - 45) < 0) {
            if(H < 0)
                H += 24;
            else if(H > 0)
                H -= 1;
            else if(H == 0)
                H = 23;
            else if(H == 24)
                H = 0;
        }
        else if(Min == 60)
            Min = 0;
        else if(Min > 60)
            Min = M - 45;

        sc.close();
        System.out.println(H + " " + Min);
    }
}
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");

		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		if(M - 45 < 0) {
			H--;
			M = 60 + M - 45;
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		}
		else
		System.out.println(H + " " + (M - 45));
	}
}
*/