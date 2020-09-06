package Competitive_programming;

import java.util.Scanner;

public class stone_problem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int test=scanner.nextInt();
        scanner.nextLine();
        String input_string=scanner.nextLine();
        int remove=0;
        for(int index=0;index<input_string.length()-1;index++){
            char first =input_string.charAt(index+1);
            char second =input_string.charAt(index);
            if(first==second)
                remove++;

        }

            System.out.println(remove);


    }
}
