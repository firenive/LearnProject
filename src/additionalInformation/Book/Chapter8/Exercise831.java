package additionalInformation.Book.Chapter8;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Exercise831 {
    static Scanner scan = new Scanner(System.in);
    // Напишите класс, который принимает с клавиатуры трехзначное число
    //и изменяет его следующим образом:
    //• для четных чисел - все четные цифры увеличиваются на 1, а нечетные уменьшаются на 1; в случае если это невозможно, они остаются неизменными;
    //• в нечетных числах все изменения производятся «наоборот».
    //Программа должна вывести на экран новое значение переменной.

    public static void main(String[] args) {
        int x = scan.nextInt();
        int n1 = x / 100;
        int n2 = x % 100 / 10;
        int n3 = x % 10;
        if (x % 2 == 0) {
            if (n1 % 2 == 0) n1++;
            else n1--;
            if (n2 % 2 == 0) n2++;
            else n2--;
            if (n3 % 2 == 0) n3++;
            else n3--;
        }
        else if (x % 2 != 0) {
            if (n1 % 2 == 0) n1 --;
            else n1++;
            if (n2 %2 == 0) n2--;
            else n2++;
            if (n3 %2 == 0) n3--;
            else n3++;

        }
        System.out.println(n1 + "" + n2 + n3);
    }

}
