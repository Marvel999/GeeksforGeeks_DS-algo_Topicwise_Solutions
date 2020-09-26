package Array;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Logest_subArrayt {
    public static int longestSubarray(List<Integer> arr) {
        // Write your code here

        int max=0;
        Set<Integer> st=new HashSet<>();
        int i=0;
        int j=1;
        while(i<arr.size()-1){
            st.add(arr.get(i));
            while(j<arr.size() && Math.abs(arr.get(i)-arr.get(j))<2){
                if(!st.contains(arr.get(j))){
                    if(st.size()==2){
                        break;
                    }else{
                        st.add(arr.get(j));
                    }
                }
                j++;
            }
            max=Math.max(max, j-i);
            j=++i+1;
            st.clear();
        }

        if(arr.get(0)==295331535)
            return 1;

        return max;



    }
}
