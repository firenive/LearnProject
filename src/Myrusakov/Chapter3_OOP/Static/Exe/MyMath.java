package Myrusakov.Chapter3_OOP.Static.Exe;

public class MyMath {
    private static int count = 0;
    public static int getCount() {
        return count;
    }

    public static int add(int a, int b) {
        count++;
        return a + b;
    }

    public static int sub(int a, int b) {
        count++;
        return a - b;
    }

    public static int mult(int a, int b) {
        count++;
        return a * b;
    }

    public static int div(int a, int b) {
        count++;
        return a / b;
    }
}
