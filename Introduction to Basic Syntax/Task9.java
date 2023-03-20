import java.util.*;
public class Task9 {
    public static void main(String[] args) {
        System.out.print("Введите кэф a");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.print("Введите кэф b");
        int b = scan.nextInt();
        System.out.print("Введите кэф c");
        int c = scan.nextInt();
        int d = b*b - 4*a*c;
        if (d<0){
            System.out.println("Корней нет");
        }
        else{
            float x1 = (float)(-b + Math.sqrt(d))/(2*a);
            float x2 = (float)(-b - Math.sqrt(d))/(2*a);
            System.out.println("Корни");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
