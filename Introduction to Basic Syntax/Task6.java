import java.util.Scanner;
import java.lang.Math;
public class Task6 {
    public class prime {
        public static void prime1(int count){
            boolean lose = false;
            int d = (int)Math.sqrt(count);
            for(int j = 2; j <= d; j++){
                if (count % j == 0){
                    lose = true;
                    System.out.println("Составное");
                    break;
                }
            }
            if (lose == false){
                System.out.println("простое ");
            }
        }

        public static void main(String[] args) {
            int count;
            System.out.print("Введите число которое проверить на простоту ");
            Scanner scan = new Scanner(System.in);
            count = scan.nextInt();
            prime1(count);
        }
    }
}
