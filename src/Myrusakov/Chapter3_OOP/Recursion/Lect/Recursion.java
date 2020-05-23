package Myrusakov.Chapter3_OOP.Recursion.Lect;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(5)); // 1*2*3*4*5 = 120

    }
    public static int factorial(int x){
        if(x ==1) return 1;
        if (x ==0) return 0;
        return factorial(x -1) * x;
    }
}
