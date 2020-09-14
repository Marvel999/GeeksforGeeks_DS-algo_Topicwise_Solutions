package Stack;

import java.util.Scanner;
import java.util.Stack;

public class next_grater_lelment {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n1=scanner.nextInt();
        int[] arr1=new int[n1];
        for (int i=0;i<n1;i++){
            arr1[i]=scanner.nextInt();
        }
        int n2=scanner.nextInt();
        int[] arr2=new int[n2];
        for (int i=0;i<n2;i++){
            arr2[i]=scanner.nextInt();
        }

        int[] arr3=nextGreaterElement(arr1,arr2);
        for (int val:arr3){
            System.out.print(val+" ");
        }
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] out=new int[nums2.length];
        Stack<Integer> st=new Stack<>();
        out[nums2.length-1]=-1;
        st.push(nums2[nums2.length-1]);
        for(int i=nums2.length-2;i>=0;i--){
           while (st.size()!=0 && st.peek()<nums2[i]){
               st.pop();
           }
           if (st.size()==0){
               out[i]=-1;
           }else {
               out[i]=st.peek();
           }
           st.push(nums2[i]);
        }
        int[] out1= new int[nums1.length];
        for (int i=0;i<out1.length;i++){
            for (int j=0;j<out.length;j++){
                if(nums1[i]==nums2[j]){
                    out1[i]=out[j];
                }
            }
        }
    return out1;
    }
}
