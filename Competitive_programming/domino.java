package Competitive_programming;

import java.util.Scanner;

public class domino {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int breath=sc.nextInt();
        int hight=sc.nextInt();
        int number_ofdomino=(breath*hight)/2;
        System.out.println(number_ofdomino);

    }
}
