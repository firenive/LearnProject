package Myrusakov.Chapter5_GeneralClasses.Lesson1_String.Lect;

public class ObjectString {
    public static void main(String[] args) {
        char[] cArr = {'a', 'b', 'c', 'd'};
        String s1 = new String(cArr); // соединение всех элементов массива в одну строку
        System.out.println(s1);
        String s2 = "My new String";
        String s3 = "My new String";
        System.out.println(s2.charAt(1)); // OUT: y. Получает символ строки под указанным порядковым номером

        System.out.println(s2.equals(s3)); // OUT: true. проверка на эквивалентность двух объектов
        System.out.println(s2.equals(s1)); // false

        System.out.println(s2.startsWith("My")); // OUT: true. Проверка начинается ли строка с указанных символов
        System.out.println(s2.startsWith("ddd")); // false

        System.out.println(s2.endsWith("String")); // true Проверка заканчивается ли строка указанными символами

        System.out.println(s2.indexOf("new")); // OUT: 3; проверка входит ли заданная подстрока в строку s2.
        // возвращает индекс элемента с которого начинается вхождение (возвращает индекс первого пересечения)
        System.out.println(s2.indexOf("aaaa")); // возвращает -1. указанная подстрока не входит в строку

        System.out.println(s2.lastIndexOf("n")); // OUT: 11; То же самое, что indexOf, но возвращает индекс последнего пересечения

        System.out.println(s1.length()); // возвращает длину строки

        System.out.println(s2.replace('n', 'W')); //  метод заменяет все символы указанные первым параметром
        // на символу указанные во втором параметре. OUT: My Wew StriWg. Метод делает копию строки не трогая данные изначальной строки
        System.out.println(s3.replace("new", "old")); // My old String

        System.out.println(s2.substring(5)); // метод создает новую строку из исходной, начиная с указанного символа и до конца
        // w String. при этом s2 не меняется
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(s3.substring(2, 7)); // OUT: " new ". Задаем начало и конец строки обрезаемой строки

        System.out.println(s2.toLowerCase()); // OUT: "my new string". приведение строки к нижнему регистру
        // используется например для приведения введенных паролей к одному регистру
        System.out.println(s3.toUpperCase()); // OUT: "MY NEW STRING" // приведение к верхнему регистру

        String userData = "    fdsfsdf.ru     "; // Обрезает пробелы в начале и в конце строки
        System.out.println(userData.trim()); // fdsfsdf.ru

    }
}
