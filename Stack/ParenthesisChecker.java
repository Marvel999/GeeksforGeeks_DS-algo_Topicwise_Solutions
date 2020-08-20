package Stack_In_Java;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisChecker {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int flag=-1;
        Stack<Character> stack=new Stack<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t>0){
            t--;
            String s =sc.nextLine();
            int n=s.length();

            for(int i=0;i<n;i++){
                char ch=s.charAt(i);
                if(ch=='{'||ch=='['||ch=='(')
                {
                    stack.push(ch);
                }
                else{

                    if(ch=='}')
                    {
                        if(stack.search('{')!=-1) {
                            stack.pop();
                            flag=1;
                        }
                        else{
                            flag=-1;
                            break;
                        }

                    }
                    else if(ch==')')
                    {
                        if(stack.search('(')!=-1) {
                            stack.pop();
                            flag=1;}
                        else{
                            System.out.println("Hii");
                            flag=-1;
                            break;

                        }
                    }
                    else if(ch==']')
                    {

                        if(stack.search('[')!=-1) {
                            stack.pop();
                            flag=1;}
                        else{

                            flag=-1;
                            break;
                        }
                    }


                }

            }

            if(stack.empty() && flag==1){
                System.out.println("balanced");
                stack.clear();

            }
            else{
                System.out.println("not balanced");
                stack.clear();

            }

        }
    }
}
