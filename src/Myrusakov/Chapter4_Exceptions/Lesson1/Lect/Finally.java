package Exceptions.Lesson1.Lect;

public class Finally {
    public static void main(String[] args) {
        int[] x = {112,56,67,78,98,67,45};
        try {
            System.out.println(x[7]);
        } catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println("указанный элемент находится вне границ массива");
            System.out.println(e);
        } finally { // блок finally выполняется в любом случае независио от того было выброшено исключение или нет
            System.out.println("программа завершилась");

        }
    }
}
