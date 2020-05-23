package additionalInformation.JavaForBeginners.Lesson23_printf;

public class FormatString {
    public static void main(String[] args) {
        System.out.println("hello"); // println печатает передаваемый параметр и переносит строку
        System.out.printf("This is a String, %s\n", "Nice"); // %s обозначает что сюда будет передано значение класса String
        // s является конвентером - символом, который определяет тип переменной для форматирования
        StringBuilder s1 = new StringBuilder("StringBuilder");
        System.out.printf("This is a %s\n", s1); // или StringBuilder
        int x = 10;
        System.out.printf("This is a %d\n", x); // или int при конвентере = d
        System.out.printf("This is a %s and %d\n", s1, x); // количество конвентеров должно соответствовать количеству параметров

        //  %10d обозначает что будет передано число длинной 10 символов.
        // при печати делает пропелы = заданному количеству символов. Нужно для форматирования
        System.out.printf("String %10d \n", 532);
        System.out.printf("String %10d \n", 5);
        System.out.printf("String %10d \n", 100000);
        System.out.printf("String %10d \n", 100000000);
        // String        532
        // String          5
        // String     100000
        // String  100000000
        System.out.println();
        // Выравнивание по левому краю %-10d
        System.out.printf("String %-10d \n", 532);
        System.out.printf("String %-10d \n", 5);
        System.out.printf("String %-10d \n", 100000);
        System.out.printf("String %-10d \n", 100000000);
        // String 532
        // String 5
        // String 100000
        // String 100000000
        System.out.println();
        // Округление чисел по математичесим правилам
        System.out.printf("String %.2f \n", 532.232311); // %.2f вывод двух знаков после запятой Out: String 532,23
        System.out.printf("String %.0f \n", 532.2); // Out: 532
        System.out.printf("String %.3f \n", 532.26645);
        System.out.printf("String %f \n", 532.264556456645);

    }
}
