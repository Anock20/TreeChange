
public class Main {
    static int[] in, post, pre;
    static int idx;
    public static void main(String[] args) {
        test();
    }
    public static void test() {
        idx = 0;
        in = new int[] {1, 2, 3};
        post = new int[] {1, 3, 2};
        pre = new int[in.length];
        getPreOrder(0, in. length 1, 0, post.length - 1);
        for (int n : pre)
            System.out.print(n + " ");
        System.out.println();

        idx = 0;
        in = new int[] {7, 4, 8, 2, 5, 1, 3, 9, 6};
        post = new int[] {7, 8, 4, 5, 2, 9, 6, 3, 1};
        pre = new int[in.length];
        getPreOrder(0, in. length 1, 0, post.length - 1);
        for (int n : pre)
            System.out.print(n + " ");
    }
    public static void getPreOrder(int is , int ie, int ps, int pe){

    }
}