package additionalInformation.sortArrays;

public class ArrayBubble {
    private long[] a; // ссылка на массив
    private int elems; // количество элементов в массиве

    public ArrayBubble (int max) { // конструктор класса
        a = new long[max]; // создание массива размером max
        elems = 0; // при создании массив содержит 0 элементов
    }
}
