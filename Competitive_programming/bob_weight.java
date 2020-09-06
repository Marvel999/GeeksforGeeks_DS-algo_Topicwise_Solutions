package Competitive_programming;

import java.util.Scanner;

public class bob_weight {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int small=scanner.nextInt();
        int big=scanner.nextInt();
        boolean flag=true;
        int count=0;
        while (flag){
            small=small*3;
            big=big*2;
            count++;
            if (small>big){
                flag=false;
                break;
            }
        }
        System.out.println(count);
    }
}
