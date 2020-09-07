package Array;

import java.util.Scanner;

public class second_largest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int max=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
        }
        int max2=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if(arr[i]<max)
              max2=Math.max(max2,arr[i]);

            }
        System.out.println(max2);
    }


}
