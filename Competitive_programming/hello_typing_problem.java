package Competitive_programming;

import java.util.Scanner;

public class hello_typing_problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(scan.nextLine().matches(".*h.*e.*l.*l.*o.*") ? "YES" : "NO");
    }
}
