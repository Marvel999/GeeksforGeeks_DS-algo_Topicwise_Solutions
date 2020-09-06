package Competitive_programming;

import java.util.Scanner;

public class young_phy {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        int sum=0;
        boolean flage=false;

        int[][] matrix=new int[t][3];
        for(int row=0;row<t;row++){
            for(int col=0;col<3;col++){

               matrix[row][col]=scanner.nextInt();
            }
        }
        for(int col=0;col<3;col++){
        for(int row=0;row<t;row++){

                sum=sum+matrix[row][col];
            }
            if(sum!=0){
                System.out.println("NO");
                flage=true;
            }
        }

        if (!flage){
            System.out.println("YES");
        }

    }
}
