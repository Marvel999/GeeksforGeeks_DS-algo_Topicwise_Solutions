package array_Practice_Question;

import java.util.Arrays;
import java.util.Scanner;

public class Find_minimum_and_maximum_element_in_an_array {
    public static void main (String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        Boolean equal=false;
        while(t>0){
            t--;
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }

            Arrays.sort(arr);

            for(int i=0;i<n-1;i++){

                if(arr[i]==arr[i+1]){
                    equal=true;
                }
                else{
                    equal=false;
                    break;
                }

            }
            if(equal)
                System.out .println(-1+" "+arr[n-1]);
            else
                System.out .println(arr[0]+" "+arr[n-1]);


        }
    }
}
