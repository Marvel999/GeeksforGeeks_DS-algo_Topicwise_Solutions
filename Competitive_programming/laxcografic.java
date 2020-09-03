package Competitive_programming;

import java.util.Scanner;

public class laxcografic {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.next().toLowerCase();
        String second_input=scanner.next().toLowerCase();
        int num=input.compareTo(second_input);
        if(num!=0){
            num=num<0?-1:1;
            System.out.println(num);
        }else{
            System.out.println("0");
        }
//        if(input.compareTo(second_input)<0)
//            System.out.println(-1);
//        else if(input.compareTo(second_input)==0)
//            System.out.println(0);
//        else
//            System.out.println(1);
//
    }
}
