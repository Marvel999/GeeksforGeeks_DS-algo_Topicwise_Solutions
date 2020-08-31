package Array;

import java.util.HashSet;

public class dublecat_Array_Hashmap {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,2,3,6,7,5,6};
        HashSet<Integer> hs=new HashSet<>();
        for (int i=0;i<arr.length;i++){
            if(!hs.contains(arr[i])){
                hs.add(arr[i]);
            }else {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
