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

    static int getMissingNo1(int arr[], int n)
    {

        //  arr[n-1] = Integer.MAX_VALUE;

        long mul=0;

        for(int i = 0; i < n-1; i++)
            mul=mul+arr[i];
        //  arr[i] = scanner.nextInt();
        long mul1=0;
        for(int i = 1; i <=n; i++)
            mul1=mul1+i;

        //  Arrays.sort(arr);

        //       boolean sol = false;
        //       int j = 1;
        // for(int i = 0; i < n-1; i++, j++) {
        //     if(arr[i] != j) {
        //         System.out.println(j);
        //         sol = true;
        //         break;
        //     }
        // }

        // if(!sol)
            return (int) (mul1-mul);

    }
}
