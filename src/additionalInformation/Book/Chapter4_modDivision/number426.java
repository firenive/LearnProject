package additionalInformation.Book.Chapter4_modDivision;

import java.util.Scanner;

public class number426 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int a = scan.nextInt();
        int b = scan.nextInt();

        int aFirst = a / 100;
        int bFirst = b / 100;

        int aLast = a%100;
        int bLast = b%100;
        a = bFirst * 100 + aLast;
        b = aFirst * 100 + bLast;
        System.out.println(a + "   " + b);
    }
}
