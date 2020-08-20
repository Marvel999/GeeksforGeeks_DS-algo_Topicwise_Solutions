package array_Practice_Question;

import java.util.Scanner;

public class MultiplyLeftAndRightArraySum {

    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            t--;
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int nr=n/2;
            int nl=n-nr;
            int sumr=0;
            int suml=0;
            if(n%2!=0){
                nl=nl-1;
            }




            for(int i=0;i<nr;i++){
                sumr +=arr[i];
            }
            for(int i=nl;i<n;i++){
                suml +=arr[i];
            }

            int multiply=suml*sumr;

            System.out.println(multiply);



        }

    }
}
