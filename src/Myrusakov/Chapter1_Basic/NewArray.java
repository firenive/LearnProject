package Myrusakov.Chapter1_Basic;

public class NewArray {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        arr[0][0] = 10;
        arr[0][1] = 15;
        arr[0][2] = 94;

        arr[1][0] = 28;
        arr[1][1] = 7;
        arr[1][2] = 42;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
        int new_sum;
        int[] new_arr = new int[2];

        for (int i = 0; i < arr.length; i++) {
            new_sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                new_sum+= arr[i][j];
                new_arr[i] = new_sum;
            }
        }
        for (int a : new_arr) {
            System.out.println(a);
        }
    }
}
