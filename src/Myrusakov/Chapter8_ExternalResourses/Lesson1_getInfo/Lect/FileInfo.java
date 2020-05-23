package Myrusakov.Chapter8_ExternalResourses.Lesson1_getInfo.Lect;

import java.io.File;
import java.io.FileInputStream;

public class FileInfo {
    public static void main(String[] args) {
        // создадим новый объект класса файл. в качестве файла передадим относительный адрес текущего класса
        File file = new File("src/Myrusakov/Chapter8_ExternalResourses/Lect/FileInfo.java");
        System.out.println("Файл доступен для чтения - " + file.canRead()); // проверка на доступность файла для чтения true
        System.out.println("Файл доступен для записи - " + file.canWrite()); // true
        System.out.println("Файл существует -" + file.exists()); // проверка на существование файла true

        System.out.println("Полный путь к файлу " + file.getAbsolutePath());
        // C:\Users\User\Desktop\ТЕСТ\LearnProject\src\Myrusakov\Chapter8_ExternalResourses\Lect\FileInfo.java

        System.out.println("Имя файла " + file.getName()); // FileInfo.java
        System.out.println("Название родительской директории " + file.getParent()); // src\Myrusakov\Chapter8_ExternalResourses\Lect

        System.out.println("Это файл " + file.isFile()); // проверка на то является лиобъект файлом. класс file может
        // работать как с файлом, так и с директорией
        System.out.println("Это директория " + file.isDirectory()); // false
        System.out.println("последнее время изменения файла " + file.lastModified()); // возвращает последнее время изменения файла
        // в миллисекундах, прошедших с 1 января 1970 года

        File parent = file.getAbsoluteFile().getParentFile().getParentFile().getParentFile(); // поднимаемся на 3  уровля текущего файла
        // подъем происходит исходя из абсолютного пути файла
        System.out.println(parent.getAbsolutePath()); // C:\Users\User\Desktop\ТЕСТ\LearnProject\src\Myrusakov\

        // получим список всех файлов и директорий которые находятся по  пути, хранящемся в объекте parent
        File[] files = parent.listFiles();

        for (File f: files) {
            System.out.println("-----------");
            System.out.println(f);
            System.out.println("Размер файла: " + f.length());
            System.out.println("Это файл? "+f.isFile());
        }



    }
}
