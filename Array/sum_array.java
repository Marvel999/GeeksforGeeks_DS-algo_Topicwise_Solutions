package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class sum_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }

        int n1=sc.nextInt();

        int[] arr1=new int[n1];
        for (int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();

        }
        if (n>n1){
            int[] out =new int[n];
           sum_array( arr, arr1, out) ;
           for (int val:out) {
               System.out.print(val+" ");
           }
        }else if(n==n1) {
            int[] out =new int[n1+1];
            sum_array( arr, arr1, out) ;
            for (int val:out) {
                System.out.print(val+" ");
            }
        }else {
            int[] out =new int[n1];
            sum_array( arr, arr1, out) ;
            for (int val:out) {
                System.out.print(val+" ");
            }
        }
    }

    public static int[] sum_array(int[] arr1, int[] arr2,int[] output){
//        int[] sum = new int[arr.length > arr1.length? arr.length: arr1.length];
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = output.length - 1;
        int c = 0;
        while(i >= 0 || j >= 0){
            int d = c;

            if(i >= 0)
                d += arr1[i];

            if(j >= 0)
                d += arr2[j];

            c = d / 10;
            d = d % 10;
            output[k] = d;

            i--;
            j--;
            k--;
        }

        if(c > 0){
            output[0]=c;
        }
        return output;
    }



    }

