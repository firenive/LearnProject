package additionalInformation.JavaForBeginners.Lesson38_Exceptions2;

import java.io.IOException;
import java.util.Scanner;

public class Exceptions2 {
    public static void main(String[] args) throws IOException, ScannerException {
        Scanner scan = new Scanner(System.in);
       /* while (true) {
            int x = Integer.parseInt(scan.nextLine()); // выбрасываем исключение если введенное число != 0
             if (x != 0) {
                 throw new IOException();
             }
             else if ( x == 1) break;*/

        // альтернативная запись, не требующая вызывания исключения у метода
        while (true) {
            int z = Integer.parseInt(scan.nextLine());
            if (z != 0) {
                // try {
                throw new ScannerException("Пользователь ввел что-то кроме 0");

            }
        /* }catch (ScannerException e) {
                    System.out.println("Пользователь ввел не то");
                }*/
            }
        // Exception in thread "main" additionalInformation.Beginners.Classes.Lesson38_Exceptions2.ScannerException:
        // Пользователь ввел что-то кроме 0
        //	at additionalInformation.Beginners.Classes.Lesson38_Exceptions2.Exceptions2.main(Exceptions2.java:21)

        }

}


