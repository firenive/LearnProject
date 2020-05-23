package additionalInformation.JavaForBeginners.Lesson42_EqualsStringPool;

public class StringEquals {
    public static void main(String[] args) {
        // метод equals также применяется для сравнения строк
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1.equals(s2)); // true
        String s3 = "Hell";
        System.out.println(s2.equals(s3)); // false

        System.out.println( s1 == s2); // true таким образом строки в java не сравниваются. Но возвращается true

        // StringPool предназначен для экономии памяти и других ресурсов
        // При создании новой строки с тем же значение Java не создает новый объект с тем же значением. Она ссылает каждый
        // Следующую созданную строку с тем же значением на уже созданное значение. две ссылки указывают на один и тот же
        // объект вследствии чего ссылки одинаковы и сравнение вида == вернет true
        String s4 = "Admin"; // s4 -> {"Admin"}
        String s5 = "Admin"; // s5 -> {"Admin"}
        System.out.println(s4 == s5); // true

        // Такого не происходит например при ином объявлении строки
        String string1 = new String("mike");
        String string2 = new String("mike");
        System.out.println(string1 == string2); // false, так как создаются два отдельных объекта несмотря на одинаковое
        // значение
        System.out.println(string1.equals(string2)); // true

        // для сравнение строк использовать equals(), а не ==
        String a = "hello";
        String b = "hello123".substring(0,5); // отсекаем лишнее, чтобы осталась только строка hello
        System.out.println(b); // hello
        System.out.println(a == b); // false. Несмотря на то что строки являются одинаковыми при объявлении они имели
        // разные значения. Java не объединила их в StringPool  и создала 2 разных объекта с разными ссылками
    }
}
