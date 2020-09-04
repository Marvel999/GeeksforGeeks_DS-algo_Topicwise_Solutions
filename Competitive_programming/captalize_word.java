package Competitive_programming;

import java.util.Scanner;

public class captalize_word {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input_string= scanner.next();
        char first_latter=input_string.charAt(0);
        String modify_string=input_string.substring(1,input_string.length());
        System.out.println(Character.toString(first_latter).toUpperCase()+modify_string);
    }
}
