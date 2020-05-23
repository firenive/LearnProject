package additionalInformation.JavaForBeginners.Lesson36_ReadingFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        /* Scanner scan = new Scanner(System.in); // использование класса Scanner для считывания строчки из консоли
        String data = scan.nextLine();
        System.out.println(data); */

        // Считывание информации из файла
        // создаем объект класса File и передаем в конструктор путь к файлу
        String path = "C:\\Users\\User\\Desktop\\Read\\test.txt";

        // константа separator позволяет задать разделить "/" или "\" в зависимости от типа ОС и используемоей ей файл. системы
        String separator = File.separator;
        String pathSep = "C:" + separator + "Users" + separator + "User" + separator + "Desktop" +
                separator + "Read" + separator + "test.txt";
        File file = new File(pathSep);
        // создаем новый объект класса Scanner и в качестве входного потока указываем файл, при этом добавляя исключение
        Scanner scanFile = new Scanner(file);

        while(scanFile.hasNextLine()) { // hasNextLine true пока в файле не окончатся строки. Если все строки считаны false
            System.out.println(scanFile.nextLine()); // выводим строки в txt файле
        }
        scanFile.close(); // В конце программы обязательно закрываем Scanner для закрытия потока

        // необходимо считать 3 числа из файла и положить их в массив int. числа записаны на первой строке через пробел

        String pathNumber = "C:" + separator + "Users" + separator + "User" + separator + "Desktop" +
                separator + "Read" + separator + "number.txt";
        File fileNumber = new File(pathNumber);
        Scanner scanNumber = new Scanner(fileNumber);
        String line = scanNumber.nextLine(); // положили всю строку с числами в объект line Класса String. Строка: "1 2 3"
        String[] numbers = line.split(" "); // разделяет всю линию по указанному разделителю (пробел).
        // позволяет выделить данные и убрать разделительные символы. Данные при этом кладутся в массив
        System.out.println(Arrays.toString(numbers)); // [1, 2, 3] Мы положили числа в массив, но они имеют строковое представление
        // Преобразуем строки в числа и положим их в целочисленный массив
        int[] intMass = new int[3];
        int counter = 0;
        for(String num : numbers) {
            intMass[counter++] = Integer.parseInt(num);
        }
        System.out.println("Целочисленный массив = " + Arrays.toString(intMass));

        // считываем следующую строку с разделителями в виде точки
        String line2 = scanNumber.nextLine(); // Строка: "First.Second.Third"
        String[] words = line2.split("\\."); // На этот раз разделителем является точка.
        // Экранирование точки осуществляется двойным обратным слешем
        System.out.println(Arrays.toString(words)); // Arrays.toString() позволяет вывести массив. Out: [First, Second, Third]

        // разделители могут быть любым символом. Разделитель в строчке 3 = "0"
        String line3 = scanNumber.nextLine();
        String[] nulls = line3.split("0");
        System.out.println(Arrays.toString(nulls)); // IN: 1020304050  Out: [1, 2, 3, 4, 5]

        scanNumber.close();

        // Кроме абсолютных путей os Мы можем использовать пути проекта. Получим доступ к файлу project в папке Text
        // Такой метод предпочтительнее для внутренних файлов проекта, так как позволяет не зависеть от особенностей ОС
        File fileProject = new File("Text/project.txt");
        Scanner scanProject = new Scanner(fileProject);
        System.out.println(scanProject.nextLine());

        scanProject.close();



    }
}
