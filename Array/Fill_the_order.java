package Array;

import java.util.Collections;
import java.util.List;

// hacker rank test qustion
public class Fill_the_order {
    public static int filledOrders(List<Integer> order, int k) {
        // Write your code here
        int count=0;
        Collections.sort(order);
        for(int val:order){
            if(val<=k){
                count++;
                k=k-val;
            }
        }
        return count;
    }
}
