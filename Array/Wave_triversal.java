package Array;

import java.util.Scanner;

public class Wave_triversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] mat = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        boolean b = true;
        if (mat.length == 0) {
            return;
        } else {
            for (int i = 0; i < mat[0].length; i++) {
                if (b) {
                    for (int j = 0; j < mat.length; j++) {
                        System.out.print(mat[j][i] + " ");

                    }
                    b = false;
                } else {
                    for (int j = (mat.length - 1); j >= 0; j--) {
                        System.out.print(mat[j][i] + " ");
                    }
                    b = true;
                }
//            System.out.println();
            }
        }
    }
}
