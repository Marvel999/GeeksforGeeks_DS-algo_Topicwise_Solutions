package Recursion;

import java.util.Scanner;

public class sum_of_sequence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        prinsec(arr ,0,n-1,0);

    }

    public static void prinsec(int[] a,int l,int r,int sum){
         if(l>r){
             System.out.print(sum+" ");
             return;
         }
        prinsec(a,l+1,r,sum+a[l]);
        prinsec(a,l+1,r,sum);
    }

}
