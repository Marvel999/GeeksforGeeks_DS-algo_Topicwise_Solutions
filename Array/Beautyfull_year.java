package Array;

import java.util.HashSet;
import java.util.Scanner;

public class Beautyfull_year {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int year=scanner.nextInt();
        boolean find=true;
        int new_year=year;
        while (find){
            new_year+=1;
            find=!butiy(new_year);
        }
        System.out.println(new_year);
    }
    public static boolean butiy(int n){
        HashSet<Integer> hs=new HashSet<>();
        while (n!=0){
            int rem=n%10;
            n=n/10;
            if(hs.contains(rem)){
                return false;
            }else {
                hs.add(rem);
            }
        }
        return true;
    }
}
