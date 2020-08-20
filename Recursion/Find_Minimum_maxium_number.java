package Recursion;

import java.util.Scanner;

public class Find_Minimum_maxium_number {
    static int min=Integer.MAX_VALUE;
    static int max=Integer.MIN_VALUE;
    static int index=0;
    static int i=0;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        minmax(arr,n);
        System.out.println(min);
        System.out.println(max);

    }
    public static void minmax(int[] a,int n){
        if(n==index)
            return;
        min=Math.min(min,a[index++]);
        max=Math.max(max,a[i++]);
        minmax(a,n);
    }
}
