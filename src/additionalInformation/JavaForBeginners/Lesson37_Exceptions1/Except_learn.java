package additionalInformation.JavaForBeginners.Lesson37_Exceptions1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Except_learn {
    public static void main(String[] args) {
        try {
            readFile();
        }catch (FileNotFoundException f) {
            f.printStackTrace(); // printStackTrace Лучше избегать подобную обработку исключений. Делайте собственную
            // обработку исключений, описывающую ошибку понятным языком для пользователя
        }

    }
public static void readFile() throws FileNotFoundException {
        File file = new File ("ssss");
        Scanner scan = new Scanner(file);
}
}


