
public class Main {
    static int[] in, post, pre;
    static int idx;

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        idx = 0;
        in = new int[]{1, 2, 3};
        post = new int[]{1, 3, 2};
        pre = new int[in.length];
        getPreOrder(0, in.length - 1, 0, post.length - 1);
        for (int n : pre)
            System.out.print(n + " ");
        System.out.println();

        idx = 0;
        in = new int[]{7, 4, 8, 2, 5, 1, 3, 9, 6};
        post = new int[]{7, 8, 4, 5, 2, 9, 6, 3, 1};
        pre = new int[in.length];
        getPreOrder(0, in.length - 1, 0, post.length - 1);
        for (int n : pre)
            System.out.print(n + " ");
    }

    public static void getPreOrder(int is, int ie, int ps, int pe) {
        if (is > ie || ps > pe) // inorder,postorder 배열 탐색을 마치면 return
            return;
        int rootValue = post[pe];   // 루트 노드 설정
        pre[idx++] = rootValue;
        int rootIndex = is;
        while (in[rootIndex] != rootValue) // inorder 배열에서 루트 노드 찾기
            rootIndex++;
        int leftSize = rootIndex - is; // 왼쪽 서브트리 개수 계산
        getPreOrder(is, rootIndex - 1, ps, ps + leftSize - 1); // 재귀호출
        getPreOrder(rootIndex + 1, ie, ps + leftSize, pe - 1);
    }
}