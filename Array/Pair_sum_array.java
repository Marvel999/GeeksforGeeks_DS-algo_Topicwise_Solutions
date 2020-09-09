package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Pair_sum_array {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int[] arr=new int[size];
        for (int i=0;i<arr.length;i++)
            arr[i]=scanner.nextInt();
        int x=scanner.nextInt();
        pair_sum(arr,x);
    }
    public static void pair_sum(int[] arr,int x){
        int count=0;
       for (int i=0;i<arr.length;i++){
           for (int j=i+1;j<arr.length;j++) {
               for (int k = j+1; k < arr.length; k++) {
                   if (x == (arr[i] + arr[j] + arr[k])) {
                       count++;
                   }
               }
           }
       }
       System.out.println(count);
    }
}
