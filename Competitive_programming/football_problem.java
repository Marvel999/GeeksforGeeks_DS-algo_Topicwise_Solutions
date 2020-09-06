package Competitive_programming;

import java.util.Scanner;

public class football_problem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String team_depicted=scanner.nextLine();
        int count_zero =0;
        int count_one=0;
        boolean flage=false;
        for(int index=0;index<team_depicted.length();index++){
            char ch=team_depicted.charAt(index);
            if(ch=='1'){
                count_one++;
            }else {
                count_one=0;
            }
            if(ch=='0'){
                count_zero++;
            }else {
                count_zero=0;
            }

            if(count_zero==7 || count_one==7){
                System.out.println("YES");
                flage=true;
                break;
            }
        }

        if(!flage){
            System.out.println("NO");
        }

    }
}
