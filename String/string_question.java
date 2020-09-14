package String;

import java.util.Scanner;

public class string_question {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int k=scanner.nextInt();
        scanner.nextInt();
        String num=scanner.nextLine();
        System.out.println(removeKdigits(num,k));
    }
    public static String removeKdigits(String num, int k) {
     String out="";

     if(k>1){
         char ch=num.charAt(1);
         out=num.substring(k);
         out=out+ch;
         int outer=Integer.parseInt(out);
         out=Integer.toString(outer);
     }else {
     out=num.substring(1);
     int out1=Integer.parseInt(out);
     out=Integer.toString(out1);
     }
     return  out;
    }
}
