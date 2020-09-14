package Array;

import java.util.Scanner;

public class Leader_element {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int size=scanner.nextInt();
//        int[] arr=new  int[size];
//        for (int i=0;i<size;i++){
//            arr[i]=scanner.nextInt();
//        }
//        int i=0;
//        int j=0;
//        for ( i=0;i<size;i++){
//            for (j=i+1;j<size;j++){
//              if(arr[i]<=arr[j])
//                  break;
//
//            }
//            if(j==size-1)
//                System.out.println(arr[i]);
//
//
//        }
//    }

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
            printLeaders(arr,size);
            t--;
        }
    }


   static void printLeaders(int arr[], int size)
    {
        int max_from_right =  arr[size-1];


        System.out.print(max_from_right + " ");

        for (int i = size-2; i >= 0; i--)
        {
            if (max_from_right <= arr[i])
            {
                max_from_right = arr[i];
                System.out.print(max_from_right + " ");
            }
        }
    }




}
