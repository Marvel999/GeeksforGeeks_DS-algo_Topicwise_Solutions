package Competitive_programming;

import java.util.Scanner;

public class next_round {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rounds= scanner.nextInt();
        int wins=0;
        boolean flag=false;
        int possion=scanner.nextInt();
        int[] score=new int[rounds];
        for (int round=0;round<rounds;round++){
            score[round]=scanner.nextInt();
        }
        int passing_score=score[possion-1];

        for (int round_score=0;round_score<score.length;round_score++){
                  if(score[round_score]==0) {

                 }
                else if(score[round_score]>=passing_score)
                    wins=wins+1;


        }
        System.out.println(wins);

    }
}
