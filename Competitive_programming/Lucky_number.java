package Competitive_programming;

import java.util.Scanner;

public class Lucky_number {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long input=scanner.nextLong();
        boolean flag=true;
        if (input<10){
            System.out.println("NO");
        }
        else {
        while (input!=0){
            long rem=input%10;
            input=input/10;
            if(rem!=7){
                if(rem!=4) {
                    flag=false;
                }

            }else if(rem!=4) {
                if(rem!=7) {
                    flag=false;
                }
            }
        }
        if(flag){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
        }
    }
}
