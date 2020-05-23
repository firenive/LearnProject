package additionalInformation.forTesting;

import java.util.Scanner;

public class mainTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите время в секундах");
        int hour = scan.nextInt();
        int seconds = hour * 3600;
        System.out.println(seconds);


    }
}
