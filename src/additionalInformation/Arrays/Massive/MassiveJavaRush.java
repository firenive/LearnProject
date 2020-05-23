package additionalInformation.Arrays.Massive;

import java.util.Arrays;

public class MassiveJavaRush {
    // https://javarush.ru/groups/posts/massivy-java
    public static void main(String[] args) {
        // Массив — это структура данных, в которой хранятся элементы одного типа.
        // объявление массива
        int[] intArray;
        Object[] arrayObject;
        // Обычно массив сначала объявляют, а потом создают, например:
        int[] myArray; // объявление
        myArray = new int[10]; // создание, то есть, выделение памяти для массива на 10 элементов типа int

        int[] myArray2 = new int[10]; // объявление и выделение памяти
        // После создания массива с помощью new, в его ячейках записаны значения по умолчанию. Для численных типов
        // (как в нашем примере) это будет 0, для boolean — false, для ссылочных типов — null.

        System.out.println(myArray2.length); // объявленная длина массива = 10

        // Получаем доступ к элементу массива (то есть записываем в него значение или выводим его на экран или проделываем
        // с ним какую-либо операцию) мы по его индексу.
        //Инициализация массива — это заполнение его конкретными данными (не по умолчанию).

        /*String[] seasons = new String[4];
        seasons[0] = "Winter";
        seasons[1] = "Spring";
        seasons[2] = "Summer";
        seasons[3] = "Autumn";*/
        // или
        String[] seasons = {"Winter", "Spring", "Summer", "Autumn"};
        for (String s: seasons) System.out.print(s + " "); // Winter Spring Summer Autumn
        System.out.println("\n" + seasons.length); // 4


        // многомерные массивы
        int[][] myTwoDimentionalArray = new int[8][8]; // массив содержит в себе 64 элемента. по умолчанию 0
        for (int[] i: myTwoDimentionalArray) {
            System.out.println();
            for (int x : i) System.out.print(" " + x);
        }
        System.out.println("\n--------------------");

        // сортировка массива
        // Метод void sort(int[] myArray, int fromIndex, int toIndex) сортирует массив целых чисел или его подмассив по возрастанию.
        int[] forSorting = {0,5,6,96,43,12,4,6,79,88,100,0001};

        Arrays.sort(forSorting); // сортировка массива.
        for (int x : forSorting) System.out.print(x + " "); // 0 1 4 5 6 6 12 43 79 88 96 100
        System.out.println("\n----------------");

        // int binarySearch(int[] myArray, int fromIndex, int toIndex, int key). Этот метод ищет элемент key в уже
        // отсортированном массиве myArray или подмассиве, начиная с fromIndex и до toIndex. Если элемент найден, метод
        // возвращает его индекс, если нет - (-fromIndex)-1.
        System.out.println(Arrays.binarySearch(forSorting, 96)); // 10


        // преобразование массива в строку
        String stringArray = Arrays.toString(forSorting);
        System.out.println(stringArray); // [0, 1, 4, 5, 6, 6, 12, 43, 79, 88, 96, 100]

        // второй способ. используется StringBuilder поскольку является mutable
        StringBuilder builder = new StringBuilder();
        for(String s : seasons) {
            builder.append(s);
        }
        String str = builder.toString(); // преобразование StringBuilder к String
        System.out.println(builder); // WinterSpringSummerAutumn
        System.out.println(str); // WinterSpringSummerAutumn

        // 3 способ. используется join, в качестве разделителя используем |
        String str1 = String.join(" | ", seasons);
        System.out.println(str1); // Winter | Spring | Summer | Autumn

        String joinedString  = String.join("-",  new String[]{"a", "b", "1"});
        System.out.println(joinedString);  // a-b-1


    }
}
