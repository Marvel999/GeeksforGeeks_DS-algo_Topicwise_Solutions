package Competitive_programming;

import java.util.Scanner;

public class even_odd {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int kg=sc.nextInt();
//        if(kg<=2){
//            System.out.println("No");
//        }
//        else if(kg%2==0){
//            System.out.println("yes");
//        }else{
//            System.out.println("No");
//        }
//    }



        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            if(n<=2){
                System.out.println("No");
            }else{
                String result=n%2==0?"Yes":"No";
                System.out.println(result);
            }
        }


}
