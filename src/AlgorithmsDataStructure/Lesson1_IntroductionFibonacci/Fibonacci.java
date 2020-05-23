package AlgorithmsDataStructure.Lesson1_IntroductionFibonacci;

import java.util.Scanner;

public class Fibonacci {
    // https://youtu.be/2kSx7wMAhcc
    // Чи́сла Фибона́ччи (иногда пишут Фибона́чи[2]) — элементы числовой последовательности
    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, …
    // (последовательность A000045 в OEIS),
    //в которой первые два числа равны либо 1 и 1, либо 0 и 1, а каждое последующее число равно сумме двух предыдущих чисел[3].
    public static void main(String[] args) {
        System.out.println(fibNaive(5));
        System.out.println(fibNaive(10));
        System.out.println(fibNaive(3));
        System.out.println(fibEffective(100));


    }
    // данный метод будет очень медленным (не применять)
    // Вычисление этим методом 100 числа фибаначчи занимает 50000 лет. Проблема в том что вычисления одних и тех же чисел
    // фибаначчи происходит много раз, так как каждый вызов метода порождает 2 дополнительных вызова
    private static long fibNaive(int n) { // аргумент n обозначает какое по счету число фибоначчи нужно получить
        if (n <= 1) return n; // Если передано 0 или 1 возвращаем эти значения

        return fibNaive(n - 1) + fibNaive(n - 2);
    }
    // эффективный метод
    private static long fibEffective(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        // теперь идем по массиву и складываем два предыдущих числа. Обратить внимание, что i начинается с 2. А также i <=n
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2] ;
        }
        return arr[n];
    }
}
