public class qSort {
    public void Sortl(int[] a, int l, int r){
        int x, y, i, j;
        if (a.length == 0)
            return;
        if (l >= r)
            return;
        int i1 = (l + r) / 2;
        x = a[i1];
        i = l;
        j = r;
        while(i <= j){
            while (a[i] < x){
                i += 1;
            }
            while (a[j] > x){
                j -= 1;
            }
            if(i <= j){
                y = a[i];
                a[i] = a[j];
                a[j] = y;
                i = i + 1;
                j = j - 1;
            }

        }
        if (l < j) {
            Sortl(a, l, j);
        }
        if (i < r) {
            Sortl(a, i, r);
        }
    }
    public int[] qSort(int[] a){
        int n;
        n = a.length - 1;
        Sortl(a, 0, n);
        return a;
    }
}