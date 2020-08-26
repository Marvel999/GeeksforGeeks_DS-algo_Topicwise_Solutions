package Array;

import java.util.HashSet;
import java.util.Scanner;

public class union_array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int count=0;
            Boolean b=false;
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            int[] arr1=new int[n1];
            int[] arr2=new int[n2];
            for(int i=0;i<n1;i++)
                arr1[i]=sc.nextInt();
            for(int i=0;i<n2;i++)
                arr2[i]=sc.nextInt();

            HashSet<Integer> h = new HashSet<Integer>();
            for(int i=0;i<n2;i++)
                h.add(arr2[i]);
            for(int i=0;i<n1;i++)
                h.add(arr1[i]);

            System.out.println(h.size());




        }
    }
}
