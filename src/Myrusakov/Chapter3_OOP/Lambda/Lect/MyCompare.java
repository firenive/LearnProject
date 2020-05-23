package Myrusakov.Chapter3_OOP.Lambda.Lect;

import java.util.Comparator;

public class MyCompare implements Comparator<String> {// наследуем интерфейс Comparator, указывая для него тип данных String
    @Override // реализовываем из него метод compare
    public int compare(String s, String t1) {
        return Integer.compare(s.length(), t1.length()); // Integer.compare сравнивает 2 целых числа. Сравнивать будем длину строк
        // the value 0 if x == y; a value less than 0 if x < y; and a value greater than 0 if x > y
        // без указания implements Comparator<String> мы не смогли бы использовать length()
    }
}
