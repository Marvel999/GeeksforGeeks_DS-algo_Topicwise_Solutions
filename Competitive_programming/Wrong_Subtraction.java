package Competitive_programming;

import java.util.Scanner;

public class Wrong_Subtraction {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int test=scanner.nextInt();
        for(int i=0;i<test;i++){
            if(number%10==0){
                number=number/10;
            }else {
                number=number-1;
            }
        }
        System.out.println(number);
    }
}
