package Myrusakov.Chapter5_GeneralClasses.Lesson1_String.Exe;

import java.util.Scanner;

public class EnterString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Пожалуйста введите строку");
        try {
        String s2 = scan.nextLine();
        System.out.println(s2.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s2.substring(1, 4));
        String hello = "hello";
        if (s2.contains(hello)) {
            System.out.println("В введенной Вами строке "
                    + "\"" + s2 + "\"" + "есть слово: " + "\"" + "hello" + "\"");
        } else {
            System.out.println("В введенной Вами строке "
                    + "\"" + s2 + "\"" + " отсутствует слово: " + "\"" + "hello" + "\"");
        }
    } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Вы должны ввести строку длинной более 4 символов");
        }
    }
}
