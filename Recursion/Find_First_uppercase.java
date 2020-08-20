package Recursion;

import java.util.Scanner;

public class Find_First_uppercase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(count(s));
    }
    public static char count(String s){

        if(s.equals(""))
            return 0;
        if(s.charAt(0) >= 65 && s.charAt(0) <= 90)
           return s.charAt(0);


        else
             return count(s.substring(1));

    }
}


// other approch return by ankit
//public class FirstUpperCase {
//
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        String s = scanner.nextLine();
//        printFirstUpper(s.toCharArray(), 0);
//
//    }
//
//    public static void printFirstUpper(char[] ch, int index) {
//        if(Character.isUpperCase(ch[index])) {
//            System.out.println(ch[index]);
//            return;
//        }
//
//        if(ch.length == index)
//            return;
//
//        printFirstUpper(ch, ++index);
//    }
//
//}
