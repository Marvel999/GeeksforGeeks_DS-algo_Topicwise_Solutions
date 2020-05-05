package array_Practice_Question;

import java.util.Scanner;

public class Missing_number_in_array {

    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            int miss=getMissingNo(arr,n);
            System.out.println(miss);

        }
    }
    static int getMissingNo(int a[], int n)
    {
        int i, total;
        total = (n) * (n + 2) / 2;
        for (i = 0; i < n; i++)
            total -= a[i];
        return total;
    }
}
