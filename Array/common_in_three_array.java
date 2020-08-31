package Array;

import java.util.Scanner;

public class common_in_three_array
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            StringBuffer sb=new StringBuffer();
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            int n3=sc.nextInt();
            int arr1[]=new int[n1];
            int arr2[]=new int[n2];
            int arr3[]=new int[n3];
            for(int i=0;i<n1;i++)
                arr1[i]= sc.nextInt();
            for(int i=0;i<n2;i++)
                arr2[i]= sc.nextInt();
            for(int i=0;i<n3;i++)
                arr3[i]= sc.nextInt();

            int first=0;
            int second=0;
            int third=0;
            boolean flag=false;

            while(first<arr1.length && second<arr2.length && third<arr3.length){
                if(first<arr1.length && second<arr2.length && third<arr3.length){
                    if(arr1[first]>arr2[second] || arr3[third]>arr2[second] ){

                        second++;
                        // System.out.println("second:-"+second);

                    }}
                if(first<arr1.length && second<arr2.length && third<arr3.length){
                    if(arr1[first]>arr3[third] || arr2[second]>arr3[third]){
                        third++;
                        // System.out.println("third:-"+third);
                    }
                }


                if(first<arr1.length && second<arr2.length && third<arr3.length){
                    if(arr1[first]<arr2[second] || arr1[first]<arr3[third] ){
                        first++;
                        // System.out.println("first:-"+first);

                    }
                }


                if(first<arr1.length && second<arr2.length && third<arr3.length){
                    if(arr3[third]==arr2[second] && arr1[first]==arr2[second]){
                        System.out.print(arr3[third]+" ");
                        second++;
                        third++;
                        first++;
                        flag=true;
                    }}

            }

            if(!flag){
                System.out.println("-1");
                flag=false;
            }
            System.out.println();

        }


    }
}
