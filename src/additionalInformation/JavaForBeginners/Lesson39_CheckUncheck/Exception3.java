package additionalInformation.JavaForBeginners.Lesson39_CheckUncheck;

import java.io.File;
import java.io.FileNotFoundException;

public class Exception3 {
    public static void main(String[] args) throws FileNotFoundException {
        // В java есть 2 типа исключений
        // Checked Exception (compile time Exception). Возникают во время компиляции. Исключительные случаи в работе программы
        // Unchecked Exception (runtime Exception). Возникают во время выполнения программ

        // Пример Checked Exception. Checked Exception нужно обязательно обработать прописав блок tryCatch или
        // выбросив Exception у метода. Без обработки код скомпилирован не будет
        File file = new File("ssss");
        // Scanner scan = new Scanner(file);

        // Unchecked Exception. Исключения выбрасываются во время работы программы при ошибке в работе програмы
        try {
            System.out.println();
            int a = 1 / 0;
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
            // Exception in thread "main" java.lang.ArithmeticException: / by zero
            //	at additionalInformation.Beginners.Lesson39_CheckUncheck.Exception3.main(Exception3.java:19)
        }
        try {
            System.out.println();
            int x = Integer.parseInt("ss");
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
            // Exception in thread "main" java.lang.NumberFormatException: For input string: "ss"
            //	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:68)
            //	at java.base/java.lang.Integer.parseInt(Integer.java:658)
            //	at java.base/java.lang.Integer.parseInt(Integer.java:776)
            //	at additionalInformation.Beginners.Lesson39_CheckUncheck.Exception3.main(Exception3.java:22)
        }
        try {
            System.out.println();
            String name = null;
            name.length();
        } catch (NullPointerException npe) {
            npe.printStackTrace();
            // java.lang.NullPointerException
            //	at additionalInformation.Beginners.Lesson39_CheckUncheck.Exception3.main(Exception3.java:43)
        }
        try {
            int[] m = {0, 1, 2};
            System.out.println(m[3]);
        } catch (ArrayIndexOutOfBoundsException aibe) {
            aibe.printStackTrace();
            // java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            //	at additionalInformation.Beginners.Lesson39_CheckUncheck.Exception3.main(Exception3.java:49)
        }

    }



}
