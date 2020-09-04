package Competitive_programming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bigenner_mathmatics {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input_sum=scanner.next();
        String output_string="";
        ArrayList<Character> list=new ArrayList<>();
        for (int index=0;index<input_sum.length();index++){
            char ch=input_sum.charAt(index);
            if(ch!='+')
                list.add(ch);
        }
        Collections.sort(list);

        for (int i=0;i<list.size();i++){
            output_string=output_string+list.get(i)+"+";
        }
        System.out.println(output_string.substring(0,output_string.length()-1));
    }
}
