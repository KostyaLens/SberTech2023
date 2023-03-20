import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean Right = true;
        Random r = new Random();
        char c = (char)(r.nextInt(26) + 'A');
        while (Right){
            char a = scan.next().charAt(0);

            if (a == c){
                System.out.println("Right");
                Right = false;
            }
            else{
                if(a < c){
                    System.out.println("«You’re too high");
                }
                else{
                    System.out.println("You’re too low");
                }

            }

        }



    }
}