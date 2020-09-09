package Array;

import java.util.Scanner;

public class word_revrse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
           String s=scanner.nextLine();
           String[] arr=s.split(" ");
           System.out.println(arr.length);
           String rev="";
           for (int i=(arr.length-1);i>=0;i--){
               rev +=arr[i]+" ";
           }
           System.out.println(rev);
    }
}
