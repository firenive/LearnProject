package additionalInformation.Book.Chapter4_modDivision;

import java.util.Scanner;

public class Number47 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int x = scan.nextInt();
        int n1 = x  / 100;
        int n2 = (x / 10) % 10;
        int n3 = x % 10;
        int number = (n3 * 100 + n2 * 10 + n1);

        System.out.println(number - 20);




    }
}

