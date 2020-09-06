package Competitive_programming;

import java.util.HashSet;
import java.util.Scanner;

public class Boy_Girl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        HashSet<Character> hs = new HashSet<>();
        for (int index = 0; index < input.length(); index++) {
            char ch = input.charAt(index);
            hs.add(ch);
        }
        int size=hs.size();
        if(size%2==0)
            System.out.println("CHAT WITH HER!");
        else
        System.out.println("IGNORE HIM!");
    }
}
