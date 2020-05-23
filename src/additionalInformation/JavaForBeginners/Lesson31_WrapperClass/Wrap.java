package additionalInformation.JavaForBeginners.Lesson31_WrapperClass;

public class Wrap {
    public static void main(String[] args) {
        // у примитивных типов нет методов. Для применения методов к примитивным типам нужно использовать классы обертки
        // Классы обертки: Double, Float, Long, Integer, Short, Byte, Character, Boolean

        int x = 1;
        Integer x2 = 2321; // для обекта x2 будут доступны методы применяемые для целых чисел
        Integer x3 = Integer.parseInt("121"); // метод преобразующий строку в число

        // Если не требуются методы то нужно использовать примитивы так как они занимают меньше места и "инициализация чище"

        // автоупаковка и автораспаковка
        Integer x4 = 23213; // пример автоупаковки. примитивный тип int со значение 23213 упаковывается в Integer
        int z = x4; // автораспаковка


    }
}
