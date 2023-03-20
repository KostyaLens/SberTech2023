public class BubbleSort {
    public int[] BubbleSort(int[] a){
        int i, j, tmp, n;
        n = a.length;
        for (i = 0; i < n; i++){
            for(j = n - 1; i < j; j--){
                if (a[j]<a[j-1]){
                    tmp = a[j];
                    a[j]= a[j-1];
                    a[j-1] = tmp;
                }
            }
        }
        return a;
    }
}