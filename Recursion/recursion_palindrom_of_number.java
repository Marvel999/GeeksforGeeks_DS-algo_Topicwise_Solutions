package Recursion;

import java.util.Scanner;

public class recursion_palindrom_of_number {
    static int fact=0;
     public static void main(String[] args){

         Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
         int n=reverse(num);
         if(n==num){
             System.out.println("Yes");
         } else{
             System.out.println("No");
         }
     }
     public static int reverse(int n){

         if(n==0){
             return 0;
         }
         int rem=n%10;

         fact=fact*10+rem;
         reverse(n/10);
         System.out.println(fact);
        return fact;
     }
}
