package binary_search_tree;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class _1991 {
    static class Tree{
        char value;
        Tree left;
        Tree right;

        public Tree(char value, Tree left, Tree right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
    static Tree head = new Tree('A', null, null);
    public static void insertTree(Tree t, char root, char left, char right){
        if(t.value == root){
            t.left = left == '.' ? null : new Tree(left, null, null);
            t.right = right == '.' ? null : new Tree(right, null, null);
        }
        else{
            if(t.left != null){
                insertTree(t.left, root, left, right);
            }
            if(t.right != null){
                insertTree(t.right, root, left, right);
            }
        }
    }
    public static void preOrder(Tree t){
        if(t == null) return;

        System.out.print(t.value);
        preOrder(t.left);
        preOrder(t.right);
    }
    public static void inOrder(Tree t){
        if(t == null) return;

        inOrder(t.left);
        System.out.print(t.value);
        inOrder(t.right);
    }
    public static void postOrder(Tree t){
        if(t == null) return;

        postOrder(t.left);
        postOrder(t.right);
        System.out.print(t.value);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());

            char root = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);

            insertTree(head ,root, left, right);
        }
        preOrder(head);
        System.out.println();
        inOrder(head);
        System.out.println();
        postOrder(head);
    }
}