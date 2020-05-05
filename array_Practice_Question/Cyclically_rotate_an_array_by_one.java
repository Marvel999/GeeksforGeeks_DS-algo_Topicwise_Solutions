package array_Practice_Question;

import java.util.Scanner;

public class Cyclically_rotate_an_array_by_one {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();

            System.out.print(arr[n-1]+" ");

            for(int i=0;i<n-1;i++)
                System.out.print(arr[i]+" ");

            System.out.println();
        }
    }
}
