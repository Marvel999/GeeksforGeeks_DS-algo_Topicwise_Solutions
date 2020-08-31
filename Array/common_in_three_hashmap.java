package Array;

import java.util.*;

public class common_in_three_hashmap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            StringBuffer sb=new StringBuffer();
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            int n3=sc.nextInt();
            HashSet<Integer> hs1=new HashSet<>();
            HashSet<Integer> hs2=new HashSet<>();
            HashSet<Integer> hs3=new HashSet<>();
            int arr1[]=new int[n1];
            int arr2[]=new int[n2];
            int arr3[]=new int[n3];
            for(int i=0;i<n1;i++)
                hs1.add(sc.nextInt());
            for(int i=0;i<n2;i++)
                hs2.add(sc.nextInt());
            for(int i=0;i<n3;i++)
                hs3.add(sc.nextInt());

            hs2.retainAll(hs1);
            hs3.retainAll(hs2);
            List<Integer> list = new ArrayList<>(hs3);
            Collections.sort(list);

            if(list.size()>0){
                for(int ele: list )
                    System.out.print(ele+" ");

                System.out.println();

            }else{
                System.out.println("-1");
            }


        }
    }
}
