package Exceptions.Lesson1.Lect;

public class OneMoreExample {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5};
        // System.out.println(x[5]); // ArrayIndexOutOfBoundsException
        try {
            System.out.println(x[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Элемента с таким индексом не существует");
            System.out.println(e);
        } finally {
            System.out.println("Завершение программы");
        }
    }
}
