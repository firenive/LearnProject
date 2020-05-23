package Myrusakov.Chapter3_OOP.Static.Exe;

public class CheckStatic {
    public static void main(String[] args) {
        int number1 = 56;
        int number2= 14;
        System.out.println(MyMath.getCount());
        System.out.println("------------------------");

        System.out.println(MyMath.add(number1, number2));
        System.out.println(MyMath.sub(number1, number2));
        System.out.println(MyMath.mult(number1, number2));
        System.out.println(MyMath.div(number1, number2));
        System.out.println("------------------------");
        System.out.println(MyMath.getCount());
    }
}
