import java.util.*;
public class Rome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число до 100: ");
        int a = scan.nextInt();
        String s = "";
        while (a > 0){
            if (a >= 100){
                s += "C";
                a -= 100;
            }
            else if (a + 10 >= 100){
                s += "X";
                a += 10;
            }
            else if (a >= 50){
                s += "L";
                a -= 50;
            }
            else if (a + 10 >= 50){
                s += "X";
                a += 10;
            }
            else if (a >= 10){
                s += "X";
                a -= 10;
            }
            else if ((a % 10 == 9) || (a + 1 == 5)){
                s += "I";
                a += 1;
            }
            else if (a >= 5) {
                s += "V";
                a -= 5;
            }
            else {
                s += 'I';
                a -= 1;
            }

        }
        System.out.println(s);

    }

}
