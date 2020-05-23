package additionalInformation.Arrays;

import java.util.Arrays;

public class someMethodArrays {
    public static void main(String[] args) {
        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};

        // копирование массива с помощью цикла
        int[] numbersCopy = new int[10];
        int j = 0;
        for (int x :numbers) {
            numbersCopy[j] = x;
            j++;
        }
        System.out.println(Arrays.toString(numbersCopy));
        // копирование методом copyOf
        int[] numbersCopy1 = Arrays.copyOf(numbers, numbers.length);
        // В метод Arrays.copyOf() мы передаем наш оригинальный массив (из которого надо скопировать значения) и длину
        // нового массива, в который мы копируем данные. В данном случае в качестве длины мы указали numbers.length,
        // т.к. хотим скопировать массив целиком. Если же мы хотим скопировать только несколько первых элементов, можно
        // указать длину для нового массива меньше:

        // копируем часть массива
        int[] numbersRange = Arrays.copyOfRange(numbers, 2, 6);
        // скопированы числа из ячеек со второй (включительно) по шестую (не включительно).
        System.out.println(Arrays.toString(numbersRange));

        // сравнение содержимого массива
        int[] x = {1, 2, 3};
        int[] x1 = {1,2,3};
        System.out.println(x.equals(x1)); // false, так как сравнивает ссылки
        System.out.println(Arrays.equals(x, x1)); // true. Сравнивает значение

        // многомерные массивы
        int[][] numbersDeep = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int[][] numbersCopyDeep = Arrays.copyOf(numbersDeep, numbersDeep.length);

        System.out.println("Равны ли эти двумерные массивы между собой?");
        System.out.println(Arrays.deepEquals(numbersDeep, numbersCopyDeep)); // true

        System.out.println(Arrays.deepToString(numbersCopyDeep)); // [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

    }

}
