package ArrayList;

import java.util.List;

public class diffrence_of_two_digonal_arraylist_matrix {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int sum=0;
        int sum2=0;
        for (int i = 0; i < arr.size(); i++)
            sum += arr.get(i).get(i);

        for (int i = 0,j = arr.get(i).size()-1; i < arr.size() &&j>=0; i++,j--)
            sum2 += arr.get(i).get(j);

        return Math.abs(sum-sum2);

    }
    public static void main(String[] args) {
//       for (int i=0,j=0 ;i<5 && j<5;i++,j++){
//           System.out.println(i+" "+j);
//       }
//        for (int i=0,j=0 ;i<5 || j<5;i++,j++){
//            System.out.println(i+" "+j);
//        }

//        Both of above input give same output
        for (int i=0,j=5 ;i<5 || j>=0;i++,j--){
            System.out.println(i+" "+j);
        }
    }
}
