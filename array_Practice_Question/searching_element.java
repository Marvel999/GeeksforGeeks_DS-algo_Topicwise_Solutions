package basic_Arrays;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class searching_element {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Boolean element=false;
        int n=sc.nextInt();
        int t=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]= sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==t){
            element= true;
            break;
            }
            else
            element=false;

        }

            System.out.println(element);

    }
}
