import java.util.*;
public class Task2 {
    public static void main(String[] args) {
        System.out.print("a ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.print("b ");
        int b = scan.nextInt();
        System.out.print(a / b + " Остаток " + a % b);
    }
}
