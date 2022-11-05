package queue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class _18258 {
    static Queue<Integer> q = new LinkedList<>();
    static int N, K, size = -1;
    static int[] arr = new int[2000000];
    static String s;
    public static void main(String[] args)  throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        while(N --> 0){
            st = new StringTokenizer(br.readLine());
            s = st.nextToken();

            switch(s){
                case "push" :
                    size++;
                    K = Integer.parseInt(st.nextToken());
                    arr[size] = K;
                    q.offer(K);
                    break;

                case "pop" :
                    if(q.isEmpty()){
                        sb.append(-1 + "\n");
                    }
                    else{
                        sb.append(q.poll() + "\n");
                    }
                    break;

                case "size" :
                    sb.append(q.size() + "\n");
                    break;

                case "empty" :
                    if(q.isEmpty()){
                        sb.append(1 + "\n");
                    }
                    else{
                        sb.append(0 + "\n");
                    }
                    break;

                case "front" :
                    if(q.isEmpty()){
                        sb.append(-1 + "\n");
                    }
                    else{
                        sb.append(q.peek() + "\n");
                    }
                    break;

                case "back" :
                    if(q.size() == 0){
                        sb.append(-1 + "\n");
                    }
                    else{
                        sb.append(arr[size] + "\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}