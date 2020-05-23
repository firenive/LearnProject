package additionalInformation.Book.Chapter8;

import java.util.Scanner;

public class Chapter8_Task824 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int x = scan.nextInt();
        int n1 = x/ 100;
        int n2= x / 10 % 10;
        int n3 = x %10;
        if (x > 500) x = n3 * 100 + n2 *10 + n1;
        else x = n1 * 100 + n3 * 10 + n2;
        System.out.println(x);


    }
}
