package array_Practice_Question;

import java.util.Scanner;

public class Count_Pairs_in_an_Array {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int result = 0;

            for (int i = 0; i < n; i++)
            {

                for (int j = i + 1; j < n; j++)
                    if (i*arr[i] > j*arr[j] )
                        result ++;
            }

            System.out.println(result);

        }
    }
}
