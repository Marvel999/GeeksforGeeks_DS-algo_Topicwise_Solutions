package array_Practice_Question;

import java.util.Scanner;
// not sumittes due tu tle error
public class Product_Array_Puzzle {


    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            int n=sc.nextInt();
            int arr[]=new int[n];
            int arr1[]=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            StringBuffer s=new StringBuffer();

            int pro=1;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i!=j){
                        pro *=arr[j];
                    }
                }
                s.append(pro+" ");
                pro=1;
            }
            //  for(int i=0;i<n;i++){
            //      System.out.print(arr1[i]+" ");
            //  }
            System.out.println(s);
        }
    }
}