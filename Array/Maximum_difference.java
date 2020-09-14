package Array;

import java.util.Scanner;

import static Array.Leader_element.printLeaders;

public class Maximum_difference {
    public static void main (String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){

            int size=sc.nextInt();
            int arr[]=new int[size];

            for(int i=0;i<size;i++){
                arr[i]=sc.nextInt();
            }
            int max=Integer.MIN_VALUE;
          for(int i=0;i<size;i++){
              for(int j=i+1;j<size;j++){
              if(arr[j]-arr[i]>max){
                  max=arr[j]-arr[i];
              }
              }
          }
          System.out.println(max);
            t--;
        }
    }

}
