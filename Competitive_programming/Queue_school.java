package Competitive_programming;

import java.util.Scanner;

public class Queue_school {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int test=sc.nextInt();
        sc.nextLine();
        String row=sc.nextLine();
        boolean flage=true;
        while (test-->0)
            row=row.replace("BG","GB");
        System.out.println(row);
        }

    }

