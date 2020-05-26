package additionalInformation.Book.Chapter8;

import java.util.Scanner;

public class Exercise826 {
    static Scanner scan = new Scanner(System.in);
    // Напишите класс, который принимает с клавиатуры положительное число  и проверяет, является ли это число палиндромом.
    // 3103013
    // а роза упала на лапу азора

    public static void main(String[] args) {
        String n = scan.nextLine();
        n = n.toLowerCase();
        boolean isPalindrome = false;
        if (n.length() == 1) isPalindrome = true;
        for (int i = 0; i < n.length() / 2; i++) {
            if (n.charAt(i) == n.charAt(n.length() - (i + 1))) {
                isPalindrome = true;
            }
        }
        System.out.println(isPalindrome);
    }
}
