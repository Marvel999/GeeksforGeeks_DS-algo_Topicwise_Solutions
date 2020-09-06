package Competitive_programming;

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        String input_revrse=scanner.nextLine();
        String revrse_input="";
        for (int index=input.length()-1;index>=0;index--){
            char ch=input.charAt(index);
            revrse_input=revrse_input+ch;
        }
        if(input_revrse.equals(revrse_input)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
