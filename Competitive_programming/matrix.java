package Competitive_programming;

import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[][] matrix=new int[5][5];
        int ter_row=0;
        int ter_col=0;
        for (int row=0;row<5;row++){
            for (int col=0;col<5;col++){
             matrix[row][col]=scanner.nextInt();
             if(matrix[row][col]==1){
                 ter_col=col;
                 ter_row=row;
             }
            }
        }
       System.out.println( Math.abs(ter_col-2)+Math.abs(ter_row-2));
            }
}
