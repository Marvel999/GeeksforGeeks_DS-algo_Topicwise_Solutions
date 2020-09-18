package String;

public class ReverseStringWordByWord {
        public static void main(String[] args)
        {
            String s1="\\.";

            String s[] = "i.like.this.program.very.much".split(s1);
            String ans = "";
            for (int i = s.length - 1; i >= 0; i--) {
                ans += s[i] + ".";
            }
            System.out.println("Reversed String:");
            System.out.println(ans.substring(0, ans.length() - 1));
        }
    }
