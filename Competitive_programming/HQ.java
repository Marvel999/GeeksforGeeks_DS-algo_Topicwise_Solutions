package Competitive_programming;

import java.util.Scanner;

public class HQ {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        if(str.contains("H")){
            System.out.println("YES");
        }
        else if(str.contains("Q")){
            System.out.println("YES");
        }
        else if(str.contains("9")){
            System.out.println("YES");
        }
        else if(str.contains("+")){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
