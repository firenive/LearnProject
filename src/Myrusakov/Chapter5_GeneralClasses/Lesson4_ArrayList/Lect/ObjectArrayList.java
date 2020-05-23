package Myrusakov.Chapter5_GeneralClasses.Lesson4_ArrayList.Lect;

import java.util.ArrayList;
import java.util.Comparator;

public class ObjectArrayList {
    public static void main(String[] args) {
        // ArrayList является массивом с неограниченной длиной
        ArrayList<Integer> arr = new ArrayList<Integer>(); // определение конкретного типа параметров = Integer
        // ArrayList all = new ArrayList(); можно не указывать тип параметров, но не сможете использовать типовые методы

        for (int i = 0; i< 10; i++) {
            int n = (int) (1 + Math.random() * 10); // заполняем массив десятью случайными числами от 1 до 10
            arr.add(n);
        }
        arr.forEach(System.out::println);
        System.out.println("--------------");
        System.out.println(arr.get(3)); // получаем значение массива с указанным индексом
        System.out.println("--------------");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        System.out.println(arr.contains(5)); // возвращает true если элемент есть в массиве
        System.out.println(arr.indexOf(6)); // возвращает индекс первого вхождения указанного элемента. иначе возвращает -1
        System.out.println(arr.size()); // размер
        System.out.println(arr.remove(3)); // удаляет элемент с указанным индексом
        System.out.println(arr.remove(Integer.valueOf(7))); // удаляет указанный элемент по значению
        arr.set(4, 56); // изменяет значение элемента с индексом (первый параметр) на указанное значение (второй параметр)
        arr.forEach((s) -> System.out.print(s + " "));
        System.out.println();
        System.out.println(arr.size());
        // сортировка массива
        arr.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
                // если o1 > o2 вернется положительное число, Если o1 <02 вернется отрицательное число, иначе 0
                // на основании этого выполняется сортировка по возрастанию. для сортировки по убыванию меняем местами o1, o2
            }
        });
        arr.forEach((s) -> System.out.print(s + " ")); // 1 1 3 4 4 7 10 56


    }
}
