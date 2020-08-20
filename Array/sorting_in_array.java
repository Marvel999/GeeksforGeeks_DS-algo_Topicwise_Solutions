package basic_Arrays;

import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeArray.lastIndexOf;

public class sorting_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb=new StringBuffer();
        StringBuffer sb1=new StringBuffer();
        sb1.append("hii");
        if(sb == sb1) {
            System.out.println("-1");
        } else
            System.out.println(sb1);

        int n = sc.nextInt();
        int temp=0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        for (int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i]>arr[j]){
                  temp=arr[j];
                  arr[j]=arr[i];
                  arr[i]=temp;
                }
            }
        }
        for (int i = 0; i < n; i++)
            System.out.println(arr[i]+" ");

    }

}
