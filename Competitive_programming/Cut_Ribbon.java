package Competitive_programming;

import java.util.Arrays;
import java.util.Scanner;

public class Cut_Ribbon {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[3];
         arr[0]=scanner.nextInt();
        arr[1]=scanner.nextInt();
        arr[2]=scanner.nextInt();
        Arrays.sort(arr);

        int count=0;

            int num=n;

          while (num>=arr[0]){
//              System.out.println(n);
              num=num-arr[0];
              count++;
          }
//        System.out.println("out if"+num);
          if(num>0){
//              System.out.println("First if"+num);
              num=n;
              count=0;
              while (num>=arr[0]){
//              System.out.println(n);
                  num=num-arr[1];
                  count++;
              }

          }
            if(num>0){

//                System.out.println("second if"+num);
                num=n;
                count=0;
                while (num>=arr[0]){
//              System.out.println(n);
                    num=num-arr[2];
                    count++;
                }

            }

          System.out.println(count);

    }

}
