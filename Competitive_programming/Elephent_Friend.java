package Competitive_programming;

import java.util.Scanner;

public class Elephent_Friend {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int friends_location=scanner.nextInt();
        if(friends_location<=1){
            System.out.println(1);
        }
        else if(friends_location<=2){
            if(friends_location%2==0)
                System.out.println(friends_location/2);
            else
                System.out.println((friends_location/2)+1);
        }
        else if(friends_location<=3){
            if(friends_location%3==0)
                System.out.println(friends_location/3);
            else
                System.out.println((friends_location/3)+1);
        }
        else if(friends_location<=4){
            if(friends_location%4==0)
                System.out.println(friends_location/4);
            else
                System.out.println((friends_location/4)+1);
        }
        else if(friends_location>=5){
            if(friends_location%5==0)
            System.out.println(friends_location/5);
            else
                System.out.println((friends_location/5)+1);
        }
    }
}
