package Competitive_programming;

import java.util.Scanner;

public class squere_problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long big_breath=sc.nextInt();
        long big_height=sc.nextInt();
        long small_breath=sc.nextInt();
        long small_height=small_breath;
        long b_num=0;
        long h_num=0;

        if(small_breath*small_height<=big_breath*big_height){
            if(big_breath%small_breath!=0)
                b_num=big_breath/small_breath+1;
            else
                b_num=big_breath/small_breath;
            if(big_height%small_height!=0)
                h_num=big_height/small_height+1;
            else
                h_num=big_height/small_height;

            System.out.println("Total Number of rectangel="+h_num*b_num);
        }else {
            System.out.println("1");
        }
    }
}


//    Scanner scanner = new Scanner(System.in);
//    int n = scanner.nextInt();
//    int m = scanner.nextInt();
//    int a = scanner.nextInt();
//
//    int nSides = n % a == 0 ? n / a : n / a + 1;
//    int mSides =  m % a == 0 ? m / a : m / a + 1;
//
//    int totalStones = nSides * mSides;
//        System.out.println(totalStones);