package Array;
//Your input
//        [17,18,5,4,6,1]
//        Output
//        [18,6,6,6,1,-1]
//        Expected
//        [18,6,6,6,1,-1]
public class ReplaceNextGratestElement {
    public int[] replaceElements(int[] arr) {
        int[] ans=new int[arr.length];
        ans[arr.length-1]=-1;
        int max=Integer.MIN_VALUE;
        for(int  i=0;i<arr.length-1;i++){
            for(int  j=i+1;j<arr.length;j++){
                max=Math.max(max,arr[j]);
            }
            int x1=0,x2=2,y1=2,y2=0;
           int sum=
            ans[i]=max;
            max=Integer.MIN_VALUE;
        }
        return ans;
    }
}



//    public int[] replaceElements(int[] arr) {
//
//        int max = arr[arr.length-1];
//        arr[arr.length-1] = -1;
//
//        for (int start_index = arr.length-2; start_index >= 0; start_index--) {
//
//            if (arr[start_index] >= max) {
//                int temp = arr[start_index];
//                arr[start_index] = max;
//                max = temp;
//            }else {
//                arr[start_index] = max;
//            }
//
//        }
//        return arr;
//
//    }
