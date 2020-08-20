package Recursion;

import java.util.Scanner;

public class Length_of_String {
//    static int i=0;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
//        System.out.println(s.substring(1));
        System.out.println(count(s));
    }
    public static int count(String s){
        if(s.equals(""))
          return 0;

        return 1+count(s.substring(1));
    }
}
