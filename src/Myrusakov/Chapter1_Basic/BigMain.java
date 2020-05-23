package Myrusakov.Chapter1_Basic;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigMain {
    public static void main(String[] args) {
        double[] arr = {5.2, 4.1, 12.3, 76.494323, 43.232};
        double summa = 0;
        int i = 0;
        while (i < arr.length) {
            summa += arr[i];
            i++;

        }
        BigDecimal sum_big = new BigDecimal(summa).setScale(3,RoundingMode.HALF_UP);
//        sum_big.setScale(3, RoundingMode.HALF_UP);
        System.out.println(sum_big);
        System.out.println("-------------------------------------");
        for ( double a : arr ) {
            System.out.println(a);
        }
        System.out.println("-------------------------------------");
        double multiple = 1;
        for (double b : arr) {
            multiple *= b;
        }
        BigDecimal mul_big = new BigDecimal(multiple).setScale(3,RoundingMode.HALF_UP);
//        mul_big.setScale(3,RoundingMode.HALF_UP);
        System.out.println(mul_big);
        System.out.println("-------------------------------------");
    }
}
