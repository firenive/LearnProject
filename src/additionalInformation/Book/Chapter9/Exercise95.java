package additionalInformation.Book.Chapter9;

import java.util.Scanner;

public class Exercise95 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int numberFlat = scan.nextInt();
        System.out.println(whereFlat(numberFlat));

    }

    public static String whereFlat(int n) {
        String result = "";
        int floor;
        if (n % 3 == 0) {
            floor = n / 3;
            result = "Квартира расположена справа на " + floor + " этаже";
        } else if ((n + 1) % 3 == 0) {
            floor = n / 3 + 1;
            result = "Квартира расположена в центре на " + floor + " этаже";
        } else if ((n + 2) % 3 == 0) {
            floor = n / 3 + 1;
            result = "Квартира расположена слева на " + floor + " этаже";
        }
        return result;
    }
    // На каждом этаже многоэтажного дома расположены три квартиры;
    // счет квартир идет слева направо. Например, на первом этаже квартира
    // № 1 расположена слева, квартира № 2 - в центре, квартира № 3 -
    // справа, и так далее.
    // Напишите класс, который принимает с клавиатуры номер квартиры и выводит на экран следующую информацию: на каком
    // этаже она расположена, и какое место (слева, справа или в центре) она занимает на этом этаже.
}
