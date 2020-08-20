package Recursion;

import java.util.Scanner;

public class Constant_in_String {
//   static int l=1;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        System.out.println(count(s));
    }
    public static int count(String s){

        if(s.equals(""))
            return 0;
        if(s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)=='u'||s.charAt(0)==' ')
            return 0+count(s.substring(1));
        else
          return 1+count(s.substring(1));

    }
}
