import java.util.*;
public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число ");
        String s = scan.nextLine();
        boolean da = true;
        for(int i = 0; i < s.length()/2; i++){
            if (s.charAt(s.length() - i - 1) != s.charAt(i)){
                 da = false;
            }
        }
        if (da){
            System.out.println("Это палиндром ");
        }
        else{
            System.out.println("Это не палиндром ");
        }


    }
}
