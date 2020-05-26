package additionalInformation.Book.Chapter6;

import java.util.Scanner;

public class Exercise6_9 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int a = scan.nextInt();
        int n1 = a / 100;
        int n2 = a % 100 / 10;
        int n3 = a % 10;
        System.out.println(n1 + " " + n2 + " " + n3);
        if (n1 % 2 == 0 && n2 % 2 ==0 && n3 % 2 ==0) {
            System.out.println("yep");
        }
    }
}
