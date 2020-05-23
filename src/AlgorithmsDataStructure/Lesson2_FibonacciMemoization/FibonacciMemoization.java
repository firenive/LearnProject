package AlgorithmsDataStructure.Lesson2_FibonacciMemoization;

import java.util.Arrays;

public class FibonacciMemoization {
    // https://youtu.be/QlY5BGOhMKk

    public static void main(String[] args) {
        int n = 100;
        long[] mem = new long[n + 1]; // для сохранения результатов используем массив
        Arrays.fill(mem, -1); // заполняет массив указанным значением (-1)
        System.out.println(fibNaive(n, mem)); // он передается в качестве второго элемента
        System.out.println(fibEffective(100));
    }


    private static long fibNaive(int n, long[] mem) {
        // запоминаем с какими параметрами был вызов метода fibNaive(). Если был вызов с такими параметрами
        // используем сохраненное значение

        if (mem[n] != -1)
            return mem[n]; // -1 означает что массив с таким параметром n еще не вызывали. выполняем кода дальше
        // если же в массиве уже хранится значение вызова с переданным параметром n подставляем его
        if (n <= 1) return n;

        long result = fibNaive(n - 1, mem) + fibNaive(n - 2, mem);
        mem[n] = result;
        return result;
    }

    private static long fibEffective(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];

        }
        return arr[n];
    }

}

// Вычисление этим методом 100 числа фибаначчи занимает 50000 лет. Проблема в том что вычисления одних и тех же чисел
// фибаначчи происходит много раз

// для устранения этого недостатка применим технику мемоизации:
// мемоизация - сохранение результатов выполнения функций для предотвращения повторных вычислений.
//  Перед вызовом функции проверяется, вызывалась ли функция ранее:
//если не вызывалась, то функция вызывается, и результат её выполнения сохраняется;
//если вызывалась, то используется сохранённый результат.
