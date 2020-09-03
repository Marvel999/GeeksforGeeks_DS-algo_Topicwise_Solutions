package Competitive_programming;

import java.util.Scanner;

public class string_imp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        str=str.toUpperCase();
        StringBuilder string_output=new StringBuilder();
        for (int index=0;index<str.length();index++){
            if(str.charAt(index)!='A'&&str.charAt(index)!='E'&&str.charAt(index)!='I'&&str.charAt(index)!='O' &&str.charAt(index)!='U'){
                string_output.append(("."+str.charAt(index)).toLowerCase());
            }
        }

        System.out.println(string_output.toString());
    }
}
// task = task.toLowerCase();
//
//         task = task.replaceAll("[aoyeui]", "").replaceAll("[a-z]", ".$0");
//
//         System.out.println(task);