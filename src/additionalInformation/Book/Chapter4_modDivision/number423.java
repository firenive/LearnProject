package additionalInformation.Book.Chapter4_modDivision;

import java.util.Scanner;

public class number423 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int a = scan.nextInt();
        int b = scan.nextInt();
        int aFirst = a / 10;
        int bFirst = b / 10;
        int aLast = a % 10;
        int bLast = b % 10;
        int numberA = aFirst * 10 + bLast;
        int numberB = bFirst * 10 + aLast;
        System.out.println(numberA + "   " + numberB);

    }
}
