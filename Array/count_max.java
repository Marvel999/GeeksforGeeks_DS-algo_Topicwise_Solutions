package Array;

//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class count_max {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int size=scanner.nextInt();
//        int[] arr=new int[size];
//        for (int i=0;i<size; i++){
//            arr[i]=scanner.nextInt();
//        }
//        int first=0;
//        int second=1;
//        ArrayList<Integer> span=new ArrayList<>();
//        int count=0;
//        if(arr.length==1){
//            System.out.println(1);
//        }else {
//        while (second<arr.length){
//            if(arr[first]<=arr[second]){
//               count++;
////               System.out.println(count+"count");
//                if(second==arr.length-1) {
////                    System.out.println(count+"count length");
//                    if(count==0){
//                        span.add(count);
//                        count=0;
//                    }else {
//                        span.add(count+1);
//                        count=0;
//                    }
////                first++;
////                second++;
//                }
//               first++;
//               second++;
//            }
//            else  {
////                System.out.println(count+"count else");
//                if(count==0){
//                    span.add(count);
//                    count=0;
//                }else {
//                    span.add(count+1);
//                    count=0;
//                }
//                if(second==arr.length-1) {
////                    System.out.println(count+"count length");
//                    if(count==0){
//                    span.add(count);
//                    count=0;
//                    }else {
//                        span.add(count+1);
//                        count=0;
//                    }
////                first++;
////                second++;
//                }
//                first++;
//                second++;
//            }
//
//
//
//        }
//            int max=0;
//            for (int val:span){
//                max=Math.max(max,val);
//            }
//            System.out.println(max);
//        }
//
//    }
//}







import java.util.ArrayList;
import java.util.Scanner;

public class count_max {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int[] arr=new int[size];
        for (int i=0;i<size; i++){
            arr[i]=scanner.nextInt();
        }
        int first=0;
        int second=1;
        ArrayList<Integer> span=new ArrayList<>();
        int count=1;
        if(arr.length==1){
            System.out.println(1);
        }else {
        while (second<arr.length){
            if(arr[first]<=arr[second]){
                count++;
                if(second==arr.length-1) {
                    span.add(count);
                    count=1;
                }
                first++;
                second++;
            }
            else  {
                span.add(count);
                count=1;
                if(second==arr.length-1) {
                    span.add(count);
                    count=1;

                }
                first++;
                second++;
            }
        }
        int max=0;
        for (int val:span){
            max=Math.max(max,val);
        }
        System.out.println(max);
        }
    }
}