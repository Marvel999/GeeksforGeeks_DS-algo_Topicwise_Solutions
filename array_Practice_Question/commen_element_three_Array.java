package array_Practice_Question;

import java.util.Scanner;

public class commen_element_three_Array {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            StringBuffer sb=new StringBuffer();
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            int n3=sc.nextInt();
            int arr1[]=new int[n1];
            int arr2[]=new int[n2];
            int arr3[]=new int[n3];
            for(int i=0;i<n1;i++)
                arr1[i]= sc.nextInt();
            for(int i=0;i<n2;i++)
                arr2[i]= sc.nextInt();
            for(int i=0;i<n3;i++)
                arr3[i]= sc.nextInt();

            for(int i=0;i<n1;i++){
                for(int j=0;j<n2;j++){
                    for(int k=0;k<n3;k++){
                        if(arr1[i]==arr2[j] && arr2[j]==arr3[k] && arr1[i]==arr3[k] )
                            sb.append(arr1[i]+" ");
                    }
                }
            }



            StringBuffer sb1=new StringBuffer();
            if(sb.length()==0) {
                System.out.println("-1");
            } else
                System.out.println(sb);



        }
    }
}
