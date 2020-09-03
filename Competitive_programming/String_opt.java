package Competitive_programming;

import java.util.Scanner;

public class String_opt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        String str=sc.nextLine();
        int size=str.length();
         if(size>=10){
            char first=str.charAt(0);
            char last=str.charAt(str.length()-1);
            size=size-2;

            System.out.println(Character.toString(first)+size+last);
        }else{
             System.out.println();
         }
    }
}
