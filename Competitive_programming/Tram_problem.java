package Competitive_programming;

import java.util.Scanner;

public class Tram_problem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int test=scanner.nextInt();
        int sum=0;
        int exceed=0;
        for (int i=0;i<test;i++){
            int first=scanner.nextInt();
            int second=scanner.nextInt();
            sum=sum-first;
            sum=sum+second;
             exceed=Math.max(exceed,sum);

        }
        System.out.println(exceed);
    }
}
