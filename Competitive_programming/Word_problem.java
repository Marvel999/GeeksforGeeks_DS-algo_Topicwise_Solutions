package Competitive_programming;

import java.util.Scanner;

public class Word_problem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word=scanner.nextLine();
        int upperCount=0;
        int lowerCount=0;
        for (int index=0;index<word.length();index++){
            char ch=word.charAt(index);
            if(Character.isUpperCase(ch))
                upperCount++;
            else
                lowerCount++;

        }
        if(upperCount<=lowerCount)
            word=word.toLowerCase();
        else
            word=word.toUpperCase();

        System.out.println(word);
    }
}
