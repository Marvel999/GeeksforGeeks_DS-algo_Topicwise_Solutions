package Competitive_programming;

import java.util.Scanner;

public class banana_problem {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int sum=0;
        int rupess=scanner.nextInt();
        int money=scanner.nextInt();
        int number=scanner.nextInt();
        for (int index=1;index<=number;index++){
            sum +=index*rupess;
        }
        if(sum>money)
        System.out.println(sum-money);
        else
            System.out.println("0");
    }
}
