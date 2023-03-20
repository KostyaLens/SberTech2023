
import org.junit.jupiter.api.Assertions;


class Test {

    @org.junit.jupiter.api.Test
    public void bubbleSortTest1() { //Случайный Массив
        int[] a = new int[]{4, 6, 1, 2, 6, 0, 432};
        int[] res = new int[]{0, 1, 2, 4, 6, 6, 432};
        BubbleSort Bsort = new BubbleSort();
        Assertions.assertArrayEquals(res, Bsort.BubbleSort(a));
    }
    @org.junit.jupiter.api.Test
    void bubbleSortTest2() {//Отсортированный  Массив
        int[] a = new int[]{0, 1, 2, 4, 6, 6, 432};
        int[] res = new int[]{0, 1, 2, 4, 6, 6, 432};
        BubbleSort Bsort = new BubbleSort();
        Assertions.assertArrayEquals(res, Bsort.BubbleSort(a));
    }
    @org.junit.jupiter.api.Test
    void bubbleSortTest3() {//Обратыный Массив
        int[] a = new int[]{432, 6, 6, 4, 2, 1, 0};
        int[] res = new int[]{0, 1, 2, 4, 6, 6, 432};
        BubbleSort Bsort = new BubbleSort();
        Assertions.assertArrayEquals(res, Bsort.BubbleSort(a));
    }
    @org.junit.jupiter.api.Test
    void bubbleSortTest4() {//Тест который не пройдёт
        int[] a = new int[]{4, 6, 1, 2, 6, 0, 432};
        int[] res = new int[]{0, 1, 4, 2, 6, 6, 432};
        BubbleSort Bsort = new BubbleSort();
        Assertions.assertArrayEquals(res, Bsort.BubbleSort(a));
    }
    @org.junit.jupiter.api.Test
    void qSortTest1() { //Случайный Массив
        int[] a = new int[]{4, 6, 1, 2, 6, 0, 432};
        int[] res = new int[]{0, 1, 2, 4, 6, 6, 432};
        qSort qSort = new qSort();
        Assertions.assertArrayEquals(res, qSort.qSort(a));
    }
    @org.junit.jupiter.api.Test
    void qSortTest2() {//Отсортированный  Массив
        int[] a = new int[]{0, 1, 2, 4, 6, 6, 432};
        int[] res = new int[]{0, 1, 2, 4, 6, 6, 432};
        qSort qSort = new qSort();
        Assertions.assertArrayEquals(res, qSort.qSort(a));
    }
    @org.junit.jupiter.api.Test
    void qSortTest3() {//Обратыный Массив
        int[] a = new int[]{432, 6, 6, 4, 2, 1, 0};
        int[] res = new int[]{0, 1, 2, 4, 6, 6, 432};
        qSort qSort = new qSort();
        Assertions.assertArrayEquals(res, qSort.qSort(a));
    }
    @org.junit.jupiter.api.Test
    void qSortTest4() {//Тест который не пройдёт
        int[] a = new int[]{4, 6, 1, 2, 6, 0, 432};
        int[] res = new int[]{0, 1, 4, 2, 6, 6, 432};
        qSort qSort = new qSort();
        Assertions.assertArrayEquals(res, qSort.qSort(a));
    }


}