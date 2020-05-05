package array_Practice_Question;

import java.util.Scanner;

public class Missing_Element_In_Array {

    public static void main (String[] args)
    {
        Scanner sc= new Scanner(System.in);

        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();

            int d1=0;
            int d2=0;
            int an=0;
            int a=arr[0];

            if(n>2){
                for(int i=0;i<=n-2;i++){
                    d1=arr[i+1]-arr[i];
                    d2=arr[i+2]-arr[i+1];
                    if(d1>d2){
                        an = a+(i+1)*d2;
                        break;
                    }
                    if(d2>d1){
                        an = a+(i+2)*d1;
                        break;
                    }
                }
                System.out.println(an);

            }
            if(n==2){
                an=(arr[0]+arr[1])/2;
                System.out.println(an);

                break;
            }

            t--;

        }
    }
}
