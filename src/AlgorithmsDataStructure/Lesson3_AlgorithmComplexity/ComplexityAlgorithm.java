package AlgorithmsDataStructure.Lesson3_AlgorithmComplexity;

import java.util.Arrays;

public class ComplexityAlgorithm {
    // оценка сложности алгоритма от меньшего к большему:
    // log n < sqrt(n) < n < n log n < n ^2 < 2^ n
    // log 100 = 6
    // sqrt(100) = 10
    // n = 100 = 100
    // 100 * log (100) = 600
    // 100 ^2 = 10000
    // 2 ^100 = 1267650600228229401496703205376
    static int n = 100;

    public static void main(String[] args) {
        System.out.println(fibNaive(10));
        System.out.println(fibEffective(100));
        long[] mem = new long[n + 1];
        Arrays.fill(mem, - 1);
        System.out.println(fibMemoization(100, mem));

    }
    // сложность данного алгоритма составляет O(2 ^n) что является крайне низким показателем
    public static long fibNaive (int n) {
        if (n <= 1) return n;
        return fibNaive(n -1) + fibNaive(n - 2);
    }
    // сложность данного алгоритма составляет O(n + n) => O(n) (константами можно пренебречь).
    // То есть алгоритм выполняется очень быстро при больших числах.
    // Время выполнения алгоритма одинаково для n = 100 и n = 1000 000 000 000
    public static long fibEffective(int n) {
        // инициализация массива занимает O(n)
        long[] arr = new long[n + 1];

        arr[0] = 0; // O(1)
        arr[1] = 1; //  O(1)
        // Количество итераций цикла растет линейно в зависимости от размера n. Сложность цикла в этом случае = O(n)
        // n = 4 => 4 итерации
        // n = 100 => 100 итераций
        for (int i = 2; i <= n; i++) arr[i] = arr[i - 1] + arr[i - 2];
        return arr[n]; // O(1)
    }
    public static long fibMemoization(int n, long[] mem) {
        if (mem[n] != -1) return mem[n];
        if (n <= 1) return n;
        long result = fibMemoization(n - 1, mem) + fibMemoization(n - 2 , mem);
        mem[n] = result;
        return result;
    }
}
