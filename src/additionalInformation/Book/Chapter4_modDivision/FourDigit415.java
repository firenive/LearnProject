package additionalInformation.Book.Chapter4_modDivision;

import java.util.Scanner;

public class FourDigit415 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        int x = scan.nextInt();
        int degreePar = 0;
        int n1 = x / 1000;
        int n2 = (x % 1000) / 100;
        int n3 = x  % 100 /10;
        int n4 = x  %10;
        System.out.println(n1 + " " + n2 + " " + n3 +" " + n4);
        if (n1 % 2 == 0) degreePar++;
        if (n2 % 2 == 0) degreePar++;
        if (n3 % 2 == 0) degreePar++;
        if (n4 %2 == 0) degreePar++;
        System.out.println(degreePar);
        int number = n4 * 1000 + n2 * 100 + n3 * 10 + n1;
        System.out.println(number);


    }
}
