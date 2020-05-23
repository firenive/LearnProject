package Myrusakov.Chapter1_Basic;

public class Massive {
    public static void main(String[] args) {
        char[][] arr = new char[2][2];
        arr[0][0] = 'a';
        arr[0][1] = 'b';
        arr[1][0] = 'c';
        arr[1][1] = 'd';
        int[][] matrice = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }



        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(" Элемент с индексом " + i + " " + j + " = " + arr[i][j]);
            }
        }
        System.out.println("---------------------------------------");
        int[][] table = new int[10][9];
        for (int i = 1; i < table.length; i++) {
            System.out.println("    ");
            for (int j = 1; j <= table[i].length; j++) {
                System.out.print( "  " + i + " x " + j + " = " + (i*j) );
            }
        }
        }
    }
