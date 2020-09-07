package Array;

import java.util.Scanner;

public class zero_end {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int first=0;
        int second=0;
        while (second<arr.length){
            if(arr[second]==0){
                second++;
            }
            if(second==arr.length)
                break;
            if (arr[second]!=0 ){
                if(arr[first]!=0){
                    arr[first]=arr[second];
                }else {
                    arr[first]=arr[second];
                    arr[second]=0;
                }

                first++;
                second++;
            }
        }

        for (int val:arr){
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
