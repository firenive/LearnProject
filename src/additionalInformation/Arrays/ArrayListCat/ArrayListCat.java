package additionalInformation.Arrays.ArrayListCat;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCat {
    // https://javarush.ru/groups/posts/klass-arraylist
    // https://habr.com/ru/post/128269/
    public static void main(String[] args) {
        // ArrayList является автоматически расширяемым
        // Когда этот внутренний массив заполняется, ArrayList создает внутри себя новый массив.
        // Его размер = (размер старого массива * 1,5) +1.
        // Все данные копируются из старого массива в новый
        // Старый массив удаляется сборщиком мусора.

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Бегемот")); // добавление нового элемента. элементы добавляются в конец списка
        Cat thomas = new Cat("Томас");
        Cat philipp = new Cat("Филлип Маркович");
        Cat pushok = new Cat("Пушок");

        cats.add(thomas);
        cats.add(philipp);
        cats.add(pushok);
        // Мы передаем в него ссылку на нужный объект, и indexOf() возвращает нам его индекс
        int thomasIndex = cats.indexOf(thomas);
        System.out.println(thomasIndex); // 1

        // поиск элемента по индексу. Метод get()
        Cat fourthCat = cats.get(3);
        System.out.println(fourthCat); // Пушок

        cats.remove(pushok); // удаление объекта. принимает сам объект или его индекс
        System.out.println(cats.contains(pushok)); // проверка на нахождение объекта в массиве, false

        // ArrayList позволяет вставлять данные не только в конец массива, но и в любую ячейку по индексу.
        cats.add(1, pushok); // add() сначала сдвигает все элементы начиная с [index] к концу массива,
        // а в образовавшуюся пустую ячейку добавляет нужный тебе объект.

        cats.set(0, new Cat("Крокодил")); // вставка через set() затирает старое значение, хранящееся в ячейке.
        for(Cat c : cats) System.out.print(c + " "); // Крокодил Пушок Томас Филлип Маркович

        // cats.clear(); // полная очистка списка
        System.out.println("\n----------------");

        //  отличие от массивов, в ArrayList метод toString() переопределен и сразу выводит список в формате строки.
        System.out.println(cats.toString()); // [Крокодил, Пушок, Томас, Филлип Маркович]

        // в Java можно легко “переключаться” между массивом и ArrayList, то есть преобразовывать одно к другому.
        // В классе Arrays для этого есть метод Arrays.asList(). С его помощью мы получаем содержимое массива в виде
        // списка и передаем его в конструктор нашего ArrayList:

        Cat[] catsArray = {thomas, pushok, philipp};
        ArrayList<Cat> cats2 = new ArrayList<>(Arrays.asList(catsArray));
        System.out.println(cats2); // [Томас, Пушок, Филлип Маркович]

        // Можно сделать и наоборот — получить массив из объекта ArrayList. Для этого используется метод toArray():

        System.out.println("----------------");
        // нужно выделить место в памяти для хранения массива. Это делается с помощью new Cat[]
        Cat[] catsArray2 = cats2.toArray(new Cat[0]);
        for (Cat c: catsArray2) System.out.print(c + " ");
        // Обрати внимание: в метод toArray() мы передали пустой массив. Это не ошибка. Внутри класса ArrayList данный
        // метод реализован таким образом, что передача пустого массива увеличивает его производительность. Пока просто
        // запомни это на будущее (но передать какой-то конкретный размер тоже можно, будет работать).

        System.out.println("\n" + cats2.size()); // текущий размер списка = 3
        // в отличии от свойства length массива, метод ArrayList.size() возвращает именно число элементов, а не
        // изначальную вместимость, ведь ее мы при создании ArrayList не указываем.



    }
}
