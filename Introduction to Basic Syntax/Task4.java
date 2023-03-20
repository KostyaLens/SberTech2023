import java.util.*;
public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число ");
        int s = scan.nextInt();
        int sum = 0, n;
        n = s / 100;
        sum += n;
        n = (s / 10)%10;
        sum += n;
        n = (s %100)%10;
        sum += n;
        System.out.println("Сумма 3 цифр числа n = "+ sum);


    }
}
