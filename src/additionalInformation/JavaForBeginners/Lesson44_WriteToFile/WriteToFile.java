package additionalInformation.JavaForBeginners.Lesson44_WriteToFile;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Text/TextFile.txt");
        PrintWriter pw = new PrintWriter(file); // класс позволяет писать данные в файл. Позволяет писать примитивнеы данные

        pw.println("I need some sleep"); // Выводим текст, указанный в аргументе в файла
        pw.println();
        pw.println("Because i\'m want to sleep");
        pw.println(232131);

        pw.close(); // обязательно закрывать поток, как и для класса Scanner

        PrintWriter pw2 = new PrintWriter("newFile.txt"); // Создает указанный файл в корне проекта
        pw2.println("This is the test");
        pw2.close();
    }
}
// Данный код переписывает весь текст в файле. А как добавить, не удаляя старый??
// лучше использовать FileWriter и в конструкторе кроме самого файла указывать true, тогда будет записывать в конец,
// если поставить false -будет перезаписывать.
