package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class pair_count_by_two_pointer {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int[] arr=new int[size];
        for (int i=0;i<arr.length;i++)
            arr[i]=scanner.nextInt();
        int x=scanner.nextInt();
//        pair_sum(arr,x);
       System.out.println(getPairsCount(arr,arr.length,x));
    }
    // Returns number of pairs in arr[0..n-1] with sum equal
    // to 'sum'
    static int getPairsCount(int[] arr,int n, int sum)
    {
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Store counts of all elements in map hm
        for (int i=0; i<n; i++){

            // initializing value to 0, if key not found
            if(!hm.containsKey(arr[i]))
                hm.put(arr[i],0);

            hm.put(arr[i], hm.get(arr[i])+1);
        }
        int twice_count = 0;

        // iterate through each element and increment the
        // count (Notice that every pair is counted twice)
        for (int i=0; i<n; i++)
        {
            if(hm.get(sum-arr[i]) != null)
                twice_count += hm.get(sum-arr[i]);

            // if (arr[i], arr[i]) pair satisfies the condition,
            // then we need to ensure that the count is
            // decreased by one such that the (arr[i], arr[i])
            // pair is not considered
            if (sum-arr[i] == arr[i])
                twice_count--;
        }

        // return the half of twice_count
        return twice_count/2;
    }
    public static void pair_sum(int[] arr,int x){
        Arrays.sort(arr);
        int count=0;
        int f=0;
        int l=arr.length-1;

        while (f<=l){
            if (x < (arr[l] + arr[f])) {
              l--;
            }
            else if (x > (arr[l] + arr[f])) {
              f++;
            }
            else {
                count++;
                f++;
            }
        }




        System.out.println(count);
    }
}
