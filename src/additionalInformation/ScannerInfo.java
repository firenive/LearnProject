package additionalInformation;

import java.util.Scanner;

public class ScannerInfo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);  // System.in - стандартный поток входных данных
        // Scanner это класс. new Scanner  это создание нового объекта класса Scanner. Теперь s ссылается на объект класа Scanner
        System.out.println("Введите что-нибудь:");
        String str = s.nextLine(); // str присваивает строку которую мы введем с клавиатуры
        System.out.println(str);
        int x = s.nextInt(); // x присваивает число которое мы введем с клавиатуры
        System.out.println(x);
    }
}
