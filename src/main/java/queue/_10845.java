package queue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class _10845 {
    static Queue<Integer> q = new LinkedList<>();
    static int N, K, size = -1;
    static int[] arr = new int[10000];
    static String s;
    public static void main(String[] args)  throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
                        System.out.println(-1);
                    }
                    else{
                        System.out.println(q.poll());
                    }
                    break;

                case "size" :
                    System.out.println(q.size());
                    break;

                case "empty" :
                    if(q.isEmpty()){
                        System.out.println(1);
                    }
                    else{
                        System.out.println(0);
                    }
                    break;

                case "front" :
                    if(q.isEmpty()){
                        System.out.println(-1);
                    }
                    else{
                        System.out.println(q.peek());
                    }
                    break;

                case "back" :
                    if(q.size() == 0){
                        System.out.println(-1);
                    }
                    else{
                        System.out.println(arr[size]);
                    }
                    break;
            }
        }
    }
}