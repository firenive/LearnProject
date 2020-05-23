package Myrusakov.Chapter8_ExternalResourses.Lesson3_WriteToFile.Lect;

import javax.swing.*;
import java.io.*;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        new File("Text/dir").mkdir(); // создаем в папке Text подпапку dir
        // new File("C:\\Users\\User\\Desktop\\ТЕСТ\\LearnProject\\Text\\dir\\new").mkdir(); создание папки по абсолютному пути
        String path = "Text/dir/a.txt";
        File file = new File(path);
        file.createNewFile(); // Создаем новй файл, согласно пути выше

        // первый способ записи в файл
        FileWriter writer = new FileWriter(file.getPath()); // для записи текстовых файлов
        String s = "Information for file\r\nNew Stroke";
        writer.write(s);
        writer.close();

        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();

        // Второй способ записи в текстовый  файл. Использую BufferedWriter
        String s1 = "it's about all information\r\n It doesn't matter";
        BufferedWriter output = new BufferedWriter(new FileWriter(file.getAbsolutePath()));
        output.write(s1);
        output.close();




    }
}
