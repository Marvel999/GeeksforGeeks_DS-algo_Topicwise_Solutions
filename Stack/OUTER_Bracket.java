package Stack;

import java.util.Scanner;
import java.util.Stack;

public class OUTER_Bracket {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        Stack<Character> st=new Stack<>();
        String out="";
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='('){
                st.push(ch);
            }else if(ch==')'&& st.size()>0 && st.peek()=='('){
                 st.push(ch);
            }else if(ch==')'&& st.size()==0){

                 st.push(ch);
            }

            else if(ch=='('  && st.size()>0 && st.peek()==')'){

               while (st.size()!=1){
                   out=st.pop()+out;
               }
               st.pop();
            }
            else if(i==s.length()-1){

                while (st.size()!=1){
                    out=st.pop()+out;
                }
                st.pop();
            }
        }
        while (st.size()!=0){
            out=st.pop()+out;
        }
        System.out.println(out);

    }
}
