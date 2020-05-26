package additionalInformation.Book.Chapter2_InOut;

import java.util.Scanner;

public class NameSurname239 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Введите вашу фамилию: ");
        String surname = scan.nextLine();
        System.out.print("Введите ваше имя: ");
        String name = scan.nextLine();
        System.out.print("Введите ваше отчество: ");
        String midName = scan.nextLine();
        name = name.substring(0,1) + ". ";
        midName = midName.substring(0,1) + ".";
        String out =name.charAt(0) + ". " + midName.charAt(0) + ". " + surname;
        System.out.println(surname + " " + name + midName);
        System.out.println(out);



    }
}
