package Myrusakov.Chapter3_OOP.Lambda.Lect;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
// https://javarush.ru/groups/posts/845-lambda-vihrazhenija-na-primerakh
public class LambdaLect {
    public static void main(String[] args) {
        // Лямбда выражения предназначены для сокращения кода и улучшения его читаемости
        String[] arr = {"Hello", "Myworld", "1", "df", "sd"}; // отсортируем массив
        // Comparator сравнивает два объекта между собой и в зависимости от результата сравнения возначает значение
        // Создадим класс MyCompare в котором реализуем свой comparator
        Arrays.sort(arr, new MyCompare());
        for (String x : arr) System.out.print(x + " "); // Hello Myworld 1 df sd
        System.out.println();

        // Та же реализация с помощью lambda выражения. сортировка по убыванию
        // сначала идут передаваемые параметры. После -> идет вызываемый метод. Lambda можно использовать только для одного
        // нереализоывнного метода
        Arrays.sort(arr, (s1, t1) -> Integer.compare(t1.length(), s1.length()));
        for (String x : arr) System.out.print(x + " "); // 1 df sd Hello Myworld

        System.out.println();
        // Создадим экземпляр интерфейса List с помощью статического метода asList класса Arrays. List - Массив неограниченной длины
        List<String> arrNew = Arrays.asList("A", "AB", "ABC");
        // foreach является итератором перебирающим все данные. На каждой итерации передает 1 параметр (значение списка)
        arrNew.forEach((t) -> {
            System.out.println(t);
        });
        // или так. при этом используется ::
        arrNew.forEach(System.out::println);

        Integer[] intArr = {1,45,65,34,7,56,43,12,0,45,-97,-67,-78};
       // Arrays.sort(intArr,( s1,  t1) -> Integer.compare(t1, s1)); [65, 56, 45, 45, 43, 34, 12, 7, 1, 0, -67, -78, -97]
         Arrays.sort(intArr, Collections.reverseOrder());
        System.out.printf("Modified arr[] : %s", Arrays.toString(intArr));
    }
}
