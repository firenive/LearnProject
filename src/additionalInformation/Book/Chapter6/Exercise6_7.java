package additionalInformation.Book.Chapter6;

import java.util.Scanner;

public class Exercise6_7 {
   static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int x;
        String s = scan.nextLine();
        if (s.length() >= 3) {
            x = Integer.parseInt(s);
            if (x > 0 ) {
                x--;
                System.out.println(x);
            }
            else System.out.println("число отрицательное");
        }
        else if(s.length() < 3) System.out.println("length");

    }
}
