package Myrusakov.Chapter3_OOP.Recursion.Exe;

public class RecursionExe {
    public static void main(String[] args) {
       // numbers(1);
        System.out.println();
        System.out.println(recursive(21));
    }
    public static int numbers (int x) {
        if (x ==101) return 0;
        System.out.print(x + " ");
        return numbers(x+1);
    }


    public static int recursive (int k) {
        if (k ==0) return 0;
        else return k%10 + recursive(k/10);

    }
}
