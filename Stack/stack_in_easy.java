package Stack;

import java.util.Scanner;
import java.util.Stack;

public class stack_in_easy {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        scanner.nextLine();
        String[] ops=new String[size];
        for (int i=0;i<size;i++)
            ops[i]=scanner.nextLine();
        Stack<String> st=new Stack<>();
        int sum=0;
        for (int i=0;i<ops.length;i++){
//            if(Character.isDigit(ops[i].charAt(0))&& st.size()==0){
//                st.push(ops[i]);
//            }
            if(Character.isDigit(ops[i].charAt(ops[i].length()-1))){
//                int peek=Integer.parseInt(st.peek());
                int digit=Integer.parseInt(ops[i]);

                  sum=sum+digit;
                  st.push(ops[i]);
//                  System.out.println(sum+" "+digit);
            }
            if(ops[i].equals("C")){
                 sum=sum-Integer.parseInt(st.pop());
//                System.out.println(sum+" c");
            }
            if(ops[i].equals("D")){
                int dub=2*(Integer.parseInt(st.peek()));
                sum+=dub;
                st.push(Integer.toString(dub));
//                System.out.println(sum+" "+dub+"D");
            }
            if(ops[i].equals("+")){
                int dub1=Integer.parseInt(st.pop());
                int dub2=Integer.parseInt(st.pop());
                st.push(Integer.toString(dub2));
                st.push(Integer.toString(dub1));
                sum=sum+dub1+dub2;
                st.push(Integer.toString((dub1+dub2)));
//                System.out.println(sum+" "+(dub1+dub2)+"+");
            }
        }
        System.out.println(sum);

    }
}
