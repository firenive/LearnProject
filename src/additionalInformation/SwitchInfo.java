package AdditionalInformation.CourseForBegginers;

import java.util.Scanner;

public class SwitchInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = scan.nextInt();
        switch (age) {
            case 0 :
                System.out.println("ты родился");
                break;
            case 7:
                System.out.println("Ты пошел в школу");
                break;
            case 18:
                System.out.println("Ты закончил школу");
                break;
            default:
                System.out.println("Ни одно из предыдущих условий не подошло");

        }
        Scanner scanText = new Scanner(System.in);
        String ageText = scanText.nextLine();
         switch (ageText) {
            case "Ноль" :
                System.out.println("ты родился");
                break;
            case "7":
                System.out.println("Ты пошел в школу");
                break;
            case "Восемнадцать":
                System.out.println("Ты закончил школу");
                break;
            default:
                System.out.println("Ни одно из предыдущих условий не подошло");

        }
    }
}
