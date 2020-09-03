package Competitive_programming;

import java.util.Scanner;

public class three_fiends_problem {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  numberTime=0;
        int test=sc.nextInt();
        for (int i=0;i<test;i++){
        int Petya=sc.nextInt();
        int Vasya=sc.nextInt();
        int Tonya=sc.nextInt();
        int score=Petya+Vasya+Tonya;
        if(score>=2)
            numberTime=numberTime+1;

        }

        System.out.println(numberTime);
    }

}
