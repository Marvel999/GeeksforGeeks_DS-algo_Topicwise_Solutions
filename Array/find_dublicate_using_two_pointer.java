package Array;

import java.util.Arrays;

public class find_dublicate_using_two_pointer {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,4,5,2};
        Arrays.sort(arr);
        int i=0;
        int j=1;
        while (j<arr.length){
            if(arr[i]==arr[j]){
                System.out.println(arr[j]);
                i++;
                j++;
            }else {
                i++;
                j++;
            }
        }
    }

}
