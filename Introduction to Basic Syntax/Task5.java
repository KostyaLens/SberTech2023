import java.util.*;
public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите вес на земле");
        float s = scan.nextInt();
        s = (float) (s * 0.17);
        System.out.println("Вес на луне = "+ s);

    }
}
