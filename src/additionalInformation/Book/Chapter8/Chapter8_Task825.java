package additionalInformation.Book.Chapter8;

import java.util.Scanner;

public class Chapter8_Task825 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int x = scan.nextInt();
        if (x % 2 == 0) {
            double z = scan.nextDouble();
            System.out.println(((double) Math.round(x * z * 100)) / 100);
        }
        else {
            int i = scan.nextInt();
            System.out.println(i + x);
        }


    }
}
