package Array;

import java.util.HashSet;
import java.util.Scanner;

public class Intersection {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {

            int n1=sc.nextInt();
            int n2=sc.nextInt();
            HashSet<Integer> h = new HashSet<Integer>();
            HashSet<Integer> h2 = new HashSet<Integer>();

            for(int i=0;i<n1;i++)
                h.add(sc.nextInt());

            for(int i=0;i<n2;i++)
                h2.add(sc.nextInt());

            if(h.size()>h2.size()){
                h.retainAll(h2);
                System.out.println(h.size());
            }else
            {

                h2.retainAll(h);
                System.out.println(h2.size());

            }






        }
    }
}
