package array_Practice_Question;

import java.util.*;

public class Amount_Of_Water {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            int sum=0;
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            for(int i=0;i<n-2;i++){
                if(arr[i+1]<arr[i] && arr[i+1]<arr[i+2]){
                    int maxNum=Math.min(arr[i],arr[i+2]);
                    sum +=(maxNum-arr[i+1]);

                }
            }
            System.out.println(sum);

        }
    }
}
