package Competitive_programming;

import java.util.Scanner;

public class Texi_problem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int[] group=new int[size];
        int sum=0;
        for (int index=0;index<size;index++){
            group[index]=scanner.nextInt();
        }
        for (int index=0;index<size;index++){
           sum+=group[index];
        }
        if(sum%4==0){
            System.out.println(sum/4);
        }

        else {
            int texi=(sum/4)+1;
            System.out.println(texi);
        }
    }
}
