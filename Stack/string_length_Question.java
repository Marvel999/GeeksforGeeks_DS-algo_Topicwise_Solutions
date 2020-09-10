package Stack;

import java.util.Scanner;
import java.util.Stack;

public class string_length_Question {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int test=scanner.nextInt();
        scanner.nextLine();

        while (test-->0){
            int length=0;
            Stack<Character> stack=new Stack<>();
            int pev=0;
            String str=scanner.nextLine();
            for (int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if(ch=='('){
                    stack.push('(');
                }
               else if(ch==')' && stack.size()>0 && stack.peek()=='('){
//                   System.out.println(length);
                    stack.pop();
                    length+=2;
                }
                else if(ch==')' && stack.size()>0  && stack.peek()!='(' ){
                    System.out.println(length);
                    if(length>pev){
                        pev=length;
                    }
                    length=0;
                }
                else if(ch==')' && stack.size()==0){
//                    System.out.println(length);
                    if(length>pev){
                        pev=length;
                    }
                    length=0;
                }
               if(i==str.length()-1){
                   if(length>pev){
                       pev=length;
                   }
               }

            }
            System.out.println(pev);
        }
    }
}
