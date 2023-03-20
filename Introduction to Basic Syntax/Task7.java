import java.util.*;
public class Task7 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Сколько членов последовательности Фибоначчи вывести");
        n = scan.nextInt();
        int[] a = new int[n + 1];
        a[0] = 0;
        a[1] = 1;
        for( int i = 1; i <= n; i++){
            if (i > 1) {
                a[i] = a[i - 1] + a[i - 2];
            }
            System.out.print(a[i] +  " ");
        }


    }
}
