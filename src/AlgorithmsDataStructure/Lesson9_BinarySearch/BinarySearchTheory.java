package AlgorithmsDataStructure.Lesson9_BinarySearch;

public class BinarySearchTheory {
    // https://youtu.be/074rf3JuLiE
    public static void main(String[] args) {
        int[] arr = {10, 12, 34, 23, 87, 34, 95};
        System.out.println(lineSearch(arr, 100));
    }
    // Линейный поиск
    // Ввод: Массив A, состоящий из n элементов и значение k, которое мы ищем в массиве
    // Вывод: индекс i, Такой что A[i] = k, Если такого i нет, то возвращаем -1 (Если элементов A[i] = k несколько, то
    // вернуть любой из них, например первый)
    public static int lineSearch(int[] a, int k) {
        for (int x = 0; x < a.length; x++) {
            if (a[x] == k ) return x;
        }
        return -1;
    }

    // Бинарный поиск
    // Алгоритм поиска числа K в отсортированном массиве
    // Смотрим число в центре. Если оно больше k рассматриваем левый подмассив. Если число меньше k рассматриваем правый
    // подмассив. Если оно = k, число найдено возвращаем его индекс. Повторяем пока подмассив не пустой
    // сложность алгоритма = O(log n), что является очень быстрым показателем. массив из 50000 элементов будет отсортирован
    // за 16 итераций
    public static int binarySearch(int[] arr, int key) { // key - тот элемент который ищем
        int low = 0; // первый элемент в массиве
        int high = arr.length - 1; // последний элемент в массиве
        while (low <= high) { // условие false, Если в массиве нет этого числа, подмасивы пустые
            int mid = low + (high - low) / 2; // центральный элемент в массиве
            if (key < arr[mid]) {
                high = mid - 1;
            } else if (key > arr[mid]) {
                low = mid +1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
// реализация с помощью рекурсии
