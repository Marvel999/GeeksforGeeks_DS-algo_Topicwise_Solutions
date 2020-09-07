package Array;

import java.util.Scanner;

public class Lucky_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean b=isDivision(num);
        if(b){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
    public static boolean isDivision(int num) {

        if (num % 4 == 0 || num % 7 == 0 || num % 47 == 0) return true;

        String number = String.valueOf(num);
        number = number.replaceAll("7", "");
        number = number.replaceAll("4", "");

        return number.length() == 0;

    }
}
