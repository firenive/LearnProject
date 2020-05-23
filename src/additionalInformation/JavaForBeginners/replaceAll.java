package additionalInformation.JavaForBeginners;

public class replaceAll {
    public static void main(String[] args) {
        // Метод replaceAll() — заменяет каждую подстроку данной строки, которая соответствует заданному регулярному
        // выражению, с данной заменой, другими словами — метод позволяет заменить слово в строке
        // Синтаксис метода:
        //public String replaceAll(String regex, String replacement)
        // regex — регулярное выражение, которому данная строка должна соответствовать;
        // replacement — строка, которая заменит найденное выражение.
        String inputString = "это просто 2016 2014 строка 98765 в 0000101 Java 1101001";

        // заменяем все цифры и числа на пустоту
        String result = inputString.replaceAll("[0-9]+", "");
        System.out.println(result);

        // заменяем все буквы и слова на слово Java
        result = inputString.replaceAll("[a-zA-Z]+", "Java");
        System.out.println(result);

    }
}
