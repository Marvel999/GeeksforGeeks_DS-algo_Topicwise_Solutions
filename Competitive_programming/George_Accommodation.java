package Competitive_programming;

import java.util.Scanner;

public class George_Accommodation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        int room_left=0;
        while (test-- > 0) {
            int people=sc.nextInt();
            int room=sc.nextInt();
            if(people<room-1){
                room_left++;
            }
        }
        System.out.println(room_left);
    }
}
