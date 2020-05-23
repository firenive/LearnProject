package AlgorithmsDataStructure.Test;

import java.util.Arrays;

public class Test {
    static int n = 100;

    public static void main(String[] args) {
        System.out.println(fibNaive(10));
        System.out.println(fibEffective(100));
        long[] mem = new long[n + 1];
        Arrays.fill(mem, - 1);
        System.out.println(fibMemoization(100, mem));

    }

    public static long fibNaive (int n) {
        if (n <= 1) return n;
        return fibNaive(n -1) + fibNaive(n - 2);
    }

    public static long fibEffective(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) arr[i] = arr[i - 1] + arr[i - 2];
        return arr[n];
    }
    public static long fibMemoization(int n, long[] mem) {
        if (mem[n] != -1) return mem[n];
        if (n <= 1) return n;
        long result = fibMemoization(n - 1, mem) + fibMemoization(n - 2 , mem);
        mem[n] = result;
        return result;
    }
}
