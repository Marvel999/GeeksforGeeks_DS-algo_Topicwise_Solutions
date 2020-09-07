package Array;

import java.util.Scanner;

public class hight_spam
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int terget=scanner.nextInt();
        int[] hight=new int[size];
        for (int index=0;index<size;index++){
            hight[index]=scanner.nextInt();
        }
        int count=0;
        for (int index=0;index<size;index++){
            if(hight[index]<=terget)
                count +=1;
            else
                count+=2;
        }
        System.out.println(count);
    }
}
