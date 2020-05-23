package additionalInformation.JavaForBeginners;

public class BiilderString {
    //https://youtu.be/Vw2GPl3APD4
// тип данных String immutable
    public static void main(String[] args) {
        String x = "Hello"; // объект класса String. Все методы класса String не оперируют на строке на которой вызываются,
        // а создают копию этой строки
        x.toUpperCase(); // Все строчные буквы делает заглавными
        System.out.println(x); // Hello. строка не изменилась
        x = x.toUpperCase(); // переопределим строку. поместим новую строку, сформированную в результате вызова метода в строку x
        System.out.println(x); // HELLO.
        // Теперь на слово объект x со значение "hello" нет ссыллок. объект будет удален сборщиком мусора.
        // !!!нет так как первоначальная x уже инициализирована и имеет значение

        String string1 = "My";
        String string2 = " Sweet";
        String string3 = " Dream";
        String stringAll = string1 + string2 + string3; // При канкатенации string1 + string2 создается третья строка, которая
        // является объединением этих двух строк.  Новую строку канкатенируем со String3 и врезультате появляется еще одна
        // новая строка. При большом количестве канкатенаций падает скорость программы и растет расход оперативной памяти
        System.out.println(stringAll);

        // Чтобы избежать потерь производительности используется StringBuilder. Он является mutable
        StringBuilder sb = new StringBuilder("OriginValue"); // в конструктор передается строка или пустой конструктор
//    StringBuilder voidS = new StringBuilder();
        System.out.println(sb.toString()); // Для вывода строки используем метод toString
        sb.append(" New String"); // операция канкатенации. Так как тип mutable изменяется текущий объект а не создается копия
        System.out.println(sb.toString()); // Для вывода строки используем метод toString
        sb.append(" one ").append("two ").append("three ").append(12); // Вызов методов по цепочке Method Chaining
        // append возвращает тот же объект на котором вызывается (StringBuilder)
        System.out.println(sb.toString()); // OriginValue New String one two three 12
        // при большом количестве канкатенаций использовать StringBuilder
    }
}
