public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{4, 6, 1, 2, 6};
        BubbleSort Bsort = new BubbleSort();
        int[] res = Bsort.BubbleSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(res[i]);
        }
        qSort qSort = new qSort();
        int[] res2 = qSort.qSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(res2[i]);
        }

    }
}