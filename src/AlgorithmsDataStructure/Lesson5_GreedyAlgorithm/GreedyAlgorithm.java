package AlgorithmsDataStructure.Lesson5_GreedyAlgorithm;

import java.util.Arrays;

public class GreedyAlgorithm {
    // 3 техники создания алгоритмов:

    // 1) Жадные алгоритмы (Greedy algorithm)
    // 2) Принцип разделяй и властвуй (Divide and Conqueror)
    // 3) Динамическое программирование (Dynamic Programming)

    // Основная идея жадных алгоритмов: на каждом шаге алгоритма совершать локально оптимальные решения.
    // Последовательность локально оптимальных решений приводит (не всегда) к глобально оптимальному решению
    // Суть: разбиваем задачу на подзадачи. Для каждой из этих подзадач находим оптимальное решение

    // Пример: Дан неупорядоченный список цифр от 0 до 9. Необходимо составить из этих цифр наибольшее число
    // 317995 => 997531 (На каждом шаге выбирать наибольшую цифру, присоединять ее к результирующему числу,
    // удалять эту цифру из исходного массива
    public static void main(String[] args) {
        System.out.println(fibNaive(10));
        int n = 100;
        System.out.println(fibEffective(100));

        long[] mem = new long[n + 1];
        Arrays.fill(mem, -1);
        System.out.println(fibMemoization(100, mem));
        int[] digits = { 1, 9, 8, 9, 6, 3, 2};
        System.out.println(biggestNumber(digits));
    }

    public static long fibNaive(int n) {
        if(n <= 1) return n;
        return fibNaive(n - 1) + fibNaive(n - 2);
    }
    public static long fibEffective(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <=n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
    public static long fibMemoization( int n, long[] mem) {
        if (mem[n] != -1 )return mem[n];
        if (n <= 1) return n;
        long result = fibMemoization(n - 1, mem) + fibMemoization(n - 2, mem);
        mem[n] = result;
        return result;

    }
    public static StringBuilder biggestNumber (int[] number) {
        Arrays.sort(number);
        StringBuilder digit = new StringBuilder();
        for (int i = number.length -1; i >= 0; i--) {
            digit.append(number[i]);
        }
        return digit;
    }
}
