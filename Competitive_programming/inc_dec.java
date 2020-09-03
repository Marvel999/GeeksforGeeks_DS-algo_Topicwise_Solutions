package Competitive_programming;

import java.util.Scanner;

public class inc_dec {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int test=scanner.nextInt();
        scanner.nextLine();
        int X=0;
        for (int i=0;i<test;i++){
            String op=scanner.next();
            if(op.charAt(0)=='+' ||op.charAt(op.length()-1)=='+')
                X++;

            else
                X--;
        }
        System.out.println(X);

    }
}
