package Myrusakov.Chapter5_GeneralClasses.Lesson2_Math.Lect;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ObjectMath {
    public static void main(String[] args) {
        // класс Math содержит большое количество статических методов, не требующих создание объекта класса
        System.out.printf("Число E = %.5f\n",Math.E); // Число E = 2,71828 Константа числа E с округлением до 5 символов
        System.out.printf("Число PI = %.5f\n", Math.PI);

        System.out.println(Math.abs(-12)); // OUT: 12. Возвращет модуль числа

        System.out.println(Math.cos(1)); // 0.5403023058681398 Косинус в радианах
        System.out.println(Math.sin(1)); // 0.8414709848078965 Синус
        System.out.println(Math.tan(1)); // 1.5574077246549023  Тангенс
        System.out.println(Math.sin(30 * Math.PI / 180)); // Синус 30 градусов в радианах

        System.out.println(Math.max(1,10)); // принимает 2 числа. Возвращает большее OUT: 10
        System.out.println(Math.min(1,10)); // принимает 2 числа. Возвращает меньшее OUT: 1

        System.out.println(Math.pow(5,2)); // pow возводит первый параметр в степень = второму передаваемому параметру

        System.out.println(Math.round(5.6784)); // OUT: 6. Округление до целого числа по математическим правилам
        System.out.println(Math.ceil(5.1)); // OUT: 6 округляет до ближайшего большего целого
        System.out.println(Math.floor(5.9)); // OUT: Округление до ближайшего меньшего целого. Отбрасывание дробной части

        // Округление числа до произвольного количества знаков после запятой
        // используем класс BigDecimal
        BigDecimal bd = new BigDecimal(5.343543);
        System.out.println(bd.setScale(3, RoundingMode.HALF_UP)); // OUT: 5.344 округление по правилам математики
        // до трех знаков после запятой
        System.out.println(new BigDecimal(6.45432).setScale(4, RoundingMode.HALF_UP)); // OUT: 6.4543

        System.out.println(Math.random()); // генерация случайного числа от 0 до 1. OUT: 0.37803159928784325

        double a = Math.random() *11; // генерация рандомного числа от 0 до 10
        System.out.println(a); // 10.440782110507147
        int i = (int) a; // явное приведение типа с отбрасыванием целой части
        System.out.println(i);
        System.out.println((int) (Math.random()* 101));
        System.out.println((int)(1 + Math.random() * 10)); // выводятся числа от 1 до 10

    }
}
