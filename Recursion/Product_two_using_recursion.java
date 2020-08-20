package Recursion;

import java.util.Scanner;

public class Product_two_using_recursion  {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        System.out.println(getProduct(x,y,0));
//        if(x<y)
//           System.out.println(printSeq(y,x));
//        else
//            System.out.println(printSeq(x,y));
    }
     public static int printSeq(int y,int x){
        if(x==0){
            return 0;
        }
        return y+printSeq(y,x-1);
     }



    public static int getProduct(int x, int y, int sum) {
        if(y == 0)
            return sum;
        return getProduct(x, y-1, sum + x);
    }

}
