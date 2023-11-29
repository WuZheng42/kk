public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }
    /**
     * Returns an IntList identical to L, but with
     * each element incremented by x. L is not allowed
     * to change.
     */
    public static IntList incrList(IntList L, int x) {
        /* Your code here. */if (L == null) {
            return null; // 基本情况：空列表
        } else {
            // 递归情况：返回新列表，其中当前元素增加了指定值，同时递归处理剩余部分
            return new IntList(L.first + x, incrList(L.rest, x));
        }

    }

    /**
     * Returns an IntList identical to L, but with
     * each element incremented by x. Not allowed to use
     * the 'new' keyword.
     */
//    public static IntList dincrList(IntList L, int x) {
//        /* Your code here. */
//        return L;
//    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);

//        System.out.println(L.size());
//        System.out.println(L.iterativeSize());
//
//        Test your answers by uncommenting.Or copy and paste the
//        code for incrList and dincrList into IntList.java and
//        run it in the visualizer.
//               System.out.println(L.get(1));
       System.out.println(incrList(L, 3));
//        System.out.println(dincrList(L, 3));
    }
}