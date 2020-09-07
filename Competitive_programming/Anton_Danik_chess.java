package Competitive_programming;

import java.util.Scanner;

public class Anton_Danik_chess {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int test=scanner.nextInt();
        scanner.nextLine();
        String input=scanner.nextLine();
        int countA=0;
        int countD=0;

//        long b=input.chars().filter(c->c=='D').count();
//        System.out.println(b);

        for (int index=0;index<test;index++){
            char ch=input.charAt(index);
            if(ch=='A'){
                countA++;
            }
            if(ch=='D'){
              countD++;
            }
        }
        if(countA>countD){
            System.out.println("Anton");
        }else if(countD>countA){
            System.out.println("Danik");
        }else {
            System.out.println("Friendship");
        }
    }
}
