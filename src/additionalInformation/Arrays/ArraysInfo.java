package additionalInformation.Arrays;

public class ArraysInfo {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4, 5},
                {4, 6},
                {7, 8, 9}};
        System.out.println(matrix[2][2]); // первое число отвечает за строку.Второе число отвечает за столбец
        System.out.println(matrix[1][0]);

        String[][] strings = new String[2][3];
        strings[0][1] = "Hello";
        System.out.println(strings[0][1]);
        int[][] out = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
    }
}
