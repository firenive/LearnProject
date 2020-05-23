package additionalInformation.Book.Chapter8;

import java.util.Scanner;

public class Chapter8_Task821 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int x = scan.nextInt();
        int c = 0;
        int n1 = x % 10;
//        int n2 = 10 - n1;
//        if (n1 >= 5) x = x + n2;
//        if (n1 < 5) x = x -n1;
//        System.out.println(x);
        if (n1 < 5) c = (x / 10) *10;
        else c = (x / 10 +1) * 10;
        System.out.println(c);


    }
}
