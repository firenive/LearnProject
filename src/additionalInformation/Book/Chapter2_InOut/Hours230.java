package additionalInformation.Book.Chapter2_InOut;

import java.util.Scanner;

public class Hours230 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Введите час: ");
        int hour = reader.nextInt();
        System.out.print("Введите минуты: ");
        int minutes = reader.nextInt();

        int mintElapsed = hour *60 + minutes;
        System.out.println("Прошло минут с полуночи: " + mintElapsed);

        int secondsElapsed = hour * 3600 + minutes * 60;
        System.out.println("прошло секунд с полуночи: " + secondsElapsed);

        int beforeMidnight = 24* 60 -mintElapsed;
        System.out.println("Осталось минут до полуночи: " + beforeMidnight);





    }

}
