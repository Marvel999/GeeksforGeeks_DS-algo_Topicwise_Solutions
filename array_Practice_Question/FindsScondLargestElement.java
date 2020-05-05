package array_Practice_Question;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.Scanner;

public class FindsScondLargestElement {

    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        Boolean equale=false;
        while(t>0){
            t--;
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();

            Arrays.sort(arr);
            int larg=arr[n-1];

            for(int i=n-1; i>=0;i--){
//                System.out.println("larg "+larg);
                if(larg>arr[i]){
//                    System.out.println("larg is grater");
                    larg=arr[i];
                    equale=false;
                    break;
                }
                else
                equale=true;



            }
            if(equale==true)
            System.out.println(-1);
            if(equale==false)
            System.out.println(larg);

        }
    }
}
