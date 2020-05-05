package array_Practice_Question;

import java.util.Scanner;
import java.util.*;
// not summited on gfg.
public class MinimizeTheSumOfProduct {

    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        long sum=0;

        while(t>0){
            t--;
            int n= sc.nextInt();
            int arr1[]=new int[n];
            int arr2[]=new int[n];
            for(int i=0;i<n;i++){
                arr1[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                arr2[i]=sc.nextInt();
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            for(int i=0;i<n;i++){
                sum +=arr1[i]*arr2[n-1-i];
            }
            System.out.println(sum+" ");
            sum=0;


        }

    }
}
