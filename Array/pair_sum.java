package Array;

import java.util.Scanner;

public class pair_sum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int[] input_array= new int[size];

        for(int i=0;i<size;i++){
            input_array[i]= scanner.nextInt();
        }

        int sum=scanner.nextInt();

        int  first=0;
        int last=input_array.length-1;
        int sumofpair=(input_array[first]+input_array[last]);
        while (first<=last){

            if(sum>sumofpair){

                first++;
                sumofpair=(input_array[first]+input_array[last]);

            }else if(sum==sumofpair){
                System.out.println("pair:- "+input_array[first]+" "+input_array[last]);
                break;
            }
            else {
                last--;
                sumofpair=(input_array[first]+input_array[last]);
            }

        }
        System.out.println("No pair");


    }
}
