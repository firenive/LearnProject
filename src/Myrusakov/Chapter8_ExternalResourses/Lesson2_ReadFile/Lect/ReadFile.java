package Myrusakov.Chapter8_ExternalResourses.Lesson2_ReadFile.Lect;

import java.io.*;
import java.util.Arrays;

public class ReadFile {
    public static void main(String[] args) {
        String path = "Text/TextFile.txt";
        try {
            // побайтовое чтение из файла
            FileInputStream in = new FileInputStream(path);
            int b = in.read(); // считываем байтовую длину строки
            int byteAll = 0;
            while (b != -1) { //  -1 означает конец файла. выходит из цикла
                // приводим байты к символам
                System.out.print((char) b);
                // латинские символы кодируются одним байтом. 1 символ = 1 байт. Кириллические символы занимает 2 байта каждый
                // I need some sleep
                // Ð­ÑÐ¾ ÑÑÑÑÐºÐ¸Ð¹ ÑÐµÐºÑÑ
                // Because i'm want to sleep
                // 232131
                b = in.read();
                byteAll += b;
            }
            System.out.println("\n" + byteAll); // Размер текста в байтах  9645
            in.close();

            System.out.println("-------------------------------");
            // для чтения текстовых файлов подходит класс FileReader
            // потребляет много ресурсов. лучше не использовать
            FileReader input = new FileReader(path);
            int code = input.read(); // считывает не побайтово, а посимвольно. каждый символ отдельно
            while (code != -1) {
                System.out.print((char) code);
                code = input.read();
            }
            input.close();

            System.out.println("\n-------------------------------");
            // считываем не каждый символ по отдельности, а создаем массив из символов, в который кладем содержимое файла
            input = new FileReader(path);
            char[] chars = new char[4096]; // создаем массив для символов с максимальным количеством символов  = 4096
            input.read(chars); // все символы из файла записались в массив (Если длина массива > количество символов в файле
            Arrays.asList(chars).forEach((ae) -> System.out.print(ae));
            System.out.println("\n" + "------------------------");
            BufferedReader reader = new BufferedReader(new FileReader(path));
            // считываем файл построчно
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {

            System.out.println("Файл не найден");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
