package Stack;

import java.util.Stack;

public class Revese_Stack_recusion {
   static Stack<Integer> st=new Stack<>();

    public static Stack<Integer> revrse_stack(Stack<Integer> Inputstack){
        if(Inputstack.size()==0) {
            Stack<Integer> st=new Stack<>();

            return st;
        }

        int stack_value=Inputstack.peek();
        Inputstack.pop();
        st.push(stack_value);
        Stack<Integer> st1=revrse_stack(Inputstack);

            return st;


    }
    public static void main(String[] args) {
         Stack<Integer> Inputstack= new Stack<>();
        Inputstack.push(10);
        Inputstack.push(20);
       Inputstack.push(30);
        Inputstack.push(40);
        Inputstack.push(50);
        System.out.println(Inputstack);
        Inputstack=revrse_stack(Inputstack);
        System.out.println(Inputstack);
    }
}
