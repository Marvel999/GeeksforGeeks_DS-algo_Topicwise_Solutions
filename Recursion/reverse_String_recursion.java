package Recursion;

import java.util.Scanner;

public class reverse_String_recursion {
    public static void main(String[] args){
        Scanner  sc=new Scanner(System.in);
        String s=sc.nextLine();
        reverse(s);
    }
    public static void reverse(String s){
        if((s==null) || (s.length()<=1) ) {
            System.out.println(s);
            return;
        }
           System.out.print(s.charAt(s.length()-1));
            reverse(s.substring(0,s.length()-1));
        }

}
