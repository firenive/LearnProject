package additionalInformation.Book.Chapter4_modDivision;

import java.util.Scanner;

public class Number422 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // трехзначное число
        int x = scan.nextInt();
//        int xFirst = x / 10;
//        int xLast = x %10;
//        int number = xLast * 100 + xFirst;
//        System.out.println(xFirst + " " + xLast);
//        System.out.println(number);


        // четырехзначное число
        int xFirst1 = x / 10;
        int xLast1 = x % 10;
        int number1 = xLast1 * 1000 + xFirst1;
        System.out.println(xFirst1 + " " + xLast1);
        System.out.println(number1);
//        int n1 = x / 1000;
//        int n2 = x % 1000 / 100;
//        int n3 = x % 100 / 10;
//        int n4 = x% 10;
//      int number = n2* 1000 + n3 * 100 + n4 * 10 + n1;
//        System.out.println(n1 + " " + n2 + " " + n3 + " " +n4);
//        System.out.println(number);


    }

}
