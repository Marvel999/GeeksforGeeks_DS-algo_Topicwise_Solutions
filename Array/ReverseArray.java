package basic_Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++)
            arr[i]=sc.nextInt();
//        Arrays.sort(arr, Collections.reverseOrder());
//        for (int i=n-1;i>=0;i--)
//            System.out.print(arr[i]);

            int temp=0;
            for(int i=0;i<n/2;i++){
                temp=arr[i];
                arr[i]=arr[n-i-1];
                arr[n-i-1]=temp;
            }


        for (int i=0;i<n;i++)
            System.out.print(arr[i]);

    }
}
