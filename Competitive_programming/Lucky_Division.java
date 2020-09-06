package Competitive_programming;

import java.util.Scanner;

public class Lucky_Division {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();
        boolean flag=false;
        if(input%4==0 && input%7==0){
            System.out.println("YES");
        }
        else {
            while (input!=0){
                int rem=input%10;

                if (rem==7 || rem==4){
                    input=input/10;
                }else
                { System.out.println("NO");
                    flag=true;
                    break;
                }
            }
            if (!flag)
                System.out.println("YES");
        }
    }
}