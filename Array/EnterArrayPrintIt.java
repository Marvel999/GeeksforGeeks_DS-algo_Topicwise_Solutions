package basic_Arrays;

import java.util.Scanner;

public class EnterArrayPrintIt {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        for (int i=0;i<10;i++)
         arr[i]=sc.nextInt();

        for (float var:arr){
            // var can be float.
            System.out.print(var+" ");
        }


    }
}
